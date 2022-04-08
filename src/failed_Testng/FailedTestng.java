package failed_Testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTestng {
	 @Test
	  public void TC1() 
	  {
		
		  Reporter.log("Running TC1", true);
	  }
	  @Test
	  public void TC2() throws InterruptedException 
	  {
		  Thread.sleep(2000);
		  Reporter.log("Running TC2", true);
	  }
	  @Test
	  public void TC3() 
	  {
		  
		  Reporter.log("Running TC3", true);
	  }
	  @Test
	  public void TC4() throws InterruptedException 
	  {
		  Thread.sleep(2000);
		  Reporter.log("Running TC4", true);
	  }
	  @Test
	  public void TC5() 
	  {
		  Reporter.log("Running TC5", true);
	  }
}
