package Com.Selenium.Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggest {

	public static void main(String[] args) {
		// autosuggest on google
		System.setProperty("webdriver.chrome.driver", "D:\\\\softwares\\\\java and eclipse testing\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> ls= driver.findElements(By.xpath("//span[text()='selenium']"));
		for(WebElement l:ls) 
		{
			System.out.println(l.getText());
		}
   
  
	}

}
