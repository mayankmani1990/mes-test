package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample13 {

	public static void main(String[] args) {
		// Dropdown handle
		System.setProperty("webdriver.chrome.driver", "D:\\\\softwares\\\\java and eclipse testing\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement day = driver.findElement(By.id("day"));
		Select DayDrop = new Select(day);
		WebElement month = driver.findElement(By.id("month"));
		Select MonthDrop = new Select(month);
		WebElement year = driver.findElement(By.id("year"));
		Select YearDrop = new Select(year);
		DayDrop.selectByIndex(2);
		MonthDrop.selectByValue("6");
		YearDrop.selectByVisibleText("2013");
	
	}

}
