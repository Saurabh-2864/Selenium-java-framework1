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

public class FirestTest {
	//Precedence Wise Execution (Step-wise
	
		@BeforeSuite
		
		public void beforeSuite() {
			System.out.println("Application opened");
		}

		@BeforeTest
		public void beforeTest() {
			System.out.println("Screen shows in full views");
			
		}
		
		@BeforeClass
		public void beforeClass() {
			System.out.println("Mousehover completed");
			
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("clicked on Buy option ");
		}
		@Test
		public void ClickonBuy() {
			System.out.println("Buy page is display ");
		}
		
		 
		// One @Test is equal to 1 'testcase' / Scenario

		
		@AfterMethod
		public void afterMethod() {
			System.out.println("Operation Successful");
		}
		

}
