import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/CucumberBasics/src/test/resources/com/qtpselenium/cucumber/passingparameters.feature:34"},
        plugin = {"json:D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/CucumberBasics/target/cucumber-parallel/4.json", "html:D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/CucumberBasics/target/cucumber-parallel/4"},
        monochrome = true,
        glue = {"com.qtpselenium.cucumber"})
public class Parallel04IT extends AbstractTestNGCucumberTests {
}
