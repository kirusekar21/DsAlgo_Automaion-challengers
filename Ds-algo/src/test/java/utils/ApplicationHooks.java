//package utils;
//
//import java.io.IOException;
//import java.util.Properties;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterTest;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//
//public class ApplicationHooks {
//
//	
//	private WebDriver driver;
//	private TestBaseT tc;
////	private ConfigReader configReader;
////	Properties prop;
//   
////
////
////	@Before(order = 0)
////	public void launchBrowser() throws IOException {
////		
////	      tc= new TestBaseT();
////		  driver = tc.WebDriverManager();
//////				  (prop.getProperty("browser"));
////		
////	}
////    @After(order=1)
////	public void quitBrowser() {
////		driver.quit();
////	}
//
////	@After(order = 1)
////	public void tearDown(Scenario scenario) {
////		if (scenario.isFailed()) {
////			// take screenshot:
////			String screenshotName = scenario.getName().replaceAll(" ", "_");
////			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
////			scenario.attach(sourcePath, "image/png", screenshotName);
////
////		}
////	}
//
//}
