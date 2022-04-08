package Webtablehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Velocity notes\\Java Automation\\Chromedriver\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		int columnSize = driver.findElements(By.xpath("//table[@id='product']//th")).size();

		System.out.println("Total number of columns are "+columnSize);
		
		int rowSize = driver.findElements(By.xpath("//table[@id='product']//tr")).size();
		System.out.println("Total number of rows  are "+rowSize);
		
		
		//outer loop--> for row
		for(int i=1;i<=rowSize;i++)//1
		{
			//inner for loop--> for columns
			for(int j=1;j<=columnSize;j++)//1
			{
				String text;
			if(i==1)//i=1,j=1-->i=1,j=2
			{
				text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();
				System.out.print(text+" ");
			}
				else {
					text=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text+" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	
	}

}
