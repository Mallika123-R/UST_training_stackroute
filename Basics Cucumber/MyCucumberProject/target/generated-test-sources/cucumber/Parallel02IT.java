import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/MyCucumberProject/src/test/resources/features/holiday.feature:32"},
        plugin = {"json:D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/MyCucumberProject/target/cucumber-parallel/2.json", "html:D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/MyCucumberProject/target/cucumber-parallel/2"},
        monochrome = true,
        glue = {"com.qtpselenium.cucumber"})
public class Parallel02IT extends AbstractTestNGCucumberTests {
}
