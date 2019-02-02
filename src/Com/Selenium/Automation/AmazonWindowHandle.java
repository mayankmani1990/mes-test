package Com.Selenium.Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class AmazonWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jbhjk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement wb= driver.findElement(By.xpath("//span[text()='Category']"));
		act.moveToElement(wb).perform();
		WebElement wb2= driver.findElement(By.xpath("//span[@aria-label='Men']"));
		act.moveToElement(wb2).perform();
		WebElement wb3= driver.findElement(By.linkText("Watches"));
		act.moveToElement(wb3).click().perform();
		driver.findElement(By.xpath("//h2[contains(text(),'Rws0106')]")).click();
		Set<String> WinID =driver.getWindowHandles();
		Iterator<String> it = WinID.iterator();
		String ParentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		driver.findElement(By.partialLinkText("U-40743LAGI")).click();
		Set<String> WinID2=driver.getWindowHandles();
		Iterator<String> it2 =WinID2.iterator();
		String ParentIdOf2 = it2.next();
		String ChildIdof2 =it2.next();
		driver.switchTo().window(ChildIdof2);
		
		
		WebElement wb4= driver.findElement(By.id("productTitle"));
		System.out.println(wb4.getText());
		
		driver.switchTo().window(ParentIdOf2);
	   System.out.println(driver.getTitle());
      
	   driver.switchTo().window(ChildIdof2);
	   System.out.println(driver.getTitle());
	   driver.switchTo().window(ParentIdOf2);
	   System.out.println(driver.getTitle());
	   driver.switchTo().window(ParentId);
	   System.out.println(driver.getTitle());
	   System.out.println(driver.getCurrentUrl());
	   driver.quit();
	}

}
