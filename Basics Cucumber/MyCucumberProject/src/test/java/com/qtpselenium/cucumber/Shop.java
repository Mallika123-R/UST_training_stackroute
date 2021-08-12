package com.qtpselenium.cucumber;


import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.SoftAssertions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shop {

	
	
	
	@And("I search for shirts")
	public void i_search() {
		System.out.println("I search for shirts");
	}
	
	@When("I add a shirt in cart")
	public void i_add() {
		System.out.println("I add a shirt in cart");
	}
	
	@Then("The cart item count should increase")
	public void cart_item() {
		System.out.println("The cart item count should increase");
		//assertThat("my home pageX").isEqualTo("my home page");
		//assertThat(isElementPresent("xxxxx")).isTrue();
		//fail("some reason to fail");
		
		// SoftAssertions
		
		
		
	}
}
