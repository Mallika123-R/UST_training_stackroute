package com.qtpselenium.cucumber;

import java.util.List;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Holiday {
	
	@Before("@BookHotelTickets")
	public void init() {
	System.out.println("*************Init***************");	
	}
	
	
	
	@After("@BookHotelTickets")
	public void quit() {
		System.out.println("***********Quit**************");
	}

	@Given("I live in Moscow")
	public void i_live_in_Moscow() {
		System.out.println("I live in ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	@And("^I want to travel to Hawai from ([^\"]*) to ([^\"]*)$")
	public void iTravel(String from,String to) {
		System.out.println("I want to travel to Hawai from "+from+" to "+to);
	}
	
	@And("^I have a family of (\\d+) adults and (\\d+) kids$")
	public void iFamily(int adults,int kids) {
		System.out.println("I have a family of "+adults+" adults and "+kids+" kids");
	}
	
	@And("^I want to book ([^\"]*)$")
	public void iBook(String type) {
		System.out.println("I want to book "+type);
	}
	
	@When("^I go to travel agent$")
	public void iGo() {
		System.out.println("I go to travel agent");
	}
	
	@Then("^I ask him to book air tickets from ([^\"]*) to ([^\"]*)$")
	public void iBookAir(String from,String to) {
		System.out.println("I ask him to book air tickets from "+from+" to "+to);
	}
	
	@But("^I want to reach in (\\d+) hrs$")
	public void iReach(int time) {
		System.out.println("I want to reach in "+time+" hrs");
	}
	

	@When("^I search online$")
	public void i_search_online()  {
	    System.out.println("I search online");
	}

	@Then("^I should get hotel below (\\d+) USD per night$")
	public void i_should_get_hotel_below_USD_per_night(int price) {
	    System.out.println("I should get hotel below "+price+" USD per night");
	}

	@But("^I want a beach facing hotel$")
	public void i_want_a_beach_facing_hotel() {
	    System.out.println("I want a beach facing hotel");
	}


	@And("Adult names are")
	public void adult_names_are(DataTable names) {
		System.out.println(" names are "+names.toString() );
		
		
	}
	
}
