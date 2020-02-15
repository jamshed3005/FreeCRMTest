package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\Jamshed Khan\\eclipse-workspace\\FreeCRMBDD\\src\\main\\java\\Feature\\newCustomerMAP.feature"   //store teh path of feature file 
 ,glue={"stepDefinition"} // store the path of stepdefinition file 
 ,dryRun= false,    // will dry run the test and check the mapping between feature file and step definition if we have miss any steps 
		 monochrome=true  //disply the console output in more readable output
		 
 ,strict=true ,
 plugin= {"pretty","html:target/cucumber-report","json:target/json-cucumber-report"}// Each step should be defined properly and working fine if not it will give pendingexception
 )

public class testRunner {

}
