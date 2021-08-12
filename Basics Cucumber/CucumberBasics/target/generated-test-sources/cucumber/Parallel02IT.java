import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/CucumberBasics/src/test/resources/com/qtpselenium/cucumber/booking.feature:36"},
        plugin = {"json:D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/CucumberBasics/target/cucumber-parallel/2.json", "html:D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/CucumberBasics/target/cucumber-parallel/2"},
        monochrome = true,
        glue = {"com.qtpselenium.cucumber"})
public class Parallel02IT extends AbstractTestNGCucumberTests {
}
