package Assert_Study;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_truestudy {
	  @Test
	  public void testing()
	  {
		  
		  boolean result=true;
		  
		  Assert.assertTrue(result, "Result is false");
	  }
}
