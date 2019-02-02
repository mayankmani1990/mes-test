package TestNGTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SmokeTest {
  @Test
  public void SmokeTesting() {
	  Reporter.log("SmokeTesting01",true);
  }
}
