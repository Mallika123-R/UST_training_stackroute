package testcases.suitea;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void init() {
		System.out.println("-------------@BeforeTest-----------");
		// start the browser
	}
	
	@AfterTest
	public void quit() {
		System.out.println("-------------@AfterTest-----------");
		// close browser
	}
	
	@BeforeMethod
	public void beforeMeth() {
		System.out.println("*****@BeforeMethod****");
		// init report
	}
	
	@AfterMethod
	public void afterMeth() {
		System.out.println("*****@AfterMethod****");
		// finalize rep
	}
	
	
	@Test
	public void loginTest(ITestContext context) {
		// expected value, actual value
		String exp = "ABC"; // xls, prop,json
		String act = "ABCX"; // selenium
		System.out.println("Login Test");
		//Assert.assertEquals(act, exp); // test stop
		//Assert.assertTrue(5>11, "Errr message");
		//Assert.assertTrue(isPresent("xpath") , "element not found");
		//Assert.assertFalse(condition, message);
		//Assert.fail("Failure reason - 404 err");
		//System.out.println("After assertion");
		
	}
	
	@Test
	public void logout() {
		System.out.println("Logging out");
	}

}
