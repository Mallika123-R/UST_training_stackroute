package com.zoho.web;

import org.openqa.selenium.By;

import com.zoho.base.pages.ZohoPage;

public interface ZohoWebConnector {
	
	
	void logout();
	ZohoPage validateTitle(String expectedTitle);
	ZohoPage validateText(String objectKey,String expectedText);
	boolean isElementPresent(String objectKey);
	void validateLogin();
	ZohoPage validateElementPresence(String objectKey);
	ZohoPage validateElementNotPresence(String objectKey);
	


}
