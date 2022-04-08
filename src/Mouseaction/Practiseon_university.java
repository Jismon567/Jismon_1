package Mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practiseon_university {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		
		
		Thread.sleep(8000);
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.unipune.ac.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement register=driver.findElement(By.xpath("//span[@id='stUI42_txt']"));
		Actions act=new Actions(driver);
		act.moveToElement(register).build().perform();
		Thread.sleep(3000);
		//span[contains(text(),'Departments List')]
		//span[@id='stUI42_txt']
		//font[contains(text(),'Department of Electronic Science')]
		
		WebElement register2=driver.findElement(By.id("stUI109_txt"));
		Actions act2=new Actions(driver);
		act2.moveToElement(register2).build().perform();

	}

}
