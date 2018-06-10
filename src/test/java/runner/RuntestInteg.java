package runner;

import org.junit.runner.RunWith;

import cucumber.api.*;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features ="src/test/java/features/CreateLeadInteg.feature", glue= {"hooks","pages"},monochrome= true)
@RunWith(Cucumber.class)
public class RuntestInteg {
	

}
