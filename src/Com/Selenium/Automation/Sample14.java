package Com.Selenium.Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample14 {

	public static void main(String[] args) {
		// get all  option
		System.setProperty("webdriver.chrome.driver", "D:\\\\softwares\\\\java and eclipse testing\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement year =	driver.findElement(By.id("year"));
	
	Select  yearDrop= new Select(year);
	System.out.println(yearDrop.isMultiple());
	
	List<WebElement> allYear= yearDrop.getOptions();
	boolean status = false;
	for(WebElement wb:allYear) 
	{
		if(wb.getText().equals("2018")) 
		{
			status =true;
			
		}
		}
		if(status)
         {
			System.out.println("element prestent");
         }
		else 
		{
			System.out.println("element not found");
		}
		
	}

	}


