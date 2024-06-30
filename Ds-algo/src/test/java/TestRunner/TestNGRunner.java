package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( monochrome = true, 
		        features={"src/test/resources/Features"},
                glue={"stepDefinitions"},
	            plugin = {"pretty",
	            		"html:target/report/cucumber.html" ,
	            		"json:target/report/cucumber.json",
	    				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    				}        
		)
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
@Override
@DataProvider(parallel=false)
public Object[][] scenarios(){
	return super.scenarios();
  }
}