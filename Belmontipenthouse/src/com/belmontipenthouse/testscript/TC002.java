package com.belmontipenthouse.testscript;
// No. of tab open & Close tabs/windows instead of Parent Window
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
	import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class TC002 {
		
		public static void main(String args[]) throws Exception{/*throws Exception Meaning:- all the 
			error messages are available under the class*/	
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();//Create an Object
			Actions ac = new Actions(driver);
			
			driver.navigate().to("https://belmontepenthouse.com/");// Parent window
			System.out.println("Application Opened");
			
			driver.manage().window().maximize(); 
			System.out.println("Window shows in full view");
			
			String originalHandle = driver.getWindowHandle();

			
			Thread.sleep(3000);// Wait statement
			
			ac.moveToElement(driver.findElement(By.linkText("Buy"))).perform();
	        Thread.sleep(3000);
	        System.out.println("Mouseover completed");
	
	System.out.println(driver.getTitle());
	
	
	
	
	driver.findElement(By.linkText("Contact Us")).click();
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
     
	
	
	driver.findElement(By.xpath("//*[@id=\"block-8\"]/div[1]/div[2]/div/p[2]/a[1]/img")).click();
    Thread.sleep(3000);
	System.out.println("Twitter Is Open");
	
	driver.findElement(By.xpath("//*[@id=\"block-8\"]/div[1]/div[2]/div/p[2]/a[2]/img")).click();
	Thread.sleep(3000);
	System.out.println("Facebook is open");
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
     
	
	driver.findElement(By.xpath("//*[@id=\"block-8\"]/div[1]/div[2]/div/p[2]/a[3]/img")).click();
	Thread.sleep(3000);
	System.out.println("Youtube is open");
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
    
	
	driver.findElement(By.xpath("//*[@id=\"block-8\"]/div[1]/div[2]/div/p[2]/a[4]/img")).click();
	Thread.sleep(3000);
	System.out.println("Instagram is open");
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
	Thread.sleep(3000);
	// to get no.of tab open
	for(String handle : driver.getWindowHandles()) {
        if (!handle.equals(originalHandle)) {
            driver.switchTo().window(handle);
            driver.close();
        }
    }

    driver.switchTo().window(originalHandle);
	
	
	
/*
	String parentWindow = driver.getWindowHandle();
	
	System.out.println(parentWindow);
	
	Set <String> windows = driver.getWindowHandles();
	
	java.util.Iterator<String> iterator= windows.iterator();
	
	while ((iterator.hasNext()));
	
	String childWindow = iterator.next();
	System.out.println(childWindow);
	
	if(!childWindow.equalsIgnoreCase(parentWindow)) {
	
	driver.switchTo().window(childWindow);
	
	if(driver.getTitle().equalsIgnoreCase("Instagram"));
	

	

driver.switchTo().window(parentWindow);

	driver.close();
*/	
	Thread.sleep(3000);
	}
	}  
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	/*   
	   
	   Set <String> s=driver.getWindowHandles();
	    
	    for (String i:s)
	    {
	    	String t=driver.switchTo().window(i).getTitle();
	    	if(t.contains("viewport"))
	    		Thread.sleep(3000);
	    	{
	    		driver.close();
	    	}
	    }
	System.out.println("Twitter is closed");
	
	   

    
    driver.findElement(By.xpath("//*[@id=\"block-8\"]/div[1]/div[2]/div/p[2]/a[2]/img")).click();
    System.out.println("Facebook is open");
    driver.close();

    
    
/*	
	ArrayList<String> windinfo = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(windinfo.get(1));
	Thread.sleep(3000);
	
	driver.navigate().back();
	driver.navigate().back();
	Thread.sleep(3000);
   System.out.println("Back to Home Page");
   driver.close();
   
  Thread.sleep(3000);

ArrayList<String> windinfo1 = new ArrayList<String>(driver.getWindowHandles());
  



Thread.sleep(3000);

ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"block-8\"]/div[1]/div[2]/div/p[2]/a[2]/img"))).perform();
Thread.sleep(3000);

System.out.println("Mouseover completed. cursor available on facebook logo ");
	
	driver.findElement(By.xpath("//*[@id=\"block-8\"]/div[1]/div[2]/div/p[2]/a[2]/img")).click();
	driver.switchTo().window(windinfo1.get(1));   
	System.out.println("Facebook is open");
	
	
	driver.navigate().back();
	driver.navigate().back();
	Thread.sleep(3000);
   System.out.println("Back to Home Page");
  
  */
   
   /*  driver.close();
     System.out.println("Application closed");
     
     Thread.sleep(3000);
   
}


}
*/
		
		
		