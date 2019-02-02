package TestNgScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Smoke2Test {
  @Test(groups= {"smoke"})
  public void f() {
	  Reporter.log("smokeTest",true);
  }
  @Test(groups= {"regression","smoke"})
  private void f1() {
	Reporter.log("smoke and regression test",true);
}
}
