package Assert_Study;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertnotequals {
	 @Test
	  public void AssertTest1()
	  {
		  
		  String name="VCTC";
		  String name1="VCTC";
		  
	  Assert.assertNotEquals(name, name1, "Strings are matching");
	  
	  
	  
	  }
}
