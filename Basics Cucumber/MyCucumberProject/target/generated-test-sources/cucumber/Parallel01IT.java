import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/MyCucumberProject/src/test/resources/com/qtpselenium/cucumber/buyproducts.feature:24"},
        plugin = {"json:D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/MyCucumberProject/target/cucumber-parallel/1.json", "html:D:/Whizdom-Trainings/Online Training Workspace/Recording_Dec17/MyCucumberProject/target/cucumber-parallel/1"},
        monochrome = true,
        glue = {"com.qtpselenium.cucumber"})
public class Parallel01IT extends AbstractTestNGCucumberTests {
}
