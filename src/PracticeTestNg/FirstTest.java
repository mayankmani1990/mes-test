package PracticeTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest {
  @Test(priority=1,invocationCount=4)
  public void createTest() {
	  Reporter.log("create test",true);
  }
  @Test(priority=2,dependsOnMethods={"createTest"})
  public void editRest() {
	  Reporter.log("edit test",true);
  }
  @Test(priority=3)
  public void DeleteTest() {
	  Reporter.log("delete test",true);
  }
}
