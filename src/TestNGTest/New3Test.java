package TestNGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class New3Test {
  @Test(priority=0)
  public void CreateCustomer() {
	  Reporter.log("create customer",true);
  }
  @Test(priority=1)
  public void EditCustomer() {
	  Reporter.log("edit customer",true);
  }
  @Test(priority=2)
  public void DeleteCustomer() {
	  Reporter.log("delete customer",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("login",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("logout",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("launch browser",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("close browser",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("before tesr",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("after test",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("before suite",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("after suite",true);
  }

}
