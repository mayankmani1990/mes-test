package Com.Selenium.Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(5000);
		
		WebElement wbl= driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(wbl).perform();
		Thread.sleep(4000);
		WebElement wbl1 = driver.findElement(By.xpath("//a[@title='Vivo']"));
		act.moveToElement(wbl1).click().perform();
		WebElement wbl2 = driver.findElement(By.xpath("//a[@title='Vivo V5s Perfect Selfie (Matte Black, 64 GB)']"));
		act.click(wbl2).perform();
		Set <String> winId =driver.getWindowHandles();
		Iterator<String> it = winId.iterator();
		String ParentId= it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		driver.findElement(By.id("pincodeInputId")).sendKeys("560037");
		Thread.sleep(2000);
		driver.switchTo().window(ParentId);

	}

}
