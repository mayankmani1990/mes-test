package Com.Selenium.Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HDFVwindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// hdfc window handle
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> winId =driver.getWindowHandles();
		Iterator<String> it = winId.iterator();
		String parentID = it.next();
		String childID= it.next();
		driver.switchTo().window(childID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[4][a[text()='Continue to NetBanking']]")).click();
		Thread.sleep(3000);
		Set<String> winId2 = driver.getWindowHandles();
		Iterator<String> it2= winId2.iterator();
		String parentId1 = it2.next();
		String childId1  = it2.next();
		driver.switchTo().frame("login_page");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Credit Card Holders ']/a")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(childId1);
		driver.close();
		driver.switchTo().window(childID); 
		//driver.switchTo().window(parentID);
		
		
		
		
		
		

	}

}
