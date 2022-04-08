package Selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsdisplayedSir {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.name("show-hide"));
		boolean result = textBox.isDisplayed();
		System.out.println("TextBox button is displayed "+result);
		
		if(result)
		{
			System.out.print("text box is displayed, entering value");
			textBox.sendKeys("testing");
		}
		
		else {
			System.out.print("text box is not displayed, clicking on show button");
			driver.findElement(By.id("show-textbox")).click();
			boolean result1 = textBox.isDisplayed();
			System.out.println("Current status is "+result1);
			textBox.sendKeys("testingafter show/hide");
			
		}
		
	
	
	}
}
