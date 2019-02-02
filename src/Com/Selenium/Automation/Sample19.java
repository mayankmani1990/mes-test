package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample19 {

	public static void main(String[] args) {
		// move to element
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\softwares\\\\\\\\java and eclipse testing\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in");
        WebElement wb = driver.findElement(By.xpath("//span[text()='Category']"));
        Actions act= new Actions(driver);
      //  act.moveToElement(wb).perform();
        Point p = wb.getLocation();
        int x=p.getX();
        int y=p.getY();
        		act.moveByOffset(x, y).perform();
	}

}
