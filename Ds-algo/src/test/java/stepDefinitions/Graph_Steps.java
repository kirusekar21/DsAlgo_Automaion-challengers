package stepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import PageObjectModel.RegistrationPage;
import PageObjectModel.TryMe;
import PageObjectModel.graphPage;
import PageObjectModel.loginPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestBaseT;


public class Graph_Steps{
	public static WebDriver driver;
    private graphPage graph;
	private TryMe try_me;
	public loginPages login;
	public TestBaseT tc;
	WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(5));
public Graph_Steps() throws IOException {
		tc=new TestBaseT();
		graph=new graphPage(tc.WebDriverManager());
		login=new loginPages(tc.WebDriverManager());
		try_me=new TryMe(tc.WebDriverManager());
	
	}
    //	  From graph POM object
	
	@Given("The user is on the DS Algo Sign in Page")
	public void The_user_is_on_the_DS_Algo_sign_in_Page() {
		login.clickSignIn();
	}
   
    @When("The user clicks login button after entering valid {string} and valid {string}")
    public void the_user_clicks_login_button_after_entering_valid_and_valid(String user, String pass) {
        
    	login.enterUsername(user);
        login.enterpassword(pass);
        login.login_btn();
     }

    @Given("The user is on the graph home page")
    public void the_user_is_on_the_graph_home_page() throws InterruptedException   {
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	graph.clickgraph();
    	
    }
    @Given("The user is on the {string} page")
    public void the_user_is_on_the_page(String string) {
        graph.verifyGraphTitle();

    }

    @When("The user click link {string}")
    public void the_user_click_link(String string) {
    	graph.clickgraphPage();
    
    }
// created separate object for try me page
    @Then("The user should be redirected to inside of {string} page.")
    public void the_user_should_be_redirected_to_inside_of_page(String string) {
    	try_me.clickTryMe();
    }
    @Given("The user is on the Python Editor")
    public void the_user_is_on_the_python_editor() {
    	graph.verifycodeTitle();
    }

    @When("The user clicks the Run button without entring the code in the Editor")
    public void the_user_clicks_the_run_button_without_entring_the_code_in_the_editor() {
        graph.run_btn_click();
    }

    @Then("Nothing happens to the page and no error message is displayed")
    public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {
        System.out.println("Nothing happens");
    }
    @When("The user writes the valid python code")
    public void the_user_writes_the_valid_python_code() {
    	graph.CodeEditor();
     }

    @When("click run")
    public void click_run() {
    	 graph.run_btn_click();
    }

    @Then("The user is able to see the output inside the console.")
    public void the_user_is_able_to_see_the_output_inside_the_console() {
    	graph.outputText();
    }
    @Given("The user refresh Python Editor")
    public void the_user_refresh_python_editor() {
    	graph.refresh();
    }
    @When("The user writes the invalid python code")
    public void the_user_writes_the_invalid_python_code() {
        graph.invalidCodeEditor();
    }

    @Then("The user see error msg in alert window.")
    public void the_user_see_error_msg_in_alert_window() {
    	graph.alert_ok_click();
    }
    @Given("The user navigated back to graph page")
    public void the_user_navigated_back_to_graph_page() {
        graph.goBack();
    }

    @When("The user clicks Graph Representations link")
    public void the_user_clicks_graph_representations_link() {
        graph.clickgraphRepresentations();
    }

    @Then("The user should be redirected to Graph Representations page.")
    public void the_user_should_be_redirected_to_graph_representations_page() {
       graph.verifyGRTitle();
    }
    @Given("The user is on the Graph Representations page")
    public void the_user_is_on_the_graph_representations_page() {
        graph.verifyGRTitle();
    }

    @When("The user clicks Try Here button")
    public void the_user_clicks_try_here_button() {
        try_me.clickTryMe();
    }

    @Then("The user should be redirected to a page having Editor and run button")
    public void the_user_should_be_redirected_to_a_page_having_editor_and_run_button() {
        graph.verifycodeTitle();
    }
    @When("The user writes the valid Graph Representation python code")
    public void the_user_writes_the_valid_graph_representation_python_code() {
        graph.CodeEditorGR();
    }
    @When("The user clicks Practice Questions link")
    public void The_user_clicks_Practice_Questions_link()
    {
    	graph.clickPractice();
    }
    @Then("The user should be redirected to Practice Questions page.")
    public void The_user_should_be_redirected_to_Practice_Questions_page() {
    	graph.verifyPracticeTitle();
    	graph.toHomePage();
    }
    
    
}
