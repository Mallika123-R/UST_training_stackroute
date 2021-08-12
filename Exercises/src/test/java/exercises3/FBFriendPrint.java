package exercises3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import bas.TestBase;

public class FBFriendPrint  extends TestBase{

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
		
		// scroll - infintely till all friends are loaded
		int countBeforeScroll=0;
		while(true) {
			
			List<WebElement> friends = driver.findElements(By.xpath("//div[@class='buofh1pr hv4rvrfc']/div[1]"));
			System.out.println(countBeforeScroll +" -- "+friends.size());
			if(countBeforeScroll == friends.size()) {
				// print list values
				break;
			}
				
			
			countBeforeScroll = friends.size();
			int y = friends.get(friends.size()-1).getLocation().y;// y coordinate of last
			// scroll to last friend
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,"+y+")");
			
			Thread.sleep(3000);
			
		}
		//0 , 20
		//20,40
		//40
		
		
		// validate - you
	}
}
