import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/MyCucumberProject/src/test/resources/features/holiday.feature:48"},
        plugin = {"json:D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/MyCucumberProject/target/cucumber-parallel/4.json", "html:D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/MyCucumberProject/target/cucumber-parallel/4"},
        monochrome = true,
        glue = {"com.qtpselenium.cucumber"})
public class Parallel04IT extends AbstractTestNGCucumberTests {
}
