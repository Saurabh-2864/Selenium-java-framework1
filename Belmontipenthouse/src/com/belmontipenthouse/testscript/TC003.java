package com.belmontipenthouse.testscript;
// Code for Mouseover & Add data in Popup (FLIPkart site)
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC003 {
	
	public static void main(String args[]) throws Exception{/*throws Exception Meaning:- all the 
		error messages are available under the class*/	
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Create an Object
		Actions ac = new Actions(driver);
		
		driver.navigate().to("https://www.flipkart.com/");// Parent window
		System.out.println("Application Opened");
		Thread.sleep(3000);
		
		driver.manage().window().maximize(); 
		System.out.println("Window shows in full view");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		Thread.sleep(3000);
		
		System.out.println("Click on login button");
		
		System.out.println(driver.getTitle());
		System.out.println("Title is display");
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8380870035");
		Thread.sleep(3000);
		System.out.println("Entered Mobile number");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("838087");
		Thread.sleep(3000);
		System.out.println("Entered password");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		Thread.sleep(3000);
		System.out.println("Click on Login button");
		
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div"))).perform();
        Thread.sleep(3000);
        System.out.println("Mouseover completed");
	
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")).click();
        Thread.sleep(3000);

		
		
		
		
	/*	
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(3000);
		System.out.println("Text is available");
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("838087");
		System.out.println("Data entered");
*/
		
		
		driver.close();
		System.out.println("Application Closed");
		Thread.sleep(3000);
		
		
		
		
}
}