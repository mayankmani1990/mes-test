package Com.Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		WebElement nxtBtn =driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		System.out.println(nxtBtn.getAttribute("class"));
		System.out.println(nxtBtn.getCssValue("background"));
		System.out.println(nxtBtn.isDisplayed());
		System.out.println(nxtBtn.isEnabled());
		Point p=nxtBtn.getLocation();
		System.out.println(p);
		int x=p.getX();
		int y=p.getY();
		System.out.println(x);
		System.out.println(y);
		
		

	}

}
