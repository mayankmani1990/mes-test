package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample17 {

	public static void main(String[] args) throws InterruptedException {
		// mouse and key board operation
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\softwares\\\\\\\\java and eclipse testing\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/signin");
        driver.findElement(By.id("identifierId"));
        Actions act = new Actions(driver); 
        act.sendKeys("abcder").perform();//enter character
        act.sendKeys(Keys.ENTER).perform();// function operation
        Thread.sleep(2000);
        //concurrent key operation
           WebElement wb = driver.findElement(By.xpath("//content[text()='Welcome']"));
           act.doubleClick(wb);
           Thread.sleep(2000);
           act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();;
           WebElement wbp = driver.findElement(By.name("password"));
           act.click(wbp).perform();
           act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
	}

}
