package Com.Selenium.Automation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\softwares\\java and eclipse testing\\chromedriver_win32\\chromedriver.exe");

WebDriver driver= new ChromeDriver();
driver.get("https://phptravels.org/register.php");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("dikhit");
driver.findElement(By.xpath("//input[@id='inputLastName']")).sendKeys("behera");
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("behera@gmail.com");
driver.findElement(By.xpath("//input[@name='phonenumber']")).sendKeys("898776565");



	}

}
