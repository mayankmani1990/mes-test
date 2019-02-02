package TestNgScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AutoItTest {
  @Test
  public void f() throws Throwable {
	  Reporter.log("aoto it testing on file download");
//	  FirefoxOptions options = new FirefoxOptions();
//	  options.setCapability("marionette", false);
	  System.setProperty("webdriver.gecko.driver","D:\\softwares\\java and eclipse testing\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  WebDriver driver= new FirefoxDriver();
	  driver.get("https://www.seleniumhq.org/download/");
	  driver.findElement(By.linkText("3.141.59")).click();
	  Thread.sleep(5000);
	  Runtime.getRuntime().exec("C:\\Users\\DIKHIT\\Desktop\\FirstAutoIt.exe");
	  
  }
}
