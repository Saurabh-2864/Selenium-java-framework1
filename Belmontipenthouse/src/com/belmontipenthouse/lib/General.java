package com.belmontipenthouse.lib;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class General extends Global{
	// To provide all re-usable fun:/ methods related to whole application
	 public void openApplication() {
	 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.navigate().to(url);
	 System.out.println("Application Opened");
	 
	 }
	 public void closeApplication() {
	 driver.close(); 
	 }	
	 }



