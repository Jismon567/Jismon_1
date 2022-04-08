package Selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement showbutton = driver.findElement(By.id("show-textbox"));
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		hidebutton.click();
		Thread.sleep(1000);
		//showbutton.click();
		/*Thread.sleep(1000);
		textbox.sendKeys("Hello");
		Thread.sleep(1000);*/
		boolean result = textbox.isDisplayed();
		System.out.println("Result has been dissplayed "+result);
		if(result)
		{
			System.out.println("Result has been dissplayed "+result);
		}
		else {
			showbutton.click();
			Thread.sleep(1000);
			textbox.sendKeys("Hello");
			Thread.sleep(1000);
			boolean result1 = textbox.isDisplayed();
			System.out.println("Result has been dissplayed "+result1);
		}
	}

}
