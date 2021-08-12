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
formatter.scenarioOutline({
  "name": "I want to book Flight",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BookFlight"
    }
  ]
});
formatter.step({
  "name": "We want to book flight to \u003cDestination\u003e on \u003cFromDate\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Return Flight on \u003cToDate\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Destination",
        "FromDate",
        "ToDate"
      ]
    },
    {
      "cells": [
        "Hawai",
        "10th Feb 2019",
        "20th Feb 2019"
      ]
    },
    {
      "cells": [
        "Bejing",
        "21st Apr 2019",
        "25th Apr 2019"
      ]
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
  "name": "I want to book Flight",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BookHotelAndFlights"
    },
    {
      "name": "@BookFlight"
    }
  ]
});
formatter.step({
  "name": "We want to book flight to Hawai on 10th Feb 2019",
  "keyword": "And "
});
formatter.match({
  "location": "MyHoliday.want_flight(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return Flight on 20th Feb 2019",
  "keyword": "And "
});
formatter.match({
  "location": "MyHoliday.returnFlight(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});