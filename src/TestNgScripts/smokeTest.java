package TestNgScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class smokeTest {
  @Test(priority=2,dependsOnMethods= {"regressionTesting"})
  public void smokeTesting() {
	  Reporter.log("smokeTestcase-001",true);
  }
  @Test(priority=1,invocationCount=5)
  public void regressionTesting() {
	  Reporter.log("regressionTestcase-001",true);
  }
  @Test(priority=3)
  public void systemTesting() {
	  Reporter.log("systemTestcase-001",true);
  }
}
