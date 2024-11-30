package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features", glue = {
		"stepdefinitions" }, tags = "@SignUpSignIn", plugin = {
				"html:target/cucumber_reports/cucumber-html-report.html" })

public class Runner extends AbstractTestNGCucumberTests {

}
