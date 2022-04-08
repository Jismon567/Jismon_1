package Scroll_Position_Size;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class positiontest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
	//	driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//1.create object of point class, which will accept x and y cordinate 
				//(10,10)--> default value
				Point p= new Point(190, 500);
				
				//2. use set position pass object
				driver.manage().window().setPosition(p);
				//to get current position use getPosition
				System.out.println(driver.manage().window().getPosition());

			}

	}


