package exercises2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import bas.TestBase;

public class NullSkull extends TestBase{

	@Test
	public void testApp() {
		getDriver("chrome");
		driver.get(" http://www.nullskull.com/articles/SumCaptchaTest.aspx");
		String n1 = driver.findElement(By.id("lblNum1")).getText();
		String n2 = driver.findElement(By.id("lblNum2")).getText();
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int sum = num1+num2;
		
		driver.findElement(By.id("txtSum")).sendKeys(String.valueOf(sum));
		
	
	
	}

}
