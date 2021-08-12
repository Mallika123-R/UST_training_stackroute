$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/MyCucumberProject/src/test/resources/features/holiday.feature");
formatter.feature({
  "name": "Going on holiday",
  "description": "\tI want to book flight tickets and a hotel",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BookHotelAndFlights"
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
  "name": "I live in London",
  "keyword": "Given "
});
formatter.match({
  "location": "MyHoliday.i_live(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to go on a holiday",
  "keyword": "And "
});
formatter.match({
  "location": "MyHoliday.i_want()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "We are 3 adults",
  "rows": [
    {
      "cells": [
        "Adult1",
        "Adult2",
        "Adult3"
      ]
    },
    {
      "cells": [
        "A",
        "B",
        "C"
      ]
    },
    {
      "cells": [
        "20",
        "30",
        "40"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MyHoliday.we_are(int,String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to book hotel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BookHotelAndFlights"
    },
    {
      "name": "@BookHotel"
    }
  ]
});
formatter.step({
  "name": "We want to book from 10th Feb 2019 to 20th Feb 2019",
  "keyword": "And "
});
formatter.match({
  "location": "MyHoliday.we_want_to_book(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to travel agent",
  "keyword": "When "
});
formatter.match({
  "location": "MyHoliday.i_go()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He should be able to help me in a budget of 1000 USD",
  "keyword": "Then "
});
formatter.match({
  "location": "MyHoliday.he_should(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He should provide me option to cancel",
  "keyword": "And "
});
formatter.match({
  "location": "MyHoliday.he_should_provide()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He should not ask for advance more than 300 USD",
  "keyword": "But "
});
formatter.match({
  "location": "MyHoliday.he_should_not(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});