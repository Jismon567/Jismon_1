package pom_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class MyKitehomepage {

	@FindBy(xpath = "//span[@class='user-id']") private WebElement HomepageUserID1;
	@FindBy(xpath = "//a[@target='_self']")private WebElement Homepagelogout1;
	
	public MyKitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserID1(String un1)
	{
		String ExpecteduserID1 = un1;
		String ActualuserID1 = HomepageUserID1.getText();
		if (ActualuserID1.equals(ExpecteduserID1)) {
			System.out.println("UserID matching TC is passed ");
		}
		else 
			{
				System.out.println("UserID not matching TC is failed ");
			}
		
			
		}
	public void logout1() throws InterruptedException {
		HomepageUserID1.click();
		Thread.sleep(3000);
		Homepagelogout1.click();
		
	}
	}

