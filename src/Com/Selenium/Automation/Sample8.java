package Com.Selenium.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("1234567");
		driver.findElement(By.name("pass")).sendKeys("123456");
		List <WebElement> lwb= driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement wb :lwb) 
		{
		wb.sendKeys("dummy");	
		}

	}

}
