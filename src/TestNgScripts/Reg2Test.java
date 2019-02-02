package TestNgScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reg2Test {
  @Test(groups= {"regression"})
  public void f() {
	  Reporter.log("regressionTest",true);
  }
  
}
