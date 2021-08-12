package exercises2;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bas.TestBase;

public class Magicbricks extends TestBase{
	
	@Test
	public void testApp() {
		
		getDriver("chrome");
		driver.get("https://www.magicbricks.com/");
		driver.findElement(By.cssSelector("li#rentDrop>a")).click();
		
		// randomly click
		// div#staticSwiperSliderRent li
		//div[@id='staticSwiperSliderRent']/descendant::li
		//div[@id='staticSwiperSliderRent']//li
		List<WebElement> options = driver.findElements(By.cssSelector("div#staticSwiperSliderRent li"));
		System.out.println("Total - "+ options.size());
		Random r= new Random();
		int n = r.nextInt(options.size());
		options.get(n).click();
		
		
	}
}
