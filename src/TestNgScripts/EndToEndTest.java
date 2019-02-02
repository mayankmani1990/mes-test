package TestNgScripts;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EndToEndTest {
  @Test 
  @Parameters({"browser","abc"})
  
  public void f(String browser, String abc) {
	  System.out.println("browser");
	  System.out.println("abc");
  }
}
