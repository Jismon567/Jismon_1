package Selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Methods {

	public static void main(String[] args) throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://kite.zerodha.com/");
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']")).click();
				driver.findElement(By.id("userid")).sendKeys("Hello");
				Thread.sleep(2000);
				//driver.findElement(By.className("text-light forgot-link")).click();
				//driver.findElement(By.linkText("Forgot user ID or password?")).click();
				driver.findElement(By.partialLinkText("Forgot user")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("« Back to login")).click();
				//driver.findElement(By.xpath("//a[text()='Forgot user ID or password']")).click();
				//Thread.sleep(2000);
				//driver.findElement(By.xpath("//a[contains(text(),'or password?')]")).click();
				
			//xpath by contains-->	
				//a[contains(text(),'or password?')]
			//xpath by contains--> //a[contains(text(),'Forgot')]

			}

		

	}


