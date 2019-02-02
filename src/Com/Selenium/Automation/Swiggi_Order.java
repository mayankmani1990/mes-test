package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggi_Order {

	public static void main(String[] args) throws InterruptedException {
		// order from swiggy
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\\\\\\\\\softwares\\\\\\\\\\\\\\\\java and eclipse testing\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.id("location")).sendKeys("marathalli");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'FIND FOOD')]")).click();

	}

}
