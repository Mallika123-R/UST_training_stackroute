#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@BookingTickets
Feature: Booking Tickets
  I want to book air and hotel tickets for my holidays
  
  Background:
  Given I live in Moscow
  And I want to travel to Hawai from 21st Jan 2018 to 30th Jan 2018
  And I have a family of 2 adults and 2 kids
  
  @BookHotelTickets
  Scenario: Booking Hotel Tickets
  And I want to book hotel
  When I search online
  Then I should get hotel below 200 USD per night
  But I want a beach facing hotel
  
  @BookAirTickets
  Scenario: Book Air Tickets
  And I want to book flight tickets
  And Adult names are
  |Tom|
  |Frank|
  |Henry|
  When I go to travel agent
  Then I ask him to book air tickets from 21st Jan 2018 to 30th Jan 2018
  But I want to reach in 18 hrs