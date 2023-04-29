package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".\\src\\test\\java\\featureFiles\\Login.feature"},
		glue = {"stepDefinitions"},
		monochrome = true,
		plugin = {"pretty","html:vtigerExecutionReport.html"},
		dryRun = false // true will not launch the browser but will generate the
		              // step definitions for feature file loaded.
		
		
		
		
		
		
		)







public class RunnerIO extends AbstractTestNGCucumberTests{

}
