package runner;

import org.junit.runner.RunWith;

import cucumber.api.*;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features ="src/test/java/features/Login.feature", glue="steps")
@RunWith(Cucumber.class)
public class RunTest {
	

}
