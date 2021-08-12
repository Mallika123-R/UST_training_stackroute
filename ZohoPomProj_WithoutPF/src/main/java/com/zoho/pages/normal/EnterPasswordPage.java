package com.zoho.pages.normal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.ZohoBasePage;
import com.zoho.base.pages.ZohoPage;
import com.zoho.pages.session.IntermediatePage;

public class EnterPasswordPage extends ZohoBasePage{

	@FindBy(id=Constants.PASSWORD)
	WebElement loginPassword;
	
	@FindBy(xpath=Constants.SIGNIN_BUTTON)
	WebElement nextButton;
	
	public ZohoPage submitPassword(String password) {
		loginPassword.sendKeys(password);
		nextButton.click();
		waitForPageToLoad();
		//getCurrentDriver().findElement(getDriver().getObject("xxxx")).click();
		
		return new IntermediatePage();
		
	}
}
