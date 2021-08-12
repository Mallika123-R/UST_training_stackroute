package exercises4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bas.TestBase;

public class Hostgator extends TestBase{


	@Test
	public void testApp() throws InterruptedException {
		getDriver("chrome");
		driver.get("https://www.hostgator.in/dedicated-servers-windows.php");
		driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-6 col-md-7 text-center']/a")).click();//click on choose plan
		
		
		List<WebElement> prices =driver.findElements(By.cssSelector("div.selected-term span.term-price"));
		int expensive=0;
		int expensiveIndex=0;
		for(int i=0;i<prices.size();i++) {
			int price = Integer.parseInt(prices.get(i).getText().split(" ")[1].replace(",", "")); //3444
			System.out.println(price);
			if(price>expensive) {
				expensive=price;
				expensiveIndex=i;
			}
			
		}
		System.out.println(expensive);
		
		List<WebElement> buttons =driver.findElements(By.xpath("//button[@class='btn btn-info dropdown-toggle block-level shared hidden-xs']"));
		
		int y = buttons.get(expensiveIndex).getLocation().y;
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,"+(y-50)+")");
		Thread.sleep(3000);
		buttons.get(expensiveIndex).click();
	}

}
