package stepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.*;
import io.cucumber.java.en.*;
import utils.TestBaseT;

public class InvalidLogin_def{
	
	private WebDriver driver;
	private dsalgo_Login loginPage;
	public TestBaseT tc;
	WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(5));
	
	public InvalidLogin_def() throws IOException {
		tc=new TestBaseT();
		loginPage=new dsalgo_Login(tc.WebDriverManager());
	}
	
	@Given("user inputs the wrong credentials")
	public void inLoginPage() throws InterruptedException {
//		loginPage.clickLogin();
		System.out.println("I am in Invalid Login Step definition");
//    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alice\\Desktop\\Wksp\\CucumberJava\\src\\main\\resources\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://dsportalapp.herokuapp.com/login");
//		loginPage = new dsalgo_Login(driver);
//		Thread.sleep(5000);
//		driver.manage().window().maximize();
	}
	
	@Then("user is navigated wrong credentials message")
	public void clickInvalid() {
		loginPage.invalidClick();
	}

}
