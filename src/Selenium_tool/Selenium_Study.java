package Selenium_tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.youtube.com/ " );
     Thread.sleep(2000);
     //driver.get("https://vctcpune.com/");
     //driver.close();
     driver.get("https://vctcpune.com/");// to enter url in browser or to open an application
     Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
//		
		Thread.sleep(2000);
//		
		//driver.close();// to close the current tab of the browser opened by Selenium tool.
//		
       driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.navigate().forward();
       Thread.sleep(2000);
       driver.navigate().refresh();
//		
//	
	driver.navigate().to("https://kite.zerodha.com/");
	System.out.println(driver.getTitle());
	String title =driver.getTitle();
System.out.println("URL is " + title);
System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//
//		String title = driver.getTitle();
//
//		System.out.println("Title of web page is " + title);

		System.out.println(driver.getCurrentUrl());

	}
	}


