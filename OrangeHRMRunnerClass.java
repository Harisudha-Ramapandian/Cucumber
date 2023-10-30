package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/loginOrangeHRM.feature", glue= {"stepDefinitions"},
monochrome = true,
plugin = {"pretty", "html:target/HTMLreports/report.html"}

		)
public class OrangeHRMRunnerClass {

}
