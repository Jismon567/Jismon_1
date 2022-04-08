package kiteAppUsingPOMandTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteusingPOMandDDF.KiteHomePage;
import KiteusingPOMandDDF.KiteLoginPage;
import KiteusingPOMandDDF.KitePinPage;

public class kiteAppUsingPOMandTestNGintestng {
    WebDriver driver;
    Sheet MySheet;
    KiteLoginPage1 login;
    KitePinPage1 pin;
    KiteHomePage1 home;
	@BeforeClass
	public void launchbrowser() throws EncryptedDocumentException, IOException {
System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();// created object of chrome options
		opt.addArguments("headless");// you are asking not to open browser 
		driver= new ChromeDriver(opt);
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
FileInputStream Myfile=new FileInputStream("G:\\Velocity notes\\Java Automation\\Chromedriver\\Zerodha.xlsx");		
		
		MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		login= new KiteLoginPage1(driver);
		pin= new KitePinPage1(driver);
		home= new KiteHomePage1(driver);
	}
		
		@BeforeMethod
		public void logintokiteapp() throws InterruptedException
		{
			String UN = MySheet.getRow(0).getCell(0).getStringCellValue();
			String PWD = MySheet.getRow(0).getCell(1).getStringCellValue();
			String PIN = MySheet.getRow(0).getCell(2).getStringCellValue();
			
			login.enterUserID(UN);
			login.enterPassword(PWD);
			login.clickOnLoginButton();
			//Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			
			pin.enterPin(PIN);
			pin.clickOnContinueButton();
			
		}
		
	
	@Test
  public void validateuserId1() throws InterruptedException 
	{
		String ExpectedUserID = MySheet.getRow(0).getCell(0).getStringCellValue();
		Reporter.log(ExpectedUserID,true);
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		String ActualuserID = home.getUserName();
		Reporter.log(ActualuserID,true);
		Assert.assertEquals(ActualuserID,ExpectedUserID, "Matching");
  }
	@AfterMethod
	public void logouttokiteapp() throws InterruptedException 
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		//Thread.sleep(4000);
		home.loggingout();
		
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}
}
