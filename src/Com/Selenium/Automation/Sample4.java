package Com.Selenium.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "D:\\\\softwares\\\\java and eclipse testing\\\\chromedriver_win32\\\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://phptravels.org/clientarea.php");
     driver.manage().window().maximize();
     System.out.println(driver.getTitle());
     System.out.println(driver.getPageSource());
	}

}
