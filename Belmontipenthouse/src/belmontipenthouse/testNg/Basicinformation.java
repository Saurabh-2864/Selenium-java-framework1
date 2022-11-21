package belmontipenthouse.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basicinformation {
	
	//Precedence Wise Execution (Step-wise
	
	@BeforeSuite
	
	public void beforeSuite() {
		System.out.println("This is Before suite Annotation");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test Annotation");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before class Annotation");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before method Annotation");
	}
	@Test
	public void logintest() {
		System.out.println("This is a login testcase");
	}
	
	@Test  
	// One @Test is equal to 1 'testcase' / Scenario

	public void regtest() {
		System.out.println("This is a registration Test Case");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after Method Annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class Annotation");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is After test Annotation");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After suite Annotation");
	}
	
		
}
