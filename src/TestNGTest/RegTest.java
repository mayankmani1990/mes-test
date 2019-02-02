package TestNGTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegTest {
  @Test
  public void regressionTest() {
	  Reporter.log("RegressionTest001",true);
  }
}
