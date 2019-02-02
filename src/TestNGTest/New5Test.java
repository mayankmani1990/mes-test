package TestNGTest;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class New5Test {
  @Test(dataProvider = "dp")
  public void f(String user, String pass) {
  }

  @DataProvider
  public Object[][] dp() {
    Object[][] data= new Object[2][2];
    data[0][0]="admin";
    data[0][1]="manager";
    data[1][0]="user";
    data[1][1]="pass";
    return data;
  }
}
