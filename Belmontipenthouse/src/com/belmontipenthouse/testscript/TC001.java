package com.belmontipenthouse.testscript;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC001 {
	
	public static void main(String args[]) throws Exception{/*throws Exception Meaning:- all the 
		error messages are available under the class*/	
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Create an Object
		Actions ac = new Actions(driver);
		
		driver.navigate().to("https://belmontepenthouse.com/");// Enter any website URL
		System.out.println("Application Opened");
		
		driver.manage().window().maximize(); 
		System.out.println("Window shows in full view");
		
		Thread.sleep(3000);// Wait statement
		
		ac.moveToElement(driver.findElement(By.linkText("Buy"))).perform();
        Thread.sleep(3000);
        System.out.println("Mouseover completed");
		
        driver.findElement(By.linkText("Buy")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
 		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
 		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		
		Thread.sleep(3000);

        System.out.println("Click on Buy Option");
        
        driver.findElement(By.xpath("//*[@id=\"buy\"]/div/div/div/a")).click();
        Thread.sleep(3000);
        System.out.println("Click on Enquire Now button");
        
        driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
        
        
        
        
        driver.navigate().back();
        driver.navigate().back();
 		Thread.sleep(3000);
        System.out.println("Back to Home Page");
        
        
        driver.findElement(By.linkText("Reviews")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"sp-testimonial-free-1039\"]/div[3]/i")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"sp-testimonial-free-1039\"]/div[3]/i")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"sp-testimonial-free-1039\"]/div[3]/i")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"sp-testimonial-free-1039\"]/div[3]/i")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"sp-testimonial-free-1039\"]/div[3]/i")).click();
		Thread.sleep(3000);

		System.out.println("Click on review button");
		
		driver.navigate().back();
		Thread.sleep(3000);
       System.out.println("Back to Home Page");
       
       
		
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);

		System.out.println("Click on photos Option");
		

		driver.findElement(By.className("owl-next")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("owl-next")).click();
		Thread.sleep(3000);

		driver.findElement(By.className("owl-next")).click();
		Thread.sleep(3000);

		driver.findElement(By.className("owl-next")).click();
		Thread.sleep(3000);
		
		System.out.println("Click on Next Photos");
		
		driver.navigate().back();
 		Thread.sleep(3000);
        System.out.println("Back to Home Page");
		
		driver.findElement(By.linkText("Floorplan")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);

		System.out.println("Click on Floorplan button");
		
		driver.navigate().back();
 		Thread.sleep(3000);
        System.out.println("Back to Home Page");
        
       
		driver.findElement(By.linkText("Location")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);

		System.out.println("Click on Location button");
		
		driver.findElement(By.xpath("//*[@id=\"location\"]/div/div/div/div/figure/a/img")).click();
		Thread.sleep(3000);
		System.out.println("Click on Walking Map");
		
		driver.findElement(By.className("lb-close")).click();
		Thread.sleep(3000);
		
		System.out.println("Map is closed");
		
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		
		
	     System.out.println("Click on Contact-us button");
	     
	     
		
		driver.navigate().back();
 		Thread.sleep(3000);
        System.out.println("Back to Home Page");
		
		
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
         
		
		
		System.out.println("Click on Contact Us  button");
		/*
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id=\"block-8\"]/div[1]/div[2]/div/p[2]/a[1]/img")).click();
	     Thread.sleep(3000);
		 
	     System.out.println("Twitter Is Open");
		
		ArrayList<String> windinfo = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windinfo.get(1));
		Thread.sleep(3000);
		
		driver.navigate().back();
		driver.navigate().back();
 		Thread.sleep(3000);
        System.out.println("Back to Home Page");
        
        
       Thread.sleep(3000);
    /*
    ArrayList<String> windinfo = new ArrayList<String>(driver.getWindowHandles());

	Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"block-8\"]/div[1]/div[2]/div/p[2]/a[2]/img")).click();
		driver.switchTo().window(windinfo.get(1));
		System.out.println("Facebook is open");
		
		
		
		driver.navigate().back();
 		Thread.sleep(3000);
        System.out.println("Back to Home Page");
		
        */
		
		
       driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		
		
		
		driver.findElement(By.name("your-name")).sendKeys("Saurabh Suresh Mirajkar");
		Thread.sleep(3000);
		
		driver.findElement(By.name("your-email")).sendKeys("saurab.mirajkar@ideausher.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
		driver.findElement(By.name("your-phone")).sendKeys("9823541487");
		Thread.sleep(3000);
		
		driver.findElement(By.name("your-message")).sendKeys("This is my First site For Automation Testing Thankyou for support @ Abhishek Das");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"wpcf7-f689-o1\"]/form/div[2]/div/input")).click();
		Thread.sleep(5000);
		
		System.out.println("Contact details submitted successfully");
		
		
		
		driver.navigate().back();
 		Thread.sleep(3000);
        System.out.println("Back to Home Page");
		
		
		driver.findElement(By.linkText("FAQs")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);

		System.out.println("Click on FAQs button");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Check In/Out")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Cancellation Policy")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);  
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		
		
		
		
		driver.findElement(By.linkText("Pets")).click();
		Thread.sleep(3000);
		

		driver.findElement(By.linkText("Children")).click();
		Thread.sleep(3000);
		

		driver.findElement(By.linkText("Events")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Smoking")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Breakfast")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Visitor Policy")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Payment")).click();
		Thread.sleep(3000);
		
		System.out.println("Click on every FAQ's ");
		
		driver.navigate().back();
 		Thread.sleep(3000);
        System.out.println("Back to Home Page");
		
		Thread.sleep(3000);

		driver.findElement(By.className("sohohotel-button1")).click();
		Thread.sleep(3000);
		System.out.println("Click on check availability ");
		
		driver.findElement(By.linkText("16")).click();
		Thread.sleep(3000);
		System.out.println("Available on the check availability page ");
		
		driver.findElement(By.name("name1")).sendKeys("Saurabh Suresh Mirajkar");
		Thread.sleep(3000);
		System.out.println("Name Entered successfully");
		
	
		
		driver.findElement(By.name("email1")).sendKeys("saurabh.mirajkar@ideausher.com");
		Thread .sleep(3000);
		System.out.println("Email ID entered Successfully");
		
		driver.findElement(By.name("phone1")).sendKeys("9823541487");
		Thread.sleep(3000);
		System.out.println("Phone Number entered successfully");
		

		driver.findElement(By.className("btn")).click();
		Thread .sleep(3000);
		Thread.sleep(3000);
		System.out.println("Click on submit Button");
		
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
       driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		System.out.println("Click On down Arrow");
		
		driver.navigate().back();
 		Thread.sleep(3000);
        System.out.println("Back to Home Page");

		
		driver.getTitle();
		System.out.println("Title Of the Page is received");
		
		
        
        
		  
	driver.close();
	System.out.println("Application closed");
	
	
}
}

