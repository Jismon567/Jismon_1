package Selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxbySir {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
				
WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//step1: 1.	Identify list box to be handled and store it in reference variable
		WebElement listBox = driver.findElement(By.id("dropdown-class-example"));

		
		//step2:2.	Create an object of Select class which will accept WebElement as argument
		Select s= new Select(listBox);
		
		//step3:3.	By using one of the select class methods we can select values form list box like 
//		1. selectByVisibleText: selectByVisibleText(String arg0) 
//		2. selectByIndex: selectByIndex(int arg0) 
//		3. selectByValue: selectByValue(String arg0)
		Thread.sleep(2000);
		s.selectByVisibleText("Option3");
		Thread.sleep(2000);
		s.selectByVisibleText("Option1");
		Thread.sleep(2000);
		s.selectByValue("option2");
		
		
 
	}

	}


