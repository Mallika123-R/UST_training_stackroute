package exercises1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import bas.TestBase;

public class Google extends TestBase{
		
		@Test
		public void testApp() {
			getDriver("chrome");
			driver.get("http://google.com");
			driver.findElement(By.name("q")).sendKeys("hello");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			
			
		}


}
