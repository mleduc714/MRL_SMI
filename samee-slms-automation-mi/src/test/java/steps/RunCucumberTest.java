package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

/**
 * @author Getha Jagannathan
 *
 *         <p>
 * 		Class for executing the Cucumber tests
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-htmlreport", "json:target/RunCucumberTest.json" },
		features = "src/test/resources/features/")
public class RunCucumberTest {

}