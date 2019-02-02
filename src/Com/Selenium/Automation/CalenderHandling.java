package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) {
		// calender handling
		System.setProperty("webdriver.chrome.driver", "D:\\\\softwares\\\\java and eclipse testing\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();		
       
		while (true) {
		try 
        {
        	driver.findElement(By.xpath("//td[@data-month='2'and@data-year='2019']/a[text()='12']")).click();
        break;
        }
		
        catch (Exception e)
        {
        	driver.findElement(By.xpath("(//a[@title='Next'][1])[2]")).click();
        }
		}

	}

}
