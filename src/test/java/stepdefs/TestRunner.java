package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome= true,  // 
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/features",
		glue = "stepdefs",
		tags= {"@sanity"} //is for running single tag For Ex: @Sanity in 4th scenario feature file
		//tags = {"@sanity or @regression"} // this is how we can give multiple tags For Ex: @Sanity or @Regression
		
		)

public class TestRunner {

}
