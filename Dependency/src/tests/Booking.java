package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Booking {
	
	@Test(groups = {"sanity","pre"})
	public void search() {
		Assert.fail();
	}
	
	
	@Test(groups = {"sanity","pre"})
	public void select() {
		
	}
	
	
	@Test(groups = {"sanity","post"})
	public void checkout() {
		Assert.fail();
	}
	
	@Test(groups = {"sanity","post"})
	public void confirm() {
		
	}


}
