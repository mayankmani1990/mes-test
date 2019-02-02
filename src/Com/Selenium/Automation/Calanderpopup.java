package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calanderpopup {

	public static void main(String[] args) throws InterruptedException {
		// calender popup
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("depart_date")).click();
		while(true) 
		{
			try 
			{
				driver.findElement(By.xpath("//td[@data-month='3'and@data-year='2019']/a[text()='12']")).click();
				break;
			}
		catch (Exception e) {
			// TODO: handle exception
			driver.findElement(By.xpath("(//a[@title='Next'])[2]")).click();
		}
		}
		

	}

}
