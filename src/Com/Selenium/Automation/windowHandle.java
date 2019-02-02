package Com.Selenium.Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {
		// window handle
		System.setProperty("webdriver.chrome.driver", "/automation_Selenium/Resources");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		driver.findElement(By.xpath("//div[div[h2[contains(text(),'Fire')]]]/descendant::div[4]/a[contains(text(),'Shop')]")).click();
		Thread.sleep(3000);
		Set<String> winId =driver.getWindowHandles();
		Iterator<String> it = winId.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parent);
		

	}

}
