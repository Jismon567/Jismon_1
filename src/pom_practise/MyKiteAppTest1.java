package pom_practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KiteusingPOM.Kiteloginpage;

public class MyKiteAppTest1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
        FileInputStream Myfile=new FileInputStream("G:\\Velocity notes\\Java Automation\\Chromedriver\\Zerodha.xlsx");		
		
		Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
//		String UN = MySheet.getRow(0).getCell(0).getStringCellValue();
//		String PWD = MySheet.getRow(0).getCell(1).getStringCellValue();
//		String PIN = MySheet.getRow(0).getCell(2).getStringCellValue();
		
		MyKiteloginPage login= new MyKiteloginPage(driver);
		login.EnteruserID1(MySheet.getRow(0).getCell(0).getStringCellValue());
		login.enterPassword1(MySheet.getRow(0).getCell(1).getStringCellValue());
		login.clickonloginbutton1();
		
		Thread.sleep(3000);
		MyKitepinpage pin=new MyKitepinpage(driver);
		pin.enterpin1(MySheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickoncontinuebutton1();
		
		Thread.sleep(3000);
		MyKitehomepage home=new MyKitehomepage(driver);
		home.validateUserID1(MySheet.getRow(0).getCell(0).getStringCellValue());
		home.logout1();
		
		Thread.sleep(2000);
		driver.close();
	
		
	}

}
