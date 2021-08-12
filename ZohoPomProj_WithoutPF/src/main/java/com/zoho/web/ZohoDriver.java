package com.zoho.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.zoho.listener.ZohoEventListener;

public class ZohoDriver extends ZohoValidationDriver{
	
	public ZohoDriver() {
		// init the prop object
		System.out.println("ZohoDriver--");
		
		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\project.properties");
			prop.load(fs);
			//System.out.println(prop.get("username_submit_next_button_xpath"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void logout() {
		
		
	}

	public void openBrowser(String bName) {
		log("Opening the browser "+bName );
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "D:\\Ashish\\softwares\\drivers\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new EventFiringWebDriver(new ChromeDriver(opt));// Launching the LaunchPage
		/*
		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setBrowserName("chrome");
		
			try {
				driver = new EventFiringWebDriver(new RemoteWebDriver(new URL("http://localhost:4444"),capability));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		*/
		
		driver.register(new ZohoEventListener());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	public void navigate(String urlKey) {
		log("Navigating to website "+urlKey );
		String url =prop.getProperty(urlKey);
		log("URL"+url );
		driver.get(url);
		
	}

	public void quit() {
		if(driver!=null)
		   driver.quit();
		
	}
	
	public EventFiringWebDriver getCurrentDriver() {
		return driver;
	}

	public void waitForElementLoad() {
		
		
	}
	
	public void click(String objectKey) {
		log("Clicking on "+objectKey );
		driver.findElement(getObject(objectKey)).click();
	}
	
	public void type(String objectKey,String data) {
		log("typing  in"+objectKey +". Data - "+ data);
		driver.findElement(getObject(objectKey)).sendKeys(data);
	}
	
	public void clear(String objectKey) {
		driver.findElement(getObject(objectKey)).clear();
	}
	
	
	public void select(String objectKey,String data) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
