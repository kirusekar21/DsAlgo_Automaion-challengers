package utils;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	
	private WebDriver driver;
//	private ConfigReader configReader;
	Properties prop;
   
//	@Beforetest
//	public void getProperty() {
//		configReader = new ConfigReader();
//		prop = configReader.init_prop();
//	}
//
//	@Before(order = 1)
//	public void launchBrowser() {
//		
//		driverFactory = new DriverFactory();
//		driver = driverFactory.init_driver(prop.getProperty("browser"));
//		
//	}
//    @AfterTest
//	public void quitBrowser() {
//		driver.quit();
//	}

//	@After(order = 1)
//	public void tearDown(Scenario scenario) {
//		if (scenario.isFailed()) {
//			// take screenshot:
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcePath, "image/png", screenshotName);
//
//		}
//	}

}
