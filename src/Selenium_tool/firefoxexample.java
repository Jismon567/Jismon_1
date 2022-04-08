package Selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Velocity notes\\Java Automation\\Firefox(Geeko)\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
	//driver.findElement(By.id("autocomplete")).sendKeys("India");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	//switching selenium focus to frame

	driver.switchTo().frame("iframe-name");
	Thread.sleep(3000);
	//finding elements inside fram
	driver.findElement(By.xpath("//a[text()='About us']")).click();
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.youtube.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Vineeta Singh's Story");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//img[@id='img'][@src='https://i.ytimg.com/vi/HNnNgVG3-ds/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg=="
			+ "&rs=AOn4CLABI1rypaNGZWzxOfL3e9SkUEHMKg']")).click();
	
	Thread.sleep(15000);
	driver.findElement(By.xpath("//button[@title='Pause (k)']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().back();

	}
	}


