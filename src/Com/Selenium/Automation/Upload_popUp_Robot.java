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


public class Upload_popUp_Robot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// handling file upload popup using robot class
		System.setProperty("webdriver.chrome.driver", "D:\\\\softwares\\\\java and eclipse testing\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://mail.google.com/mail");
		d.findElement(By.id("identifierId")).sendKeys("getdikhitranjan");
		d.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		d.findElement(By.name("password")).sendKeys("9853477156");
		d.findElement(By.xpath("//span[text()='Next']")).click();
	    d.findElement(By.xpath("//div[text()='Compose']")).click();
	    d.findElement( By.xpath("//div[@aria-label=\"Attach files\"]")).click();
	    
	    String file = "D:\\sample.txt";
	    
	    StringSelection ss = new StringSelection(file);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    Thread.sleep(2000);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	}

}
