package runnerFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Features", glue= "com.cg.StepDefinitions", dryRun=false, monochrome = true,
plugin= {"pretty", "json:test-output/login.json", "html:test-output", "junit:test-output/login.xml"})
public class TestRunner {

}
