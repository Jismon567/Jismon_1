package kiteAppUsingPOMandTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage1 {
	//1.
	
			@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
			@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
			
			
			//2.
			
			public KiteHomePage1(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//3.
			
			public String getUserName()
			{
			
			
			String actualUserName = userID.getText();
			return actualUserName;
			
			
			
			}
			
			
			public void loggingout() throws InterruptedException
			{
				userID.click();
				Thread.sleep(1000);
				logOutButton.click();
			}
}
