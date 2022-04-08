package KiteusingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppTest {
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
		//WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Kiteloginpage login= new Kiteloginpage(driver);
		
		login.enterUserID();
		login.enterPassword();
		login.clickOnLoginButton();
		
		Thread.sleep(3000);
		KitePinPage pin= new KitePinPage(driver);
		pin.enterPin();
		pin.clickOnContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserID();
		home.logout();
		
		driver.close();
		}

}
