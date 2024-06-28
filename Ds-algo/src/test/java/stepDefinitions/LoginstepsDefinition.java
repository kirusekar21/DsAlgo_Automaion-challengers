package stepDefinitions;
import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.DSIntro;
import PageObjectModel.TryMe;
import PageObjectModel.graphPage;
import PageObjectModel.loginPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestBaseT;
public class LoginstepsDefinition {
	
	public static WebDriver driver;
    private graphPage graph;
	private TryMe try_me;
	public loginPages login;
	public TestBaseT tc;
	DSIntro DSIntroduction;
	WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(5));
  public LoginstepsDefinition() throws IOException {
		tc=new TestBaseT();
		DSIntroduction=new DSIntro(tc.WebDriverManager());
		login=new loginPages(tc.WebDriverManager());
		try_me=new TryMe(tc.WebDriverManager());
		graph=new graphPage(tc.WebDriverManager());
	}
//new code	
  @Given("The user should open the DS Algo Portal URL")
  public void the_user_should_open_the_ds_algo_portal_url() throws InterruptedException, IOException {
	  
	  System.out.println("User should be able to navigate to DS Algo portal URL");
  }
  
  @Given("User is on the DS Introduction page")
  public void user_is_on_the_ds_introduction_page() throws InterruptedException {
	  
	  System.out.println("The User is on the DS Introduction page");
		 Thread.sleep(2000);
  }
  
  @When("User clicks the datastructures dropdown list")
	public void user_clicks_the_datastructures_dropdown_list() throws InterruptedException {
		
	
		DSIntroduction.clickdropdownbutton();
		 Thread.sleep(2000);
	}
	
	@When("The User selects any datastructures from the dropdown list without signin")
	public void the_user_selects_any_datastructures_from_the_dropdown_list_without_signin() throws InterruptedException {
	   
		
		DSIntroduction.clickDSbutton();
		Thread.sleep(2000);
		}
	
	@Then ("The User should be able to see the error message {string}")
	public void the_user_should_be_able_to_see_the_error_message(String string) throws InterruptedException {
		
	System.out.println("Error message - you are not logged in");
		
	}
	@When("The User clicks any {string} button of datastructures on the DS introduction page")
	public void the_user_clicks_any_button_of_datastructures_on_the_ds_introduction_page(String string) throws InterruptedException {
	
		
		 	DSIntroduction.clickGetstarted();
	     	Thread.sleep(2000);
	    
		}
	
	@When("User clicks Registration link on the DS introduction page")
  public void user_clicks_registration_link_on_the_ds_introduction_page() throws InterruptedException {
	 
	
		DSIntroduction.clickRegistration();
		Thread.sleep(2000);
}

  @Then ("User should be able to navigate to Registration page")
  public void user_should_be_able_to_navigate_to_registration_page() throws InterruptedException {
	 
  
  	DSIntroduction.clickRegistration();
		Thread.sleep(2000);
}
  
 

  @Then("The User should navigate to {string}")
  public void the_user_should_navigate_to(String string) throws InterruptedException {
      
  	Assert.assertEquals(driver.findElement(By.cssSelector("body:nth-child(2) > div.alert.alert-primary")).isDisplayed(), true); 
  	Thread.sleep(2000);
  	
  }
  
  
// new code 
		
   @Given("The User is on the DS Algo Sign in page")
	    public void the_user_is_on_the_ds_algo_sign_in_page()  {
	   
	   DSIntroduction.clickSignIn();
	   System.out.println("User is need to login:");
	    	
   }

	 @When("The User clicks Login button after entering valid {string} and {string}")
	    public void the_user_clicks_login_button_after_entering_valid_and(String user, String pass)  {
	        
	    	login.enterUsername(user);
	        login.enterpassword(pass);
	        login.login_btn();
	        
	    }

	    @Given("The User should navigate to Data structures - Introduction page")
	    public void the_user_should_navigate_to_Data_structures_Introduction_page() {
	         System.out.println(" Data structures - Introduction page");
	    	
	    }
	    
	    

@Given("The User is on Data structures - Introduction page")
public void the_user_is_on_data_structures_introduction_page() {
	DSIntroduction.DataGetStarted();
}

@When("The User clicks Time complexity")
public void the_user_clicks_time_complexity() {
	DSIntroduction.clickTime();
}

@When("click tryme")
public void click_tryme() {
    try_me.clickTryMe();
}

@Then("The User should be directed to code Editor")
public void the_user_should_be_directed_to_code_editor() {
	System.out.println(" Editor Page");
}

@Given("user enter valid data")
public void user_enter_valid_data() {
	DSIntroduction.validcode();
}

@When("user click run")
public void user_click_run() {
	DSIntroduction.run_btn_click();
}

@Then("The User should be see output")
public void the_user_should_be_see_output() throws InterruptedException {
	DSIntroduction.outputText();
	Thread.sleep(2000);
	DSIntroduction.refresh();
}
@Given("user enter invalid data")
public void user_enter_invalid_data() {
	
	DSIntroduction.invalidCode();
}
@Given("user enter no data")
public void user_enter_no_data() throws InterruptedException {
	DSIntroduction.run_btn_click();
	Thread.sleep(2000);
	DSIntroduction.refresh();
}

@Then("Nothing displays and user directed to dspage")
public void nothing_displays_and_user_directed_to_dspage() {
	DSIntroduction.refresh();
	DSIntroduction.goBack();
}
@Given("user on practice question")
public void user_on_practice_question() {
//	DSIntroduction.clickPractice();
	System.out.println("user on practice page");
}
@When("User click practice")
public void user_click_practice() throws InterruptedException {
	DSIntroduction.clickPractice();
}
@When ("Nothing displays")
public void  Nothing_displays(){
	System.out.println("Nothing displays");
}
@Then("user directed to Ds Home page")
public void user_directed_to_Ds_Home_page(){
	DSIntroduction.toHomePage();
}




	}
		    



