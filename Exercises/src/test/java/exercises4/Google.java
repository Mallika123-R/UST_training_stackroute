package exercises4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bas.TestBase;

public class Google extends TestBase{


		@Test
		public void testApp() {
			getDriver("chrome");
			driver.get("http://google.com");
			driver.findElement(By.name("q")).sendKeys("dentists near me");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			driver.findElement(By.cssSelector("span.i0vbXd")).click();
			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='dbg0pd']"));
			System.out.println(elements.size());
		
			for(int i=0;i<elements.size();i++) {
				System.out.println(elements.get(i).getText());
			}

		}

}
