package Mouseaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickusingmouseactions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement homePageButton = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
		Thread.sleep(2000);
		// can use webelement method click();
		
		//using Actions classs--> how to click
		//1. create an object of ACtions Class and pass driver object
		Actions act= new Actions(driver);
		
		//2.use ACtions class object and call method call perform method--> click(WebElement target)
		//act.click(homePageButton).perform();//1st way to click
		//2nd way to click
		act.moveToElement(homePageButton).perform();
		Thread.sleep(2000);
		act.click().perform();
		
		
	
		
		
	}
	}


