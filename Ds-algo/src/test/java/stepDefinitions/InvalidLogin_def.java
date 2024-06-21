package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModel.*;
import io.cucumber.java.en.*;

public class InvalidLogin_def{
	
	private WebDriver driver;
	private dsalgo_Login loginPage;
	
	@Given("user inputs the wrong credentials")
	public void inLoginPage() throws InterruptedException {
		
		System.out.println("I am in Invalid Login Step definition");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alice\\Desktop\\Wksp\\CucumberJava\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dsportalapp.herokuapp.com/login");
		loginPage = new dsalgo_Login(driver);
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
	
	@Then("user is navigated wrong credentials message")
	public void clickInvalid() {
		loginPage.invalidClick();
	}

}
