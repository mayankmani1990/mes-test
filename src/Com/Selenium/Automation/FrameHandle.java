package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		// frame handle
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("Javadoc")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("packageFrame");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Action']")).click();
	}

}
