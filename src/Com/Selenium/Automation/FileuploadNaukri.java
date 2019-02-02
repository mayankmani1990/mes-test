package Com.Selenium.Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileuploadNaukri {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// file upload on naukri
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("(//div[text()='Login'])[1]")).click();
		driver.findElement(By.id("usernameField")).sendKeys("dikhitbehera@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("9853477156");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'UPDATE')]")).click();
		driver.findElement(By.id("attachCV")).click();
		Thread.sleep(3000);
		String upf ="C:\\Users\\DIKHIT\\Desktop\\dikhit profile 2.8yrt.doc";
		StringSelection ss = new StringSelection(upf);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
