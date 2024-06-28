package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
	            monochrome = true, 
		        features={"src/test/resources/Features"},
                glue={"stepDefinitions"})
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
@Override
@DataProvider(parallel=false)
public Object[][] scenarios(){
	return super.scenarios();
  }
}