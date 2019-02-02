package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample18 {

	
		public static void main(String[] args) throws InterruptedException {
			// mouse and key board operation
			System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\softwares\\\\\\\\java and eclipse testing\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("https://accounts.google.com/signin");
	        WebElement wb=  driver.findElement(By.id("identifierId"));
	        Actions act = new Actions(driver);
	        act.sendKeys("dikhitbehera").perform();
	        act.sendKeys(Keys.ENTER).perform();
	        Thread.sleep(2000);
	        WebElement wb1= driver.findElement(By.xpath("//content[text()='Welcome']"));
	        act.doubleClick(wb1).perform();
	        Thread.sleep(2000);
	        System.out.println(wb1.getText());
	        act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
	        Thread.sleep(2000);
	        WebElement wbpass = driver.findElement(By.name("password"));
	        act.click(wbpass);
	        act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
	        //act.sendKeys(Keys.chord(Keys.ALT.CONTROL.DELETE)).perform();

	}

}
