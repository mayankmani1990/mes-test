package Com.Selenium.Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestRedbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\softwares\\\\java and eclipse testing\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://redbus.in");
		driver.findElement(By.id("src")).sendKeys("Ka");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='autoFill']/li[text()='Karur']")));
        List<WebElement> lst= driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
        for(WebElement l:lst) 
        {
        	if(l.equals("Karur")) 
        	{
        		l.click();
        		System.out.println(l.getText());
        	}
        	else 
        	{
        		System.out.println("not found");
        	}
        }

	}

}
