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

public class Sample16 {

	public static void main(String[] args) {
		// multiselect nce again
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\softwares\\\\\\\\java and eclipse testing\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		driver.get("file:///C:/Users/DIKHIT/Desktop/practice%20html%20files/Demo2d.html");
		Select sel = new Select(driver.findElement(By.tagName("select")));
		System.out.println(sel.isMultiple());
		
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.selectByIndex(0);
		System.out.println("*************");
		WebElement wb= sel.getFirstSelectedOption();
		System.out.println(wb.getText());
		List<WebElement> lwbasel= sel.getOptions();
		for(WebElement wb1:lwbasel) 
		{
			System.out.println(wb1.getText());
		}
		System.out.println("______________");
		List<WebElement> lwbasel1= sel.getAllSelectedOptions();
		for(WebElement wb2:lwbasel1) 
		{
		  System.out.println(wb2.getText());	
		}
		sel.deselectAll();
	}

}
