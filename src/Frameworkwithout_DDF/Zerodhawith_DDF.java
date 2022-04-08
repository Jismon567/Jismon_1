package Frameworkwithout_DDF;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodhawith_DDF {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream Myfile=new FileInputStream("G:\\Velocity notes\\Java Automation\\Chromedriver\\Zerodha.xlsx");		
		
				Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
//				String userName = MySheet.getRow(1).getCell(0).getStringCellValue();
//				String password = MySheet.getRow(1).getCell(1).getStringCellValue();
//				String pin = MySheet.getRow(1).getCell(2).getStringCellValue();
				
				System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
					
				WebDriver driver= new ChromeDriver();
				
//				driver.get("https://kite.zerodha.com/");
//				driver.manage().window().maximize();
//				Thread.sleep(2000);
				int LastRownum = MySheet.getLastRowNum();
				System.out.println(LastRownum);
				 int Lastcellnum = MySheet.getRow(0).getLastCellNum()-1;
				System.out.println(Lastcellnum);
			for(int i=0;i<=LastRownum;i++)//0,0 0-1
				{Thread.sleep(2000);
					driver.get("https://kite.zerodha.com/");
					driver.manage().window().maximize();
					Thread.sleep(2000);
						String userName = MySheet.getRow(i).getCell(0).getStringCellValue();
						String password = MySheet.getRow(i).getCell(1).getStringCellValue();
						String pin = MySheet.getRow(i).getCell(2).getStringCellValue();
					
				driver.findElement(By.id("userid")).sendKeys(userName);// sending username
				
				driver.findElement(By.id("password")).sendKeys(password);//sending password
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();//clicking on login button
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("pin")).sendKeys(pin);// sending Pin
				driver.findElement(By.xpath("//button[@type='submit']")).click();//clicking on continue button
				
				Thread.sleep(2000);
				
				String expectedUserName = userName;
				
				WebElement UserName = driver.findElement(By.xpath("//span[@class='user-id']"));
				String actualUserName = UserName.getText();
				
				if(expectedUserName.equals(actualUserName))
				{
					System.out.println("User name is matching TC is passed");
				}
				
				else {
					System.out.println("User name is not matching TC is failed");
					
				}

				Thread.sleep(2000);
				UserName.click();// clicking on username
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@target='_self']")).click();//clicking on logout button
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@class='remove text-xxsmall']")).click();
//				driver.close();
				Thread.sleep(2000);
				}}
				
}
