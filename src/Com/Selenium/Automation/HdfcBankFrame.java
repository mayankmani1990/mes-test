package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBankFrame {

	public static void main(String[] args) {
		// hdfc bank frame
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
	Alert alt=	driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	
	driver.switchTo().defaultContent();
	driver.close();
		

	}

}
