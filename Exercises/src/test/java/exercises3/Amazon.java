package exercises3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bas.TestBase;

public class Amazon extends TestBase{


	@Test
	public void testApp() {
		getDriver("chrome");
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		List<WebElement> names =driver.findElements(By.xpath("//a[@class='a-link-normal a-text-normal']"));
		List<WebElement> prices =driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(names.size());
		System.out.println(prices.size());

		for(int i=0;i<names.size();i++) {
			if(names.get(i).getText().contains("Black")){
				System.out.println(names.get(i).getText() +" -- "+ prices.get(i).getText());
				String p  = prices.get(i).getText().replace(",", "");
				int price = Integer.parseInt(p);
			}
		}
		
		
	}

}
