package Multi_browser_use;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Execution_class extends Launchstation{

	public static void main(String[] args) throws InterruptedException {
		Launchstation p=new Launchstation();
		p.chromeinitiation();
		d.get("https://www.youtube.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='search']")).sendKeys("Izmir Marsi Ringtone | VIRAL BGM");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Izmir Marsi Ringtone | VIRAL BGM")).click();
		Thread.sleep(5000);
		
		System.out.println(d.manage().window().getSize());
		Dimension dt= new Dimension(500, 500);
		d.manage().window().setSize(dt);
		//Thread.sleep(3000);
		//d.close();
		
		//Thread.sleep(3000);
		
		p.firefoxinitiation();
		d.manage().window().maximize();
		Thread.sleep(3000);
		Dimension da= new Dimension(1000, 1000);
		d.manage().window().setSize(da);
		WebElement refElement = d.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView();",refElement);
		System.out.println(refElement.getText());
		Thread.sleep(3000);
		
		
		
		d.close();
	}

}
