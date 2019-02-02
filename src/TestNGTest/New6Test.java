package TestNGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class New6Test {
WebDriver driver;	
  @Test
  public void VTiger() {
	  Reporter.log("login successful and u can create",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("login to app",true);
	  driver.findElement(By.name("user_name")).sendKeys("admin");
	  driver.findElement(By.name("user_password")).sendKeys("admin");
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("logout from app",true);
     driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();	  
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("launching browser",true);
	  System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("close browser",true);
	  driver.close();
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("before test",true);
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
	  Reporter.log("after test",true);
  }

}
