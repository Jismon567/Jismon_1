package Selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframebyme {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//a[@target='_blank'][@rel='noopener noreferrer'])[1]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//iframe[@id='courses-iframe']")).click();
//		Thread.sleep(2000);
	}

}
