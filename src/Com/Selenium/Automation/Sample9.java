package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample9 {

	public static void main(String[] args) {
		String exp="Couldn't find your Google Account";
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys("dikhitbehera");
		 driver.findElement(By.xpath("//span[text()='Next']")).click();
		 String act="Couldn't find your Google Account";
		
		 if(act.equals(exp))
		 {
			 System.out.println("verified");
		 }
		 else 
		 {
			 System.out.println("not verified");
		 }

	}

}
