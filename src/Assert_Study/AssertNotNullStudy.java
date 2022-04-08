package Assert_Study;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNullStudy {
	@Test
	  public void f() {
		  
		  String a=null;
		  
		  Assert.assertNotNull(a, "a is null");
		  
	  }
}
