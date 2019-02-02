package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFrame {

	public static void main(String[] args) {
		// selenium website frame
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		driver.findElement(By.xpath("//a[@alt='Javadoc']")).click();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//tbody[tr[td[a[contains(text(),'com.thoughtworks.selenium')]]]]/descendant::a[1]")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='Action']")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
        
	}

}
