package SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
SoftAssert s= new SoftAssert();// created object of soft assert class
	
	
	@Test
  public void MyMethod() 
 {
	String a="Pune";
	String b="Pune1";
	
	s.assertNotNull(b,"b is  null");
	
	s.assertEquals(a, b,"a and b are not equal");

	
	
	
	
	s.assertAll();
		
  }
	
	
}
