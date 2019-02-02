package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) {
		// type 3 pop up handling
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DIKHIT/Desktop/Untitled3.html");
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();;
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.sendKeys("dikhit");
		alt.accept();

	}

}
