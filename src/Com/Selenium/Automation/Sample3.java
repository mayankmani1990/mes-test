package Com.Selenium.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/clientarea.php");
		driver.manage().window().maximize();
		String exp ="google.com";
		String act=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		if(act.contains(exp)) 
		{
			System.out.println("url matching");
		}
		else 
		{
			System.out.println("url not matching");
		}
		

	}

}
