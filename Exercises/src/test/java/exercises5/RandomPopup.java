package exercises5;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RandomPopup {
	
	
	@Test
	public void randomPopup() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.qtpselenium.com/downloads/randompopup.html");
		Set<String> winHandles = driver.getWindowHandles();
		System.out.println(winHandles.size());
		if(winHandles.size() > 1) {
			System.out.println("Popup Present ");
			//switch to the popup and close it
		}
		
		
		
	}
	
	
	
	

}
