package Selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframejayashri {
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
			
		        WebDriver driver=new ChromeDriver();
			
				driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
				//driver.findElement(By.id("autocomplete")).sendKeys("india");
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				//switching selenium focus to frame
			
				driver.switchTo().frame("iframe-name");
				Thread.sleep(3000);
				//finding elements inside fram
				driver.findElement(By.xpath("//a[text()='About us']")).click();
				Thread.sleep(2000);
}
}