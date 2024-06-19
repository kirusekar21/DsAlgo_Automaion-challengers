package stepDefinitions;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObjectModel.RegistrationPage;
import PageObjectModel.graphPage;
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
	
   public Registartion_Steps() throws IOException {
		tc=new TestBaseT();
		register=new RegistrationPage(tc.WebDriverManager());
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

}
