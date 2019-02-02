package Com.Selenium.Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		//multiple elements
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		List<WebElement> li= driver.findElements(By.xpath("//input[@type='text']"));
//		for(WebElement l:li) 
//		{
//			l.sendKeys("dummy");
//		}
       WebElement wb = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
       driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
       System.out.println(wb.isDisplayed());
      System.out.println( wb.isEnabled());
       System.out.println(wb.isSelected());
       System.out.println(wb.getAttribute("type"));
       System.out.println(wb.getCssValue("background"));
       System.out.println(wb.getTagName());
       Point p = wb.getLocation();
       int x= p.getX();
       int y=p.getY();
       System.out.println(x);
       System.out.println(y);
	}

}
