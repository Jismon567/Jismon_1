package Crossbrowser_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class CT1 {
	@Parameters("browserName")
		@Test
	  public void CrossBrowser(String browserName) throws InterruptedException 
	 {
		 WebDriver driver=null;
		 
		 if(browserName.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
				driver=new ChromeDriver();
		 }
		 
		 else if (browserName.equals("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver", "G:\\Velocity notes\\Java Automation\\Firefox(Geeko)\\geckodriver.exe");
				 driver=new FirefoxDriver();
		}
	  
		 driver.get("https://vctcpune.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 driver.close();
	 }
}
