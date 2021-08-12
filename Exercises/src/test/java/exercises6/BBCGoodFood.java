package exercises6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.page.model.JavascriptDialogClosed;
import org.testng.annotations.Test;

public class BBCGoodFood {
	
		
		
		@Test
		public void goodFood() throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.bbcgoodfood.com/howto/guide/25-skills-every-cook-should-know");
			WebElement e = driver.findElement(By.cssSelector("ul.service-links-primary"));
			int y= e.getLocation().y;
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,"+(y+50)+")");
			Thread.sleep(5000);
			int x= e.getLocation().x;
			y= e.getLocation().y;
			System.out.println(x);
			System.out.println(y);
			js.executeScript("window.scrollTo(0,"+(400)+")");

			
		}
			

}

