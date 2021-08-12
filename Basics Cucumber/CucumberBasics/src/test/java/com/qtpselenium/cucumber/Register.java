package com.qtpselenium.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {

	@Given("I am on gmail.com registeration page")
	public void iAmOn() {
		
		System.out.println("I am on gmail.com registeration page");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("I enter ([a-zA-Z0-9]{1,})")
	public void enter(String data) {
		System.out.println("Typing "+ data);
	}
	
	@Then("regiteration should be ([a-zA-Z]{1,})")
	public void result(String output) {
		System.out.println("regiteration should be "+output);
	}
}
