$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/CucumberBasics/src/test/resources/com/qtpselenium/cucumber/passingparameters.feature");
formatter.feature({
  "name": "Registering User",
  "description": "I want to register user",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RegisterUser"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Register user on Gmail.com",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Registeration"
    }
  ]
});
formatter.step({
  "name": "I am on gmail.com registeration page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I enter \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I enter \u003cmobilenumber\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "regiteration should be \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "mobilenumber",
        "result"
      ]
    },
    {
      "cells": [
        "user1",
        "pass1",
        "2222222222",
        "success"
      ]
    },
    {
      "cells": [
        "user2",
        "pass2",
        "3333333333",
        "failure"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Register user on Gmail.com",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegisterUser"
    },
    {
      "name": "@Registeration"
    }
  ]
});
formatter.step({
  "name": "I am on gmail.com registeration page",
  "keyword": "Given "
});
formatter.match({
  "location": "Register.iAmOn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user2",
  "keyword": "When "
});
formatter.match({
  "location": "Register.enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter pass2",
  "keyword": "When "
});
formatter.match({
  "location": "Register.enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter 3333333333",
  "keyword": "When "
});
formatter.match({
  "location": "Register.enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "regiteration should be failure",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.result(String)"
});
formatter.result({
  "status": "passed"
});
});