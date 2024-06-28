package stepDefinitions;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObjectModel.RegistrationPage;
import PageObjectModel.graphPage;
import PageObjectModel.loginPages;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestBaseT;




public class Registartion_Steps {
	protected static WebDriver driver;
	
	WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(5));
	public TestBaseT tc;
	RegistrationPage register;
	loginPages login;
	private graphPage graph;
   public Registartion_Steps() throws IOException {
		tc=new TestBaseT();
		register=new RegistrationPage(tc.WebDriverManager());
		login=new loginPages(tc.WebDriverManager());
		graph=new graphPage(tc.WebDriverManager());
	}
	
   @Given("The user should be able to open the browser page")
	public void the_user_should_be_able_to_open_the_browser_page() throws InterruptedException {
	     System.out.println("user in home page");
			}
	
	@When("The user enters the DS_Algo Page URL")
	public void the_user_enters_the_ds_algo_page_url() {
		register.startButton();
	}
	@Then("The user should land on the DS_Algo Get Started page")
	public void the_user_should_land_on_the_ds_algo_get_started_page() {
	   System.out.println("Preparing for the Interviews. You are at the right place!");
	}
	
	@Given("The user is on new registration page")
	public void the_user_is_on_new_registration_page() {
	    System.out.println("User is on registration page");
	    
	}
	@When("The user clicks Register button")
	public void the_user_clicks_register_button() {
		
		register.registerlink();
	}
   @Then("The error message appears below  username textbox")
	public void The_error_message_appears_below_username_textbox() {
		register.userNameValErr();
	}
    @When("The user click register after entering username with other field empty")
	public void the_user_click_register_after_entering_username_with_other_field_empty() {
    	register.username();
    	register.ClickregisterButton();
	}

	@Then("The error message appears below  password textbox")
	public void The_error_message_appears_below_password_textbox() {
		register.passwordValErr();
	}
	@When("The user click register after entering Username and password with Password Confirmation field empty")
	public void The_user_click_register_afterentering_Username_and_password_with_Password_Confirmation_field_empty() {
		register.password();
		register.ClickregisterButton();
	}
	@Then("The error message appears below  Password Confirmation textbox")
	public void the_error_message_appears_below_password_confirmation_textbox() {
		register.passwordValErr();
		
	}
	@When("The user click register after entering valid username and password and invalid Password Confirmation")
	public void the_user_click_register_after_entering_valid_username_and_password_and_invalid_password_confirmation() {
		
		register.passwordconfirm();
		register.ClickregisterButton();
	}

	@Then("The user is able to see warning msg password did not match")
	public void the_user_is_able_to_see_warning_msg_password_did_not_match() throws InterruptedException {
	 System.out.println(register.warningMsg());
	}
	@When("user enter username and password already register")
	public void user_enter_username_and_password_already_register() {
		register.username();
		register.password();
		register.correctpasswordconfirm();
	}

	@Then("user should see user already exist message")
	public void user_should_see_user_already_exist_message() {
	    System.out.println("user already exist:");
	}

	@When("user click login")
	public void user_click_login() {
		register.login();
	}

	@Then("user should be redirected to login page")
	public void user_should_be_redirected_to_login_page() {
		 System.out.println("user redirected:");
	}
	@When("user enter username with digits")
	public void user_enter_username_with_digits() {
	  register.username();
	  register.ClickregisterButton();
   }
	@When("user click register after enter password with digits")
	public void user_click_register_after_enter_password_with_digits() {
	    register.passwordDigits();
	}

	@Then("user should see invalid password message")
	public void user_should_see_invalid_password_message() {
	   register.passwordValErr();
	}

	@When("user enter username and password with correct password confimation")
	public void user_enter_username_and_password_with_correct_password_confimation() {
	    register.username();
	    register.password();
	    register.passwordconfirm();
	    register.ClickregisterButton();
	}

	@Then("The user should able to see  successful message New Account Created.You are logged in as ninjagirlss on the DS Algo Home Page")
	public void the_user_should_able_to_see_successful_message_new_account_created_you_are_logged_in_as_ninjagirlss_on_the_ds_algo_home_page() {
	    graph.toHomePage();
	}

}
