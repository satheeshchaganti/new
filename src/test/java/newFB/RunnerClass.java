package newFB;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"D:\\BDD\\Feature Files\\Facebook.feature"},
		glue={"newFB"},
		plugin= {"pretty",
				"html:target/report/Cucumber.html",
				"json:target/report/Cucumber.json"				
		},
		dryRun=false
		)




public class RunnerClass extends AbstractTestNGCucumberTests
{

}
