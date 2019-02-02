package Com.Selenium.Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Atosuggest {

	public static void main(String[] args) {
		// autosuggest
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://redbus.in");
		driver.findElement(By.id("src")).sendKeys("ka");
//      WebDriverWait wait = new WebDriverWait(driver,10);
//      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='autoFill']/li[text()='Karur']"))).click();
		List<WebElement> lst = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		for(WebElement wbl:lst) 
		{
			System.out.println(wbl.getText());
		}
	}

}
