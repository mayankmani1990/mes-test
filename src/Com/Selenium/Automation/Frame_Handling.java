package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handling {

	public static void main(String[] args) throws InterruptedException {
		// frame handling
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		Thread.sleep(3000);
		driver.findElement( By.xpath("//a[@alt='Javadoc']")).click();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.partialLinkText("com.thoughtworks.selenium")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Action")).click();
		driver.switchTo().defaultContent();
		

	}

}
