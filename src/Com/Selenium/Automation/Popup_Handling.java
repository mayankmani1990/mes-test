package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Handling {

	public static void main(String[] args) {
		// popup alert
System.setProperty("webdriver.chrome.driver","D:\\\\\\\\\\\\\\\\softwares\\\\\\\\\\\\\\\\java and eclipse testing\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DIKHIT/Desktop/Untitled1.html");
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alrt= driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();
		System.out.println();

	}

}
