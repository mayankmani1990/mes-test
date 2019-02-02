package TestNGTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class New1Test {
  @Test(priority=2,invocationCount=10)
  public void createTest() {
	  Reporter.log("create test",true);
  }
  
  @Test(priority=3)
  public void editTest() {
	  Reporter.log("edit test",true);
	  
  }
  
  @Test(priority=1,invocationCount=20)
  public void deleteTest() {
	  Reporter.log("delete test", true);
	  
  }
}
