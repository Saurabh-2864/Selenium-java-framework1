package belmontipenthouse.testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeaftertestmethods {
	
	//Note The flow is Beforemethod -- Test -- Aftermethod
	
	@BeforeMethod
	public void UserRegistration() {
		System.out.println("User is getting registered");
	
	}
	
	@Test
	public void UserLogin() {
		System.out.println("User is able to login");
	}
	
	@Test
	public void MoneyControl() {
		System.out.println("User is able to transfer funds anywhere");
	}
     
	@AfterMethod
	public void UserLogOut() {
		System.out.println("User is Able to logout");
	}
}
