package com.zoho.pages.normal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.ZohoBasePage;
import com.zoho.base.pages.ZohoPage;


public class EnterUsernamePage extends ZohoBasePage{


	
	
	public ZohoPage submitUsername(String userid) {
		waitForPageToLoad();
		getDriver().type(Constants.USERNAME_FIELD_KEY, userid);
		getDriver().click(Constants.NEXT_BUTTON_KEY);

		boolean presencePassField = validator(false).isElementPresent(Constants.PASSWORD_FIELD_KEY);
		System.out.println("presencePassField "+presencePassField);
		if(!presencePassField)
			return this;
		else
			return new EnterPasswordPage();
		//validate
		
		
		
		
		
	}
	
	
	
}
