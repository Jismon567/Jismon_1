package pom_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyKiteloginPage {

	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password")private WebElement pwd;
	@FindBy(xpath = "//button[@class=\"button-orange wide\"]")private WebElement loginbutton;
	
	//Step-II Create constructor
	public MyKiteloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnteruserID1(String username1)
	{
		userID.sendKeys(username1);
	}
	
	public void enterPassword1(String Password1)
	{
		pwd.sendKeys(Password1);
	}
	
	public void clickonloginbutton1()
	{
		loginbutton.click();
	}
}
