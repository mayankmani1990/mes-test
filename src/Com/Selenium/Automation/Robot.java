package Com.Selenium.Automation;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Robot {

	public static void main(String[] args) throws Exception {
		// robot class file upload pop up
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://encodable.com/uploaddemo/");
		driver.findElement(By.id("uploadname1")).click();
		Thread.sleep(3000);
		String srcFileLocate ="C:\\Users\\DIKHIT\\Downloads\\Fresher ResumE dikhit.docx";
		StringSelection ss = new StringSelection(srcFileLocate);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		java.awt.Robot r = new java.awt.Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
	}

}
