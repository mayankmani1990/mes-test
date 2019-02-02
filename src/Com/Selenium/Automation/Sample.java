package Com.Selenium.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     	String path = System.getProperty("user.dir")+"/Resources/chromedriver.exe";	
	   System.setProperty("webdriver.chrome.driver", path);
     	WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
