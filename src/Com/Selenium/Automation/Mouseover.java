package Com.Selenium.Automation;

import java.util.ResourceBundle.Control;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouseover {

	public static void main(String[] args) {
		// actions class
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		Actions act = new Actions(driver);
		WebElement wb= driver.findElement(By.name("firstname"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
		act.moveToElement(wb).perform();
		act.doubleClick(wb).perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[contains(text(),'Create')]"));
		act.moveToElement(wb2).perform();
		act.doubleClick(wb2).perform();
		act.clickAndHold(wb2);
		WebElement wb3=driver.findElement(By.name("firstname"));
		act.release(wb3).perform();
		act.sendKeys(wb3, "hhhhh").perform();
		act.doubleClick(wb3).perform();
		WebElement wb4 = driver.findElement(By.name("reg_email__"));
		act.moveToElement(wb4).release().perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		act.sendKeys(Keys.ENTER).perform();

	}

}
