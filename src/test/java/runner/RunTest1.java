package runner;

import org.junit.runner.RunWith;

import cucumber.api.*;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features ="src/test/java/features/CreateLeadInteg.feature", glue= "steps",monochrome= true, tags="@smoke")
@RunWith(Cucumber.class)
public class RunTest1 {
	

}
