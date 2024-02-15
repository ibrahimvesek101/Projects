package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "path to feature file or folder",
        glue = "path to step definition package ",
        tags = "tags to run",
        plugin = "add reports"
)
public class Runner extends AbstractTestNGCucumberTests {

    // smoke runner -> smoke tag i bulunan senaryolari calistir

    // regression runner -> tum senaryolari calistir

    // belirli bir grup -> booking runner -> booking ile alakali tum endpoint testlerini calistir


}
