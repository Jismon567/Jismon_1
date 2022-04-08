package Selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxbyme {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[@role='button'][@data-testid='open-registration-form-button']")).click();
				Thread.sleep(2000);
				WebElement day = driver.findElement(By.id("day"));
				WebElement month = driver.findElement(By.id("month"));
				WebElement year = driver.findElement(By.id("year"));
				
				Select s=new Select(day);
				Select s1=new Select(month);
				Select s2=new Select(year);
				
				s.selectByVisibleText("26");
				Thread.sleep(2000);
				s1.selectByIndex(5);
				Thread.sleep(2000);
				s2.selectByValue("1995");
				Thread.sleep(2000);
				
				
	}

}
