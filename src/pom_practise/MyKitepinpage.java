package pom_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyKitepinpage {

	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@class=\"button-orange wide\"]") private WebElement Continuebutton1;
	
	
	//2. create constructor
	
	public MyKitepinpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin1(String realpin)
	{
		pin.sendKeys(realpin);
	}
	
	public void clickoncontinuebutton1()
	{
		Continuebutton1.click();
	}
}
