package Selenium_tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefoxtry {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "G:\\Velocity notes\\Java Automation\\Firefox(Geeko)\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
	//driver.findElement(By.id("autocomplete")).sendKeys("India");
	driver.manage().window().maximize();
  }
}
