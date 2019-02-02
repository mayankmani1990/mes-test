package TestNGTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  Reporter.log("hi");
	  System.out.println("hi");
  }
  @Test
  public void f2() {
	  Reporter.log("hello");
	 System.out.println("Hello"); 
  }
}
