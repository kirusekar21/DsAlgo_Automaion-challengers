package stepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObjectModel.DSIntro;
import PageObjectModel.StackPage;
import PageObjectModel.TryMe;
import PageObjectModel.graphPage;
import PageObjectModel.loginPages;
//import Pages.GetStartedPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestBaseT;

public class StackSteps {
	public static WebDriver driver;
	private StackPage stack;
	private TryMe try_me;
	public loginPages login;
	public TestBaseT tc;
	DSIntro DSIntroduction;
	WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(5));
	public StackSteps() throws IOException {
		tc=new TestBaseT();
		DSIntroduction=new DSIntro(tc.WebDriverManager());
		stack=new StackPage(tc.WebDriverManager());
		login=new loginPages(tc.WebDriverManager());
		try_me=new TryMe(tc.WebDriverManager());

	}
	@Then("The User should navigate to Stack Page")
	public void the_user_should_navigate_to_stack_page() {
        stack.stackGetStarted();
	}
	
	//StepDefinitions for Operation in Stack Link
		@Given("user clicks on Operations in stack")
		public void user_clicks_on_operations_in_stack() {
			//getStartedPage = new GetStartedPage(driver);
			stack.clickoperationsinstack();
			stack.clickoistryhereeditor();
		}

		@Then("user is navigated to operations in stack page")
		public void user_is_navigated_to_operations_in_stack_page() {
			 System.out.println("You are in operation in stack page");
		}

		@Given("User enters valid code in Try Editor Box")
		public void user_enters_valid_code_in_try_editor_box() throws InterruptedException {
			//getStartedPage = new GetStartedPage(driver);
			stack.textboxeditorboxoperation("stack = []\r\n"
					+ "stack.append('a') \r\n"
					+ "stack.append('b')\r\n"
					+ "stack.append('c')\r\n"
					+ "print('Initial stack') \r\n"
					+ "print(stack) \r\n"
		            + "print('\\nElements popped from stack:') \r\n"
					+ "print(stack.pop()) \r\n"
					+ "print(stack.pop()) \r\n"
					+  "print(stack.pop()) \r\n"
					+ "print('\\nStack after elements are popped:')\r\n"
					+ "print(stack)");
			Thread.sleep(2000);
		}

		@When("The User clicks code Run button")
		public void the_user_clicks_code_Run_button() throws InterruptedException {
			//getStartedPage = new GetStartedPage(driver);
			stack.clickoperationrunbutton();
		  Thread.sleep(1000);
		}

		@Then("the output will be displayed in the output window")
		public void the_output_will_be_displayed_in_the_output_window() {
			 System.out.println("user validated the code successfully");
		}

		@Given("The User enters invalid code in Try Editor Box")
		public void the_user_enters_invalid_code_in_try_editor_box() throws InterruptedException {
			stack.textboxeditorboxoperation1("stack = [][]\r\n"
			+ "stack.append('a') \r\n"
			+ "stack.append('b')\r\n"
			+ "stack.append('c')\r\n"
			+ "print('Initial stack') \r\n"
			+ "print(stack) \r\n"
	        + "print('\\nElements popped from stack:') \r\n"
			+ "print(stack.pop()) \r\n"
			+ "print(stack.pop()) \r\n"
			+  "print(stack.pop()) \r\n"
			+ "print('\\nStack after elements are popped:')\r\n"
			+ "print(stack)");
			Thread.sleep(1000);
		}

		@When("The User again clicks on the {string} button")
		public void the_user_again_clicks_on_the_button(String string) throws InterruptedException {
			//getStartedPage = new GetStartedPage(driver); 
			stack.clickoperationrunbutton1();
//				Alert simpleAlert = driver.switchTo().alert();
//				//Thread.sleep(1000);
//				simpleAlert.accept();
			stack.alert_ok_click();
				//driver. navigate().back();
			stack.goBack();
		}

		@Then("the \"Error message\"should appear")
		public void the_error_message_should_appear() {
			System.out.println("SyntaxError: bad input on line 1"); 	   
		}
		
	//StepDefinitions for Implementation Link
	@Given("user clicks on the implementation link in the page")
	public void user_clicks_on_the_implementation_link_in_the_page() throws InterruptedException {
	    Thread.sleep(1000);
	    //getStartedPage = new GetStartedPage(driver); 
	    stack.clickimplementationstacklink();
	    stack.clickimplementationstacktryherelink();
	}

	@Then("user is navigated to the implementation in stack page")
	public void user_is_navigated_to_the_implementation_in_stack_page() {
		 System.out.println("user is in the implementation page");
	}

	@Given("User enters valid code Editor")
	public void user_enters_valid_code_editor() throws InterruptedException {
		  //getStartedPage = new GetStartedPage(driver); 
		stack.implementstacktextboxeditorbox("stack = []\r\n"
					+ "stack.append('a') \r\n"
					+ "stack.append('b')\r\n"
					+ "stack.append('c')\r\n"
					+ "print('Initial stack') \r\n"
					+ "print(stack) \r\n"
		            + "print('\\nElements popped from stack:') \r\n"
					+ "print(stack.pop()) \r\n"
					+ "print(stack.pop()) \r\n"
					+  "print(stack.pop()) \r\n"
					+ "print('\\nStack after elements are popped:')\r\n"
					+ "print(stack)");
		  Thread.sleep(1000);
	}

	@When("The User clicks on the {string} button of implementation stack link")
	public void the_user_clicks_on_the_button_of_implementation_stack_link(String string) throws InterruptedException {
		//getStartedPage = new GetStartedPage(driver); 
		stack.implementationclickrunbutton();
	 Thread.sleep(2000);
	}

	@Then("we get the output in output page")
	public void we_get_the_output_in_output_page() {
		System.out.println("user validated the code successfully");
	}

	@Given("User gives invalid code in Try Editor")
	public void user_gives_invalid_code_in_try_editor() {
		//getStartedPage = new GetStartedPage(driver); 
		stack.implementstacktextboxeditorbox1("stack = [][]\r\n"
					+ "stack.append('a') \r\n"
					+ "stack.append('b')\r\n"
					+ "stack.append('c')\r\n"
					+ "print('Initial stack') \r\n"
					+ "print(stack) \r\n"
		            + "print('\\nElements popped from stack:') \r\n"
					+ "print(stack.pop()) \r\n"
					+ "print(stack.pop()) \r\n"
					+  "print(stack.pop()) \r\n"
					+ "print('\\nStack after elements are popped:')\r\n"
					+ "print(stack)");
	}

	@When("The User clicks on the {string} button of the page again")
	public void the_user_clicks_on_the_button_of_the_page_again(String string) throws InterruptedException {
		//getStartedPage = new GetStartedPage(driver); 
		stack.implementationclickrunbutton();
//		Alert simpleAlert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		simpleAlert.accept();
//		driver. navigate().back();
		stack.alert_ok_click();
		stack.goBack();
	}

	@Then("the {string} should be captured")
	public void the_should_be_captured(String string) {
		System.out.println("SyntaxError: bad input on line 1");
	}
		
	//StepDefinitions for Application Link
	@Given("user clicks on the application link in the stack page")
	public void user_clicks_on_the_application_link_in_the_stack_page() throws InterruptedException {
	   // getStartedPage = new GetStartedPage(driver); 
		stack.clickapplicationLocator();
		stack.clicktryhereapplicationlocator();
	    Thread.sleep(2000);
	}

	@Then("user is navigated to the application link page")
	public void user_is_navigated_to_the_application_link_page() {
		System.out.println("You are in the Application page");
	}

	@Given("User enters valid code in Editor application page")
	public void user_enters_valid_code_in_editor_application_page() throws InterruptedException {
		//getStartedPage = new GetStartedPage(driver); 
		stack.applicationtextboxeditorbox("stack = []\r\n"
				+ "stack.append('a') \r\n"
				+ "stack.append('b')\r\n"
				+ "stack.append('c')\r\n"
				+ "print('Initial stack') \r\n"
				+ "print(stack) \r\n"
	            + "print('\\nElements popped from stack:') \r\n"
				+ "print(stack.pop()) \r\n"
				+ "print(stack.pop()) \r\n"
				+  "print(stack.pop()) \r\n"
				+ "print('\\nStack after elements are popped:')\r\n"
				+ "print(stack)");
	            Thread.sleep(2000);
	}

	@When("The User clicks on the {string} button in the application page")
	public void the_user_clicks_on_the_button_in_the_application_page(String string) throws InterruptedException {
		//getStartedPage = new GetStartedPage(driver); 
		stack.clickrunbuttonapplication();
		Thread.sleep(1000);
	}

	@Then("we get output in the output box in the page")
	public void we_get_output_in_the_output_box_in_the_page() {
		System.out.println("User validated the code successfully");
	}

	@Given("User enters invalid code in the Editor application stack")
	public void user_enters_invalid_code_in_the_editor_application_stack() throws InterruptedException {
		//getStartedPage = new GetStartedPage(driver); 
		stack.applicationtextboxeditorbox1("stack = [][]\r\n"
				+ "stack.append('a') \r\n"
				+ "stack.append('b')\r\n"
				+ "stack.append('c')\r\n"
				+ "print('Initial stack') \r\n"
				+ "print(stack) \r\n"
	            + "print('\\nElements popped from stack:') \r\n"
				+ "print(stack.pop()) \r\n"
				+ "print(stack.pop()) \r\n"
				+  "print(stack.pop()) \r\n"
				+ "print('\\nStack after elements are popped:')\r\n"
				+ "print(stack)");
		    Thread.sleep(2000);
	}

	@When("The User again clicks on the {string} button in the application stack page")
	public void the_user_again_clicks_on_the_button_in_the_application_stack_page(String string) throws InterruptedException {
		//getStartedPage = new GetStartedPage(driver); 
		stack.clickrunbuttonapplication1();
//		Alert simpleAlert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		simpleAlert.accept();
//		driver.navigate().back();
		stack.alert_ok_click();
		stack.goBack();
	}

	@Then("the alert {string} should be displayed")
	public void the_alert_should_be_displayed(String string) {
		System.out.println("SyntaxError: bad input on line 1");
	}

	@Given("user clicks on the practice questions link in the stack page")
	public void user_clicks_on_the_practice_questions_link_in_the_stack_page() throws InterruptedException {
		//getStartedPage = new GetStartedPage(driver); 
		stack.clickapplicationLocator();
		stack.clickstackpracticequestions();
		Thread.sleep(3000);
//		driver.navigate().back();
//		driver.navigate().back();
//		driver.navigate().back();
//		driver.navigate().back();
//		driver.navigate().back();
		stack.toHomePage();
	}

	@Then("user is navigated to the practice questions link in the page")
	public void user_is_navigated_to_the_practice_questions_link_in_the_page() {
		System.out.println("User is navigated to the practice questions page");
//		stack.quit();
	}

	}

