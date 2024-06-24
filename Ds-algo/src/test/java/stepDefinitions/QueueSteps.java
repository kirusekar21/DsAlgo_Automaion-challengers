package stepDefinitions;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObjectModel.DSIntro;
import PageObjectModel.QueuePage;
import PageObjectModel.TryMe;
import PageObjectModel.loginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestBaseT;

public class QueueSteps {
	public static WebDriver driver;
	private QueuePage Queue;
	private TryMe try_me;
	public loginPages login;
	public TestBaseT tc;
	DSIntro DSIntroduction;
	WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(5));
	public QueueSteps() throws IOException {
		tc=new TestBaseT();
		DSIntroduction=new DSIntro(tc.WebDriverManager());
		Queue=new QueuePage(tc.WebDriverManager());
		login=new loginPages(tc.WebDriverManager());
		try_me=new TryMe(tc.WebDriverManager());

	}
	@Then("The User should navigate to Queue Page")
	public void the_user_should_navigate_to_Queue_page() {
	       Queue.QueueGetStarted();
	}
	
	@Given("The User is in the Queue page after logged in")
	public void the_user_is_in_the_queue_page_after_logged_in() throws InterruptedException {
	
	System.out.println("The user successfully navigated to the Queue page");
		
		 Thread.sleep(2000);
	}

	@When("The User clicks the Implementation of Queue in python link")
	public void the_user_clicks_the_Implementation_of_Queue_in_python_link() throws InterruptedException {
			Queue.clicklink();
		 Thread.sleep(2000);
	}

	@Then("The User should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
	    System.out.println("The User is on the page Implementation 	of Queue in python");
	}

	@And("User is in the Try Editor page")
	public void user_is_in_the_try_editor_page() {
	    System.out.println("User is on the Try Editor page");
	}

	@When("User clicks the {string} button")
	public void user_clicks_the_button(String string) throws InterruptedException {
		
		Queue.clicktryeditor();
		 Thread.sleep(2000);
	}

	@Then("page navigated to the python coding part")
	public void page_navigated_to_the_python_coding_part() {
		 System.out.println("The page is navigated to the python coding part");
			
	}
	
	@Given("User given valid code in the Try Editor")
	public void user_given_valid_code_in_the_try_editor() throws InterruptedException {
		
		Queue.Enterpythoncode("queue =[]\r\n"
				+ "queue.append(1)\r\n"
				+ "queue.append(2)\r\n"
				+ "queue.append(3)\r\n"
				+ "print(queue)\r\n"
				+ "x = queue.pop(0)\r\n"
				+ "print(x)\r\n"
				+ "print(queue)");
		Thread.sleep(2000);
	}

	@When("The User clicks the Run button")
	public void the_user_clicks_the_button() throws InterruptedException {
	
		Queue.clickRunbutton();
		Thread.sleep(2000);
		
	}

	@Then("we get output in the output window")
	public void we_get_output_in_the_output_window() {
	    System.out.println("User validated the code successfully");
	}
	
	@Given("User given invalid code in the Try Editor")
	public void user_given_invalid_code_in_the_try_editor() throws InterruptedException {
		
		Queue.Enterpythoncode1("queue =[][]\r\n"
				+ "queue.append(1)\r\n"
				+ "queue.append(2)\r\n"
				+ "queue.append(3)\r\n"
				+ "print(queue)\r\n"
				+ "x = queue.pop(0)\r\n"
				+ "print(x)\r\n"
				+ "print(queue)");
		Thread.sleep(2000);
		
		}
	@When("The User clicks the {string} button again")
	public void the_user_clicks_the_button_again(String string) throws InterruptedException {
		
		Queue.clickRunbutton1();
		Queue.alert_ok_click();
		Queue.goBack();
		

}

@Then("we get the {string}")
	public void we_get_the(String string) {
		  System.out.println("User gets the error message");
		
	}

@Given("The User navigated back to the Queue page")
public void the_user_navigated_back_to_the_queue_page() {
    System.out.println("The User is navigated back to the Queue page");
    }


@When("The User clicks the {string}")
public void the_user_clicks_the(String string) {
	
	Queue.clickcollectionslink();
}

@Given("User is on the Try here page")
public void user_is_on_the_try_here_page() {
   System.out.println("User is on the Try Here page");
}

@When("User clicks {string} button")
public void user_clicks_button(String string) {

	Queue.clickTryHere();
}

@Then("page navigated to the pythonbox")
public void page_navigated_to_the_pythonbox() {
    System.out.println("Page is navigated to the Python box");
}

