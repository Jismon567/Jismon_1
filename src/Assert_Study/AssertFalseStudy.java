package Assert_Study;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseStudy {
	 @Test
	  public void Testing()
	  {
		  
		  boolean result=true;
		  
		  Assert.assertFalse(result,"result is true");
	  }
}
