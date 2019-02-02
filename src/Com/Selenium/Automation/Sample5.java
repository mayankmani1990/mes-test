package Com.Selenium.Automation;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String exp="https://www.facebook.com/";
		String act = driver.getCurrentUrl();
		if (act.contains(exp)) 
		{
		System.out.println("url matching");
	
		}
		else 
		{
			System.out.println("url not matching");
		}
System.out.println("title checking");
String  actt= driver.getTitle();
String  expt="";
System.out.println(driver.getTitle());
actt=expt;
if (expt.contains(actt)) 
{
	System.out.println("title match");
}
else 
{
System.out.println("no title match");	
}
System.out.println(driver.getPageSource());
}
}
