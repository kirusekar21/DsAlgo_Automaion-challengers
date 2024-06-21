package stepDefinitions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModel.*;
//import dsalgo_Pages.dsalgo_Login;
//import dsalgo_Pages.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;

public class LinkedList_def {
	
	private WebDriver driver;
	private dsalgo_Login loginPage;
	private home_page hmpage;
	private LinkedList_Page llpage;
	private Editor_Page edpage;
	
/*	@Before
	public void setup() {
		System.out.println("I am in Linked List Step definition");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alice\\Desktop\\Wksp\\CucumberJava\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
	}*/
	
/*	@Given("user inputs the wrong credentials")
	public void inLoginPage() throws InterruptedException {
		driver.get("https://dsportalapp.herokuapp.com/login");
		loginPage = new dsalgo_Login(driver);
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
	
	@Then("user is navigated wrong credentials message")
	public void clickInvalid() {
		loginPage.invalidClick();
	}*/
	
	@Given("user is on the linked list page")
	public void inHomePage() throws InterruptedException {
		
		System.out.println("I am in Linked List Step definition");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alice\\Desktop\\Wksp\\CucumberJava\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dsportalapp.herokuapp.com/login");
		loginPage = new dsalgo_Login(driver);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		hmpage = loginPage.doLogin("numpygirls", "@Aagks123");
		llpage = hmpage.navigateLinkedList();
	}
	
	@Given("user clicks on the introduction link")
	public void clickIntro(){
		llpage.clickIntroLink();
	}
	
	@When("clicks on Try it button")
	public void clickTryIt() {
		edpage = llpage.toEditorPage();
	}
	
	@And("text editor opens up")
	public void runEditor() {
		edpage.sendCode();
	}
	
	@Given("navigate back to linked list home page")
	public void navigateBack(){
		edpage.navigateBack();
	}
	
	@Given("user clicks on the insert link")
	public void clickInsert(){
		llpage.clickIsertLink();
	}
	
	@And("user enters wrong code")
	public void runWrongEditor() {
		edpage.sendWrongCode();
	}
	
	@Then("close the browser")
	public void closeBrowser(){
		edpage.tearDown();
		llpage.clickSignOut();
	}

}
