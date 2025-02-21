package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//Features/Register.feature",
		".//Features/Login.feature" }, glue = "stepDefinitations", dryRun = false, monochrome = true,

		plugin = { "pretty", "json:target/cucumber-reports/report.json", // ✅ Ensure the filename is included
				"html:target/cucumber-reports/report.html" // ✅ Avoid writing directly to a directory
		}, tags = "@sanity")
public class TestRun {

}