@Given("User given valid code in the Try Here box")
public void user_given_valid_code_in_the_try_here_box() throws InterruptedException {

	Queue.pythoncodequeue("from collections import deque\r\n"
			+ "my_deque = deque()\r\n"
			+ "print(my_deque)\r\n"
			+ "my_deque.append(1) \r\n"
			+ "my_deque.append(2) \r\n"
			+ "my_deque.appendleft(3) \r\n"
			+ "print(my_deque)");
	Thread.sleep(2000);
	
}

@When("The User clicks {string} button")
public void the_user_clicks_button(String string) throws InterruptedException {
	
	Queue.clickRunbutton2();
	Thread.sleep(2000);
}

@Then("we get output for the code")
public void we_get_output_for_the_code() {
   System.out.println("code is validated successfully");
}

@Given("User given invalid code in the Try Here box")
public void user_given_invalid_code_in_the_try_here_box() throws InterruptedException {
	
	Queue.pythoncodequeue1("from collections import deque\r\n"
			+ "my_deque = deque()()\r\n"
			+ "print(my_deque)\r\n"
			+ "my_deque.append(1) \r\n"
			+ "my_deque.append(2) \r\n"
			+ "my_deque.appendleft(3) \r\n"
			+ "print(my_deque)");
	Thread.sleep(2000);
	
}

@When("The User clicks {string} button again")
public void the_user_clicks_button_again(String string) throws InterruptedException {
    
	
	Queue.clickRunbutton3();
	Queue.alert_ok_click();
	Queue.goBack();
	
	}

@Then("we get the {string} in the Alertbox")
public void we_get_the_in_the_alertbox(String string) {

	 System.out.println("code is validated unsuccessfully");
   
}
@Given("The User is on the Implementation Array page")
public void the_user_is_on_the_implementation_array_page() {
    System.out.println("User is on the Implementation Array page");
}

@When("The User click the {string}")
public void the_user_click_the(String string) throws InterruptedException {
	
	Queue.clickArrayImplementation();
	Queue.scrollAction();
	Thread.sleep(2000);
}

@Given("User is on the Try here page for Implementation of Array")
public void user_is_on_the_try_here_page_for_implementation_of_array() {
    System.out.println("The User is on the Try here page for Implementation of Array");
}

@When("User clicks {string} button in the Array page")
public void user_clicks_button_in_the_array_page(String string) throws InterruptedException {
	
	Queue.clickTryHerebox();
	
	
}

@Then("page navigated to the pythoncodebox page")
public void page_navigated_to_the_pythoncodebox_page() {
    System.out.println("The page successfully navigated to the pythoncodebox");
}

@Given("User given valid code in the Try Here box for Array")
public void user_given_valid_code_in_the_try_here_box_for_array() {
	
	Queue.pythoncodeArray("#empty array declaration\r\n"
			+ "arr = []\r\n"
			+ "\r\n"
			+ "#built-in list function that adds three elements to the array.\r\n"
			+ "arr.append(1)\r\n"
			+ "arr.append(2)\r\n"
			+ "arr.append(3)\r\n"
			+ "\r\n"
			+ "print(\"printing array...\")\r\n"
			+ "print(arr)\r\n"
			+ "\r\n"
			+ "#built-in list function that removes elements from an array\r\n"
			+ "print(\"removing two elements from array...\")\r\n"
			+ "arr.pop(0)\r\n"
			+ "arr.pop(0)\r\n"
			+ "\r\n"
			+ "print(\"printing the remaining element(s) in array...\")\r\n"
			+ "print(arr)\r\n"
			+ "");
}

@When("The User clicks {string} button for Array Implementation")
public void the_user_clicks_button_for_array_implementation(String string) throws InterruptedException {
	
	Queue.clickRunbutton4();
	Thread.sleep(2000);
}

@Then("User get valid output for the Array Implementation")
public void user_get_valid_output_for_the_array_implementation() {
    System.out.println("User executed the output successfully");
}

@Given("User given invalid code in the Try Here box for Array")
public void user_given_invalid_code_in_the_try_here_box_for_array() {
    
	
	Queue.pythoncodeArray1("#empty array declaration\r\n"
			+ "arr = []\r\n"
			+ "\r\n"
			+ "#built-in list function that adds three elements to the array.\r\n"
			+ "arr.append(1)\r\n"
			+ "arr.append(2)\r\n"
			+ "arr.append(3)\r\n"
			+ "\r\n"
			+ "print(\"printing array...\")\r\n"
			+ "print(arr)\r\n"
			+ "\r\n"
			+ "#built-in list function that removes elements from an array\r\n"
			+ "print(\"removing two elements from array...\")\r\n"
			+ "arr.pop(0)\r\n"
			+ "arr.pop(0)\r\n"
			+ "\r\n"
			+ "print(\"printing the remaining element(s) in array...\")\r\n"
			+ "print(arr)\r\n////"
			+ "");
}

