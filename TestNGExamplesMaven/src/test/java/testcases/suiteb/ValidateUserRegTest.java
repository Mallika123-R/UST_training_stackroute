package testcases.suiteb;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateUserRegTest {

	
	@Test
	public void register() {
		SoftAssert softAssert = new SoftAssert();
		
		// verify title
		softAssert.assertEquals("XYZ", "XYZA"); //fail
		// verify some element
		softAssert.assertTrue(false,"Element not found");// passing
		boolean buttPresence=false;
		if(!buttPresence) {
			softAssert.fail("Submit button was not there");
			softAssert.assertAll();
		}
		
		//
		// verify reg 
		softAssert.fail("Reg was not success");//fail
		
		
		softAssert.assertAll();
		
		
	}
}
