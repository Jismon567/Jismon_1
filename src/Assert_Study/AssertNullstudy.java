package Assert_Study;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullstudy {
	@Test
	  public void f() 
	  {
		  String a="VCTC";
		  
		  Assert.assertNull(a, "a is not null");
		  
		  System.out.println("hi all how are you");
		  
	  }
}