@When("The User clicks {string} button again for Array Implementation")
public void the_user_clicks_button_again_for_array_implementation(String string) throws InterruptedException {

	Queue.clickRunbutton5();
	Queue.alert_ok_click();
	Queue.goBack();
	
}

@Then("we get the {string} in the Alertbox for Array Implementation")
public void we_get_the_in_the_alertbox_for_array_implementation(String string) {
    
	System.out.println("User invalidated the code and get the error message");
}

@Given("The User is on the Queue operations page")
public void the_user_is_on_the_queue_operations_page() {
   System.out.println("The User is on the Queue operations page");
   
}

@When("The User clicks the {string} button in the Queue")
public void the_user_clicks_the_button_in_the_queue(String string) throws InterruptedException {
	
	Queue.Queueoperations();
	Thread.sleep(2000);
	
}

@Given("User is on the Try here page for Queue operations")
public void user_is_on_the_try_here_page_for_queue_operations() {
	System.out.println("User is on the Try here page for Queue operations");
}

@When("User clicks the {string} button in the Queue operations page")
public void user_clicks_the_button_in_the_queue_operations_page(String string) throws InterruptedException {
	
	
	Queue.TryEditorbox();
	Thread.sleep(2000);
}

@Then("page navigated to the python code textbox")
public void page_navigated_to_the_python_code_textbox() {
	System.out.println("The page successfully navigated to the pythoncode textbox");
}

@Given("User given valid code in the Try Here box for Queue operations")
public void user_given_valid_code_in_the_try_here_box_for_queue_operations() {
	
	Queue.PythoncodeQueueop("from collections import deque\r\n"
			+ "\r\n"
			+ "# Create a queue\r\n"
			+ "queue = deque()\r\n"
			+ "\r\n"
			+ "# Enqueue elements\r\n"
			+ "queue.append(\"apple\")\r\n"
			+ "queue.append(\"banana\")\r\n"
			+ "queue.append(\"cherry\")\r\n"
			+ "\r\n"
			+ "print(queue)");
}

@When("the User clicks the {string} button for Queue operations")
public void the_user_clicks_the_button_for_queue_operations(String string) throws InterruptedException {
    
	
	Queue.clickRunbutton6();
	Thread.sleep(2000);
}

@Then("User get the valid output for the Queue operations")
public void user_get_the_valid_output_for_the_queue_operations() {
	
	System.out.println("The User validated the code successfully for the Queue operations");
}

@Given("User given invalid code in the Try Here box for Queue operations")
public void user_given_invalid_code_in_the_try_here_box_for_queue_operations() {
    

	Queue.PythoncodeQueueop1("from collections import deque\r\n"
			+ "\r\n"
			+ "# Create a queue\r\n"
			+ "queue = deque()()\r\n"
			+ "\r\n"
			+ "# Enqueue elements\r\n"
			+ "queue.append(\"apple\")\r\n"
			+ "queue.append(\"banana\")\r\n"
			+ "queue.append(\"cherry\")\r\n"
			+ "\r\n"
			+ "print(queue)");
}

@When("The User clicks {string} button again for Queue operations")
public void the_user_clicks_button_again_for_queue_operations(String string) throws InterruptedException {
	
	Queue.clickRunbutton7();
	Queue.alert_ok_click();
	Queue.goBack();
	Thread.sleep(2000);
	
}

@Then("we get the {string} in the Alertbox for Queue operations")
public void we_get_the_in_the_alertbox_for_queue_operations(String string) {
    System.out.println("The User gets the Error Message in the Alertbox for the Queue operations");
}

@Given("The User is on the Queue page")
public void the_user_is_on_the_queue_page() {
   System.out.println("The User is on the Queue page");
}

@When("The User clicks the {string} button in the Queue page")
public void the_user_clicks_the_button_in_the_queue_page(String string) throws InterruptedException {

	Queue.practiceqns();
	Thread.sleep(2000);
	Queue.goBack();
	Thread.sleep(2000);
	Queue.toHomePage();
	Thread.sleep(2000);
}
@Then("page get navigated to the practice questions page")
public void page_get_navigated_to_the_practice_questions_page() {
    System.out.println("The page get navigated successfully to the practice page");
}
}

