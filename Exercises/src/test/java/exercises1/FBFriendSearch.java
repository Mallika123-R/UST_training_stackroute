package exercises1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import bas.TestBase;

public class FBFriendSearch  extends TestBase{

	@Test
	public void testApp() throws InterruptedException {
		getDriver("chrome");
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("its.thakur@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Zopim@7755");
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Ashish Thakur']")));
		driver.findElement(By.xpath("//div[text()='Ashish Thakur']")).click();//click on profile link
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Friends']")));
		driver.findElement(By.xpath("//span[text()='Friends']")).click();// click on friends tab
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("ajay");
		
		// validate - you
	}
}
