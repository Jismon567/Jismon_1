package Webtablehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		for(int i=1;i<=11;i++) 
		{
		List<WebElement> tableheader = driver.findElements(By.xpath("//table[@id='product']//tr["+i+"]"));
		
		for(WebElement w:tableheader)
		{
			System.out.print("||");
			System.out.println(w.getText()+" ||");
		}
		
		
		
		}

		
		
	}
}
