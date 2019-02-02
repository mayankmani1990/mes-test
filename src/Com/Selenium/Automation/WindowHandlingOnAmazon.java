package Com.Selenium.Automation;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingOnAmazon {

	public static void main(String[] args) throws InterruptedException {
		// amazon.com window handling
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement wb1 = driver.findElement(By.xpath("//span[text()='Category']"));
		Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.moveToElement(wb1).perform();;
        Thread.sleep(2000);
        WebElement wb2= driver.findElement(By.xpath("//span[contains(text(),'Mobiles, Computers')]"));
        Thread.sleep(2000);
        act.moveToElement(wb2).perform();
        WebElement wb3 = driver.findElement(By.xpath("//span[contains(text(),'All Mobile Phones')]"));
        Thread.sleep(2000);
        act.moveToElement(wb3).click().perform();
        driver.findElement(By.xpath("//a[contains(text(),'Redmi 6A (Black')]")).click();
        Set<String> strwin = driver.getWindowHandles();
        Iterator<String> it=strwin.iterator();
        String parId =it.next();
        String chlId =it.next();
        driver.switchTo().window(chlId);
        WebElement cwb1=driver.findElement(By.xpath("//span[contains(text(),'Camera: 13 MP')]"));
        act.doubleClick(cwb1).perform();
        act.contextClick(cwb1).perform();
        act.sendKeys(cwb1, Keys.ARROW_DOWN).perform();
        //act.sendKeys(Keys.CONTROL,"c").perform();
        driver.switchTo().window(parId);
        WebElement wb4= driver.findElement(By.id("twotabsearchtextbox"));
        act.moveToElement(wb4).click().perform();
        act.sendKeys(wb4, Keys.CONTROL,"v").perform();
        
	}

}
