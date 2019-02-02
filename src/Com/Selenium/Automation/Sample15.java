package Com.Selenium.Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample15 {

	public static void main(String[] args) {
		// multiple select dropdown
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\softwares\\\\\\\\java and eclipse testing\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DIKHIT/Desktop/practice%20html%20files/Demo2d.html");
		Select sel = new Select (driver.findElement(By.id("breakfast")));
		System.out.println(sel.isMultiple());
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.deselectByIndex(1);
		
		WebElement wb= sel.getFirstSelectedOption();
		
		System.out.println(wb.getText());
		System.out.println("**************");
	List<WebElement> lwb=	sel.getAllSelectedOptions();
	for(WebElement wb1:lwb) 
	{
	System.out.println(wb1.getText());	
	}


	}

}
