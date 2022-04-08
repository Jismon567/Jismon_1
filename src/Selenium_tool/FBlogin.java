package Selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

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
		
		
		
		
		
		
		
//		driver.get("https://www.youtube.com/");
//		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Vineeta Singh's Story");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
//        Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//img[@id='img'][@src='https://i.ytimg.com/vi/HNnNgVG3-ds/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg=="
//				+ "&rs=AOn4CLABI1rypaNGZWzxOfL3e9SkUEHMKg']")).click();
		//driver.findElement(By.xpath(null)))
	    //driver.findElement(By.xpath("//div[@id='columns']")).click();
	}

}
