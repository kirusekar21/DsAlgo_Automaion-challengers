package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.ArrayPage;
import PageObjectModel.DSIntro;
import PageObjectModel.TryMe;
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
	
	//StepDefinitions for Arrays in Python Link
	@Given("user clicks on Arrays in Python")
	public void user_clicks_on_arrays_in_python() {
		array.clickarraysinpython();
		array.clickaiptryhereeditor();
	}

	@Then("user is navigated to Arrays in Python page")
	public void user_is_navigated_to_arrays_in_python_page() {
		System.out.println("You are in Arrays in Python page");
	}

	@Given("User enters valid code in Arrays in Python Try Editor Box")
	public void user_enters_valid_code_in_arrays_in_python_try_editor_box() throws InterruptedException {
		array.textboxeditorboxarrays("arr = []\r\n"
				+ "arr.append(10) \r\n"
				+ "arr.append(20)\r\n"
				+ "arr.append(30)\r\n"
				+ "arr.append(40)\r\n"
				+ "arr.append(50)\r\n"
				+ "print(arr) \r\n"             
				+ "print(arr)");
		Thread.sleep(2000);
	}

	@When("The User clicks {string} in AIP button")
	public void the_user_clicks_in_aip_button(String string) throws InterruptedException {
		array.clickarraysrunbutton();
		Thread.sleep(2000);
	}

	@Then("the output will be displayed in the output window AIS")
	public void the_output_will_be_displayed_in_the_output_window_ais() {
		System.out.println("user validated the code successfully");
	}

	@Given("The User enters invalid code in Arrays in Python Try Editor Box")
	public void the_user_enters_invalid_code_in_arrays_in_python_try_editor_box() throws InterruptedException {
		array.textboxeditorboxarrays1("arr = [][]\r\n"
				+ "arr.append(10) \r\n"
				+ "arr.append(20)\r\n"
				+ "arr.append(30)\r\n"
				+ "arr.append(40)\r\n"
				+ "arr.append(50)\r\n"
				+ "print(arr) \r\n"             
				+ "print(arr)");
		Thread.sleep(1000);
	}

	@When("The User again clicks on the {string} in AIP button")
	public void the_user_again_clicks_on_the_in_aip_button(String string) {
		array.clickarraysrunbutton1();
	array.alert_ok_click();
		//driver. navigate().back();
	array.goBack();
	}

	@Then("the \"Error message\"should appear in Arrays in Python")
	public void the_error_message_should_appear_in_arrays_in_python() {
		System.out.println("SyntaxError: bad input on line 1"); 
	}

	
	//StepDefinitions for Arrays using List
	@Given("the user clicks on the Arrays using List link in the page")
	public void the_user_clicks_on_the_arrays_using_list_link_in_the_page() throws InterruptedException {
	   array.clickarraylistlink();
	   array.clickarraylisttryherelink();
	   Thread.sleep(1000);
	}

	@Then("user is navigated to the Arrays using List in Arrays page")
	public void user_is_navigated_to_the_arrays_using_list_in_arrays_page() {
		System.out.println("user is in the Arrays using list page");
	}

	@Given("User enters valid code Editor in Arrays List Page")
	public void user_enters_valid_code_editor_in_arrays_list_page() throws InterruptedException {
		array.arraylisttextboxeditorbox("arr = []\r\n"
				+ "arr.append(10) \r\n"
				+ "arr.append(20)\r\n"
				+ "arr.append(30)\r\n"
				+ "arr.append(40)\r\n"
				+ "arr.append(50)\r\n"
				+ "print(arr) \r\n"            
				+ "print(arr)");		
		Thread.sleep(1000);
	}

	@When("The User clicks on the {string} button of Arrays using List link")
	public void the_user_clicks_on_the_button_of_arrays_using_list_link(String string) throws InterruptedException {
	    array.arraylistclickrunbutton();
	    Thread.sleep(1000);
	}

	@Then("we get the output in output page of Arrays using List")
	public void we_get_the_output_in_output_page_of_arrays_using_list() {
		System.out.println("user validated the code successfully");
	}

	@Given("User gives invalid code in Arrays using List Try Editor")
	public void user_gives_invalid_code_in_arrays_using_list_try_editor() {
		array.arraylisttextboxeditorbox1("arr = [][]\r\n"
				+ "arr.append(10) \r\n"
				+ "arr.append(20)\r\n"
				+ "arr.append(30)\r\n"
				+ "arr.append(40)\r\n"
				+ "arr.append(50)\r\n"
				+ "print(arr) \r\n"             
				+ "print(arr)");
	}

	@When("The User clicks on the {string} button of the Arrays using List page again")
	public void the_user_clicks_on_the_button_of_the_arrays_using_list_page_again(String string) {
		array.arraylistclickrunbutton1();

				array.alert_ok_click();
				array.goBack();
		
	}

	@Then("the {string} should be captured in Arrays using List")
	public void the_should_be_captured_in_arrays_using_list(String string) {
		System.out.println("SyntaxError: bad input on line 1");
	}

	
	//StepDefinitions for Basic Opertaion in List Link
	@Given("user clicks on the Basic Operations in List in the Arrays page")
	public void user_clicks_on_the_basic_operations_in_list_in_the_arrays_page() throws InterruptedException {
	   array.clickBasicLocator();
	   array.clicktryherebasiclocator();
	   Thread.sleep(1000);
	}

	@Then("user is navigated to the Basic Operations in List page")
	public void user_is_navigated_to_the_basic_operations_in_list_page() {
		System.out.println("You are in the Basic Operation in List page");
	}

	@Given("User enters valid code in Editor Basic Operations in List page")
	public void user_enters_valid_code_in_editor_basic_operations_in_list_page() {
		array.basictextboxeditorbox("arr = []\r\n"
				+ "arr.append(10) \r\n"
				+ "arr.append(20)\r\n"
				+ "arr.append(30)\r\n"
				+ "arr.append(40)\r\n"
				+ "arr.append(50)\r\n"
				+ "print(arr) \r\n"             
				+ "print(arr)");
	}

	@When("The User clicks on the {string} button in the Basic Operations in List page")
	public void the_user_clicks_on_the_button_in_the_basic_operations_in_list_page(String string) throws InterruptedException {
	   array.clickrunbuttonbasic();
	   Thread.sleep(1000);
	}

	@Then("we get output in the output box in the Basic Operations in List page")
	public void we_get_output_in_the_output_box_in_the_basic_operations_in_list_page() {
		System.out.println("User validated the code successfully");
	}

	@Given("User enters invalid code in the Editor Basic Operations in List")
	public void user_enters_invalid_code_in_the_editor_basic_operations_in_list() {
		array.basictextboxeditorbox1("arr = [][]\r\n"
				+ "arr.append(10) \r\n"
				+ "arr.append(20)\r\n"
				+ "arr.append(30)\r\n"
				+ "arr.append(40)\r\n"
				+ "arr.append(50)\r\n"
				+ "print(arr) \r\n"             
				+ "print(arr)");
	}

	@When("The User again clicks on the {string} button in the Basic Operations in List page")
	public void the_user_again_clicks_on_the_button_in_the_basic_operations_in_list_page(String string) {
		array.clickrunbuttonbasic1();
		array.alert_ok_click();
		array.goBack();
		
	}

	@Then("the alert {string} should be displayed in the Basic Operations in List")
	public void the_alert_should_be_displayed_in_the_basic_operations_in_list(String string) {
		System.out.println("SyntaxError: bad input on line 1");
	}

	
	//Step Definition for Application in Arrays page
	@Given("user clicks on the application of Array link in the Arrays page")
	public void user_clicks_on_the_application_of_array_link_in_the_arrays_page() {
	    array.clickapparrayLocator();
	    array.clicktryhereapparraylocator();
	}

	@Then("user is navigated to the application of array link page")
	public void user_is_navigated_to_the_application_of_array_link_page() {
		System.out.println("You are in the Application page");
	}

	@Given("User enters valid code in Editor application of array page")
	public void user_enters_valid_code_in_editor_application_of_array_page() throws InterruptedException {
		array.apparraytextboxeditorbox("arr = []\r\n"
				+ "arr.append(10) \r\n"
				+ "arr.append(20)\r\n"
				+ "arr.append(30)\r\n"
				+ "arr.append(40)\r\n"
				+ "arr.append(50)\r\n"
				+ "print(arr) \r\n"             
				+ "print(arr)");
		Thread.sleep(1000);
	}

	@When("The User clicks on the {string} button in the application of array page")
	public void the_user_clicks_on_the_button_in_the_application_of_array_page(String string) throws InterruptedException {
	   array.clickrunbuttonapparray();
	   Thread.sleep(1000);
	}

	@Then("we get output in the output box in the application of array page")
	public void we_get_output_in_the_output_box_in_the_application_of_array_page() {
		System.out.println("User validated the code successfully");
	}

	@Given("User enters invalid code in the Editor application of array")
	public void user_enters_invalid_code_in_the_editor_application_of_array() throws InterruptedException {
		array.apparraytextboxeditorbox1("arr = [][]\r\n"
				+ "arr.append(10) \r\n"
				+ "arr.append(20)\r\n"
				+ "arr.append(30)\r\n"
				+ "arr.append(40)\r\n"
				+ "arr.append(50)\r\n"
				+ "print(arr) \r\n"             
				+ "print(arr)");
		Thread.sleep(1000);
	}

	@When("The User again clicks on the {string} button in the application of array page")
	public void the_user_again_clicks_on_the_button_in_the_application_of_array_page(String string) {
	array.clickrunbuttonapparray1();
		array.alert_ok_click();
		array.goBack();
	}

	@Then("the alert {string} should be displayed in application of array")
	public void the_alert_should_be_displayed_in_application_of_array(String string) {
		System.out.println("SyntaxError: bad input on line 1");
	}

	@Given("user clicks on the practice questions link in the array page")
	public void user_clicks_on_the_practice_questions_link_in_the_array_page() throws InterruptedException {
	    array.clickapparrayLocator();
	    array.clickarraypracticequestions();
	    array.searchpracticelink();
	    Thread.sleep(3000);
	    array.goBack();	
	    Thread.sleep(3000);
	    array.practicequestion1link();
	    Thread.sleep(3000);
	    array.goBack();	   
	    Thread.sleep(3000);
	    array.practicequestion2link();
	    Thread.sleep(3000);
	    array.goBack();  
	    Thread.sleep(3000);
	    array.practicequestion3link();
	    Thread.sleep(3000);
	    array.goBack();
	    Thread.sleep(1000);
	    array.goBack();
	    Thread.sleep(1000);
	    array.goBack();
	    Thread.sleep(1000);
	    array.goBack();
	    Thread.sleep(1000);
	    array.goBack();
	    Thread.sleep(1000);
	    array.goBack();
	    Thread.sleep(1000);
	    array.goBack();
	    
	}

	@Then("user is navigated to the practice questions link in the array page")
	public void user_is_navigated_to_the_practice_questions_link_in_the_array_page() {
		System.out.println("User is navigated to the practice questions page");
	}
	@Given ("sign out")
	public void sign_out() {
		login.signout();
	}

}