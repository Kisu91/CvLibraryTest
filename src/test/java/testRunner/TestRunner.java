package testRunner;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue={"steps"},
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" },
        monochrome=true)

public class TestRunner
{
}
