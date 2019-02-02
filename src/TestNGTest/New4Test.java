package TestNGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class New4Test {
  @Test(dataProvider = "LoginData")
  public void f(String user, String pass) {
	  System.out.println(user);
	  System.out.println(pass);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] LoginData() {
	  Object [][] data = new Object[3][2];
	  data[0][0]= "admin";
	  data[0][1]="manager";
	  data[1][0]="user";
	  data[1][1]="pass";
	  data[2][0]="admin123";
	  data[2][1]="manager123";
	  return data;
    
    
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
