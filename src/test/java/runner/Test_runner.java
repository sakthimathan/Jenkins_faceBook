package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\Lenovo\\eclipse-workspace_Sakthi\\Jenkins_Project\\src\\test\\resources\\Features",
		glue = "step_Def",plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}
		)
public class Test_runner extends AbstractTestNGCucumberTests {

}
