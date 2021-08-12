package exercises1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import bas.TestBase;

public class AmericanGolf extends TestBase{

	@Test
	public void testApp() {
		getDriver("chrome");
		driver.get("http://americangolf.co.uk");
		driver.findElements(By.xpath("//i[@class='icon icon-basket']")).get(1).click();
	}

}
