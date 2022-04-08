package Selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jismon567");
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
		Thread.sleep(200);*/
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jismon_thaikkattil");
		//driver.findElement(By.xpath("//input[@name='password']")).clear();
		//Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("//img[@id='img'][@src='https://i.ytimg.com/vi/HNnNgVG3-ds/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg=="
				+ "&rs=AOn4CLABI1rypaNGZWzxOfL3e9SkUEHMKg']")).click();
		Thread.sleep(5000);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Vineeta Singh's Story");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(2000);*/
		
		/*driver.findElement(By.xpath("//img[@id='img'][@src='https://i.ytimg.com/vi/HNnNgVG3-ds/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg=="
				+ "&rs=AOn4CLABI1rypaNGZWzxOfL3e9SkUEHMKg']")).click();
		//driver.findElement(By.xpath(null)))
	    //driver.findElement(By.xpath("//div[@id='columns']")).click();*/
	}

}
