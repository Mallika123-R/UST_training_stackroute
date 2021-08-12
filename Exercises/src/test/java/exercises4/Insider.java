package exercises4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import bas.TestBase;



public class Insider extends TestBase{


	@Test
	public void testApp() {
		getDriver("chrome");
		driver.get("https://www.insider.in");
		driver.findElement(By.xpath("//span[@class='selected-city']")).click();
		driver.findElement(By.xpath("//a[text()='Delhi']")).click();
		driver.findElement(By.xpath("//span[text()='The 10 PM Show']")).click();
		driver.findElement(By.cssSelector("a.banner-home")).click();
		Assert.assertTrue(isElementPresent("//span[text()='Recently viewed']"), "Element not present");
		Assert.assertTrue(isElementVisible("//span[text()='Recently viewed']"), "Element not visible");
		
		Assert.assertTrue(isElementPresent("//div[text()='The 10 PM Show']"), "Element not present");
		Assert.assertTrue(isElementVisible("//div[text()='The 10 PM Show']"), "Element not visible");
		
	}
	
	public boolean isElementPresent(String xpathExpr) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathExpr)));
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean isElementVisible(String xpathExpr) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpr)));
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	
	
	
	
	
	

}
