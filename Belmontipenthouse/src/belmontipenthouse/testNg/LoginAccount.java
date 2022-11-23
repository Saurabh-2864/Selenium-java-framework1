package belmontipenthouse.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// If you do not set priority of test cases, then it will Alphabetical order of method names- it will execute
// you have to prioritize all the test cases else Testng will take Alphabetical order sequence in execution.



public class LoginAccount {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws Exception{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		Thread.sleep(5000);
		
	}
	
	@Test(priority=1)
	public void Verifylogin() throws Exception{
		driver.get("https://belmontepenthouse.com/");//enter URL
		driver.manage().window().maximize();
		System.out.println("Login Successful");
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void ClickONBuy() throws Exception{
		
		driver.get("https://belmontepenthouse.com/");//enter URL
		driver.manage().window().maximize();
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
	
	@Test(priority=3)
	public void ClickOnEnquireNow()throws Exception{
	driver.get("https://belmontepenthouse.com/");//enter URL
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Buy")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
	driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id=\"buy\"]/div/div/div/a")).click();
    Thread.sleep(3000);
    System.out.println("Click on Enquire Now button");
	}
	
	@Test (priority=4)
	public void clickOnReviews() throws Exception{
		
		driver.get("https://belmontepenthouse.com/");//enter URL
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Reviews")).click();
		Thread.sleep(3000);
	}
	//(enabled = false) use this when don't need to run any one testcase
	
	@Test(priority=5)
	public void clickOnPhotos() throws Exception{
		
		driver.get("https://belmontepenthouse.com/");//enter URL
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	driver.findElement(By.linkText("Photos")).click();
	Thread.sleep(3000);
	}
	
	
	@Test (priority=6)
	public void clickOnfloorplan() throws Exception{
		
		driver.get("https://belmontepenthouse.com/");//enter URL
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Floorplan")).click();
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
	}
	
	@Test (priority=7)
	public void ClickOnLocation() throws Exception{
		driver.get("https://belmontepenthouse.com/");//enter URL
		driver.manage().window().maximize();
		Thread.sleep(5000);
	driver.findElement(By.linkText("Location")).click();
	Thread.sleep(3000);
	}
	
	@Test (priority=8)
	public void contactUs() throws Exception{
		driver.get("https://belmontepenthouse.com/");//enter URL
		driver.manage().window().maximize();
		Thread.sleep(5000);
	driver.findElement(By.linkText("Contact Us")).click();
	Thread.sleep(3000);
	}
	
	@Test (priority=9)
	public void FAQs () throws Exception{
		
		driver.get("https://belmontepenthouse.com/");//enter URL
		driver.manage().window().maximize();
		Thread.sleep(5000);	
		
	driver.findElement(By.linkText("FAQs")).click();
	Thread.sleep(3000);
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
		System.out.println("Application Closed");
	}
	
		
	
	
}





























/*

 @BeforeSuite

public void beforeSuite() {
	 public static void main(String args[]) throws Exception{/*throws Exception Meaning:- all the 
			error messages are available under the class	
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();//Create an Object
			Actions ac = new Actions(driver);
	System.out.println("Application opened");
}

 @BeforeTest
public void beforeTest() {
	System.out.println("Screen shows in full views");
	
    }

  @BeforeMethod
public class LoginAccount {
	public static void main(String args[]) throws Exception{/*throws Exception Meaning:- all the 
		error messages are available under the class	
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Create an Object
		Actions ac = new Actions(driver);
		
		driver.navigate().to("https://belmontepenthouse.com/");// Enter any website URL
		System.out.println("Application Opened");
		
		driver.manage().window().maximize(); 
		System.out.println("Window shows in full view");
		
		Thread.sleep(3000);// Wait statement

}
}
*/ 