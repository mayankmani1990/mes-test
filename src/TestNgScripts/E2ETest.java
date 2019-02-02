package TestNgScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E2ETest {
  @Test
  public void end2End() {
	  Reporter.log("endtoend",true);
  }
}
