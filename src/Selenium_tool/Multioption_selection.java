package Selenium_tool;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Multioption_selection {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		//driver.get("https://www.netflix.com/browse");
		driver.manage().window().maximize();
		
		
		Thread.sleep(8000);
		
		
		WebElement Selectbox = driver.findElement(By.id("cars"));
		Select s=new Select(Selectbox);
		boolean resultt = s.isMultiple();
	System.out.println("Result" +resultt);
	s.selectByValue("volvo");
	Thread.sleep(2000);
	s.selectByVisibleText("Saab");
	Thread.sleep(2000);
	s.selectByIndex(2);
	s.deselectByIndex(2);
	Thread.sleep(2000);
	s.deselectByValue("volvo");
	Thread.sleep(2000);
	s.deselectByVisibleText("Saab");
	
	File sause = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File desti = new File("G:\\Velocity notes\\Java Automation\\Selenium Screenshots\\Screenshot3.jpg");
	FileHandler.copy(sause, desti);
	}

}
