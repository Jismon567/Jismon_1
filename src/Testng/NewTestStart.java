package Testng;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestStart {
  @Test(priority = -2)
  public void method1() {
	  System.out.println("Method1 Hello");
  }
  @Test(dependsOnMethods = {"method3"})
  public void method2() {
	  System.out.println("Method2 Hello");
  }
  @Test(timeOut = 1000)
  public void method3() throws InterruptedException {
	  Reporter.log("Method3 I m reporter",true);
	  Thread.sleep(2000);
  }
  @Test
  public void method4() {
	  Reporter.log("Method4 I m reporter",true);
  }
}
