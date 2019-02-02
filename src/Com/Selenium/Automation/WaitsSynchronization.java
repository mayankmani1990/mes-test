package Com.Selenium.Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsSynchronization {

	public static void main(String[] args) {
		// waits in selenium
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("hi and hello");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]"))).click();
		WebElement wbd = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day = new Select(wbd);
		day.selectByIndex(5);
		List<WebElement>wbdd= day.getOptions();
		for(WebElement daylist:wbdd) 
		{
			System.out.println(daylist.getText());
		}
		System.out.println(day.isMultiple());

	}

}
