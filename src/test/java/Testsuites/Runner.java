package Testsuites;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/HomePage.feature",
		glue="Testsuites",
		plugin= {"pretty","html:target/cucumber-report.html"
				
		}
		)
public class Runner {

}
