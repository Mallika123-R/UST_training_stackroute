$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/MyCucumberProject/src/test/resources/com/qtpselenium/cucumber/buyproducts.feature");
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
});