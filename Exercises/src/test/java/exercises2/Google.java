package exercises2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import bas.TestBase;

public class Google extends TestBase{
		
		@Test
		public void testApp() {
			String selection = "helo app";
			
			
			// dynamic
			getDriver("chrome");
			driver.get("http://google.com");
			driver.findElement(By.name("q")).sendKeys("hello");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@role='listbox']")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));
			
			List<WebElement> options = driver.findElements(By.cssSelector("div.sbl1"));
			System.out.println("Size - "+ options.size());
			for(WebElement e: options) {
				System.out.println(e.getText());
				if(e.getText().equalsIgnoreCase(selection)) {
					System.out.println(e.getText());
					e.click();
					break;
				}
			}
			
			
			
			
		}


}
