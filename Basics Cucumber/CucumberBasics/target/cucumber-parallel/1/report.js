$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/CucumberBasics/src/test/resources/com/qtpselenium/cucumber/booking.feature");
formatter.feature({
  "name": "Booking Tickets",
  "description": "  I want to book air and hotel tickets for my holidays",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BookingTickets"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I live in Moscow",
  "keyword": "Given "
});
formatter.match({
  "location": "Holiday.i_live_in_Moscow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to travel to Hawai from 21st Jan 2018 to 30th Jan 2018",
  "keyword": "And "
});
formatter.match({
  "location": "Holiday.iTravel(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have a family of 2 adults and 2 kids",
  "keyword": "And "
});
formatter.match({
  "location": "Holiday.iFamily(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Booking Hotel Tickets",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BookingTickets"
    },
    {
      "name": "@BookHotelTickets"
    }
  ]
});
formatter.step({
  "name": "I want to book hotel",
  "keyword": "And "
});
formatter.match({
  "location": "Holiday.iBook(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search online",
  "keyword": "When "
});
formatter.match({
  "location": "Holiday.i_search_online()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get hotel below 200 USD per night",
  "keyword": "Then "
});
formatter.match({
  "location": "Holiday.i_should_get_hotel_below_USD_per_night(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want a beach facing hotel",
  "keyword": "But "
});
formatter.match({
  "location": "Holiday.i_want_a_beach_facing_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});