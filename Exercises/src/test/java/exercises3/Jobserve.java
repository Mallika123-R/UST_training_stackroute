package exercises3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bas.TestBase;

public class Jobserve extends TestBase{


	@Test
	public void testApp() {
		String text = "Food & Hospitality";
		getDriver("chrome");
		driver.get("https://www.jobserve.com");
		driver.findElement(By.xpath("//*[@id='ddcl-selInd']/span/span")).click();
		driver.findElement(By.id("ddcl-selInd-i0")).click();
		
		//   
		//   //input[starts-with(@id,'ddcl-selInd-i')]
		//   label.ui-dropdownchecklist-text
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[id^=ddcl-selInd-i]"));
		List<WebElement> labels = driver.findElements(By.cssSelector("label[for^=ddcl-selInd-i]"));
		System.out.println("Total checkboxes "+ checkboxes.size());
		System.out.println("Total labels "+ labels.size());
		
		//for()
	}

}
