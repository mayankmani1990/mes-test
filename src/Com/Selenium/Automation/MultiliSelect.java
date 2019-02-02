package Com.Selenium.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiliSelect {

	public static void main(String[] args) {
		// multiple select
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DIKHIT/Desktop/practice%20html%20files/Demo2d.html");
		WebElement mulsel = driver.findElement(By.xpath("//select[@id='breakfast']"));
		Select sel = new Select(mulsel);
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(3);
		List<WebElement> wblis= sel.getAllSelectedOptions();
//		for(int i=0;i<wblis.size();i++) 
//		{
//			System.out.println(mulsel.getText());
//		}
		for(WebElement w:wblis) 
		{
			System.out.println(w.getText());
		}
		sel.isMultiple();
		sel.deselectAll();

	}

}
