package Com.Selenium.Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\softwares\\\\java and eclipse testing\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/logout");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("usernameField")).sendKeys("dikhitbehera@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("9853477156");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("qsb-keyskill-sugg")).sendKeys("testing");
		List<WebElement>l= driver.findElements(By.xpath("//div[@class='Sbtn']"));
		for(WebElement ll:l) 
		{
			System.out.println(ll.getText());
		}
		
		
	}

}
