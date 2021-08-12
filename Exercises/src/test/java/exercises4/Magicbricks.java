package exercises4;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import bas.TestBase;


public class Magicbricks extends TestBase{
	
	@Test
	public void testApp() {
		getDriver("chrome");
		driver.get("https://www.magicbricks.com/");
		WebElement rent = driver.findElement(By.xpath("//a[text()='Rent ']"));//click on rent
		Actions act = new Actions(driver);
		act.moveToElement(rent).build().perform();
		
		List<WebElement> options = driver.findElements(By.cssSelector("#staticSwiperSliderRent ul>li"));//extract all links
		WebElement e = options.get(new Random().nextInt(options.size()));//extract a random link
		System.out.println(e.getText());
		e.click();
		
	}
}
