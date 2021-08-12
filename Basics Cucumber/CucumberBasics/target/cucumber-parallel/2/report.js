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
  "name": "Book Air Tickets",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BookingTickets"
    },
    {
      "name": "@BookAirTickets"
    }
  ]
});
formatter.step({
  "name": "I want to book flight tickets",
  "keyword": "And "
});
formatter.match({
  "location": "Holiday.iBook(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adult names are",
  "rows": [
    {
      "cells": [
        "Tom"
      ]
    },
    {
      "cells": [
        "Frank"
      ]
    },
    {
      "cells": [
        "Henry"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Holiday.adult_names_are(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to travel agent",
  "keyword": "When "
});
formatter.match({
  "location": "Holiday.iGo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I ask him to book air tickets from 21st Jan 2018 to 30th Jan 2018",
  "keyword": "Then "
});
formatter.match({
  "location": "Holiday.iBookAir(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to reach in 18 hrs",
  "keyword": "But "
});
formatter.match({
  "location": "Holiday.iReach(int)"
});
formatter.result({
  "status": "passed"
});
});