package Serial_Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Serial_parallel3 {
	@Test
	 public void method1() throws InterruptedException
	  {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");	
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
	  }
}
