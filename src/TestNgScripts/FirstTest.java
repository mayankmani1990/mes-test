package TestNgScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void m1() {
	  Reporter.log("Java script executer");
	  System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.irctc.co.in/nget/train-search");
		  try {
			  driver.findElement(By.xpath("//label[text()='E-CATERING']")).click();
		  }
		  catch (Throwable e) {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0, 100)");
		}
	  }
  }

