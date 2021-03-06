package com.qtpselenium.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/",
        glue = {"com.qtpselenium.cucumber"},
        tags = {"@BookAirTickets,@BookHotelTickets,@Registeration"},
        plugin = {
              
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })
        
public class CucumberProjectTestngRunner extends AbstractTestNGCucumberTests{
   
}