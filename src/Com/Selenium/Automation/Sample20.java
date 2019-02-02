package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample20 {

	public static void main(String[] args) {
		// double click and context click
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\softwares\\\\\\\\java and eclipse testing\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		WebElement wbusr= driver.findElement(By.name("user_name"));
		wbusr.sendKeys("admin");
		Actions act= new Actions(driver);
		act.doubleClick(wbusr).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();;
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		//act.sendKeys(Keys.TAB.ENTER).perform();
        act.contextClick(wbusr).perform();
        act.sendKeys(wbusr, Keys.ARROW_DOWN).perform();
	}

}
