package testcases;

import org.testng.annotations.Test;

public class TestB {

	@Test
	public void testB() throws InterruptedException{
		System.out.println("Test B start");
		Thread.sleep(2000);
		System.out.println("Test B end");

	}
}
