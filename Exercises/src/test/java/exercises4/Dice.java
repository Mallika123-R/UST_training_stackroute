package exercises4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bas.TestBase;


public class Dice extends TestBase{


	@Test
	public void testApp() throws InterruptedException {
		getDriver("chrome");
		driver.get("https://www.dice.com/jobs");
		
		
		int p=1;
		while(p!=6) {
			
			List<WebElement> names =driver.findElements(By.cssSelector("a.card-title-link.bold"));
			for(int i=0;i<names.size();i++) {
				System.out.println(names.get(i).getText());
			}
			System.out.println("--------------------------------------------------------------------------------");
			driver.findElement(By.xpath("//a[text()='"+(p+1)+"']")).click();
			p++;
		}
	}

}
