package TestNGTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
  @Test
  public void f() {
	  Reporter.log("sampleTest001",true);
  }
}
