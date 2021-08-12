package exercises3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bas.TestBase;

public class CrikInfo  extends TestBase{

	@Test
	public void testApp() throws InterruptedException {
		getDriver("chrome");
		driver.get("https://www.espncricinfo.com/series/19048/scorecard/1185155/ireland-women-vs-west-indies-women-2nd-t20i-wi-w-in-eng-and-ire-2019");
		
		List<WebElement> scores = driver.findElements(By.cssSelector("div.match-scorecard-page >div>div:nth-child(1) table.table.batsman>tbody>tr>td:nth-child(3)"));
		List<WebElement> names = driver.findElements(By.cssSelector("div.match-scorecard-page >div>div:nth-child(1) table.table.batsman>tbody>tr>td:nth-child(1)"));
		
		System.out.println(names.size());
		System.out.println(scores.size());
		
	}

}
