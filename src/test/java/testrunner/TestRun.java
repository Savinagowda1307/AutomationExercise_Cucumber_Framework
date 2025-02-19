package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//feature/addToCart2.feature"},
glue= {"stepsDefinition","hooks"},
plugin= {
		"pretty","html:reports/myreport.html"},
publish=true
)
public class TestRun {

	
	
}
