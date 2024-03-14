package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Feature/Login1.feature",
		glue="stepDefinition",
		dryRun=false,
		plugin= {"pretty","html:test-result1.html", "json:test-result_json.json"}
		
		)

public class RunTest {
	
	

}
