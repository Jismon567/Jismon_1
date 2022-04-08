package Multi_browser_use;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchstation implements Multipurpose {

	
     static WebDriver d;
	
	public void chromeinitiation() {
		System.setProperty(key1, value1);
		d=new ChromeDriver();
		d.navigate().to(url1);
	}


	public void firefoxinitiation() {
		System.setProperty(key2, value2);
		d=new FirefoxDriver();
		d.navigate().to(url2);

	}

}
