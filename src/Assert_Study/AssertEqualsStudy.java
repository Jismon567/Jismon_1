package Assert_Study;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsStudy {
	@Test
	  public void AssertTest()
	  {
		  
		  String name="VCTC";
		  String name1="VCTC1";
		  
//		  if(name.equals(name1))
//		  {
//			  System.out.println("TC is paased");
//		  }
//		  
//		  else {
//			System.out.println("TC is failed");
//		}
		  
		 
		  Assert.assertEquals(name, name1,"String not macthing");
		  
		  
	  }
	
}
