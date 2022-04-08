package Selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsslectedSir {

	public static void main(String[] args) throws InterruptedException  {
	
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		//finding check box  and storing in ref variable
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
		//validating whether check box is selected or not
		boolean checkBox1Status = checkBox1.isSelected();
		//printing check box status
		
		System.out.println("checkBox 1 status is "+checkBox1Status);
		
		//selecting checkbox 1
		
		checkBox1.click();
		
		//checking check box status is selected or not
		
		boolean checkBox1Status1 = checkBox1.isSelected();
		
		//printing status after selecting checkbox
		
		System.out.println("Check box status is "+checkBox1Status1);
		
		driver.close();

	}


	}


