$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/qtpselenium/cucumber/buyproducts.feature");
formatter.feature({
  "name": "I want to shop",
  "description": "  I want to go online and shop",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BuyProducts"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BuyProducts"
    },
    {
      "name": "@ShopOnEbay"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to website www.ebay.com",
  "keyword": "Given "
});
formatter.match({
  "location": "MyHoliday.i_goto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for shirts",
  "keyword": "And "
});
formatter.match({
  "location": "Shop.i_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a shirt in cart",
  "keyword": "When "
});
formatter.match({
  "location": "Shop.i_add()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The cart item count should increase",
  "keyword": "Then "
});
formatter.match({
  "location": "Shop.cart_item()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/holiday.feature");
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
  "name": "We want to book flight to Bejing on 21st Apr 2019",
  "keyword": "And "
});
formatter.match({
  "location": "MyHoliday.want_flight(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return Flight on 25th Apr 2019",
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