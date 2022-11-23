package belmontipenthouse.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Click_On_Buy {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws Exception{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://belmontepenthouse.com/");//enter URL
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	
	
	@Test 
	public void Click_ON_Buy() throws Exception{
		
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Buy")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
 		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
 		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		System.out.println("Click On Buy Option");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void logout() {
		driver.close();
		System.out.println("Application Closed");
	}
}
	