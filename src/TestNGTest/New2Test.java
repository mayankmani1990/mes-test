package TestNGTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class New2Test {
  @Test
  public void creteTest() {
	  Reporter.log("create test",true);
  }
  @Test(dependsOnMethods= {"creteTest"})
  public void editTest() {
	  Reporter.log("edit test",true);
  }
  @Test(dependsOnMethods= {"editTest"})
  public void cdeleteTest() {
	  Reporter.log("edit test",true);
  }
}
