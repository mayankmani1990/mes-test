package TestNgScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JsExecTest {
  @Test
  public void f() throws Throwable {
	  Reporter.log("Java script executer");
	  System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.co.in/imghp?hl=en&tab=wi");
		  driver.findElement(By.name("q")).sendKeys("cars");
		  driver.findElement(By.xpath("//button[@type='button']/div/span")).click();
		  Thread.sleep(3000);
		while (true)
		  {
			 try 
			 {
				driver.findElement(By.xpath("//img[@src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMAgow0ivxrLlNAYoC0mMGL_ixS-alFk9ntOiYOBir1rAStVVsxQ']")).click();
				break;
			 }
			 catch (Exception e) {
				// jave script ececution code
              JavascriptExecutor js = (JavascriptExecutor)driver;//downcasting
              js.executeScript("window.scrollBy(0,700)");
				 
			}
		  }
  }
}
