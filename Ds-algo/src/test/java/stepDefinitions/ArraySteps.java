package stepDefinitions;

import io.cucumber.java.en.Then;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.ArrayPage;
import PageObjectModel.DSIntro;
import PageObjectModel.TryMe;
import PageObjectModel.graphPage;
import PageObjectModel.loginPages;
import utils.TestBaseT;

public class ArraySteps {
	public static WebDriver driver;
	private TryMe try_me;
	public loginPages login;
	public ArrayPage array;
	public TestBaseT tc;
	DSIntro DSIntroduction;
	WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(5));
	public ArraySteps() throws IOException {
		tc=new TestBaseT();
		DSIntroduction=new DSIntro(tc.WebDriverManager());
		array=new ArrayPage(tc.WebDriverManager());
		login=new loginPages(tc.WebDriverManager());
		try_me=new TryMe(tc.WebDriverManager());

	}

	@Then("The User should navigate to Array Page")
	public void the_user_should_navigate_to_array_page() {
		
    array.ArrayGetStarted();
	}
}
