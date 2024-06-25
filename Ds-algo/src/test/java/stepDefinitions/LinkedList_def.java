package stepDefinitions;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModel.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import utils.TestBaseT;
public class LinkedList_def {
	public TestBaseT tc;
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
		tc=new TestBaseT();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alice\\Desktop\\Wksp\\CucumberJava\\src\\main\\resources\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://dsportalapp.herokuapp.com/login");
//		loginPage = new dsalgo_Login(driver);
		try {
			loginPage = new dsalgo_Login(tc.WebDriverManager());
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(5000);
//		driver.manage().window().maximize()
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
	
	@And("user enters the correct code")
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
	
	@Given("user clicks on the implement link")
	public void clickImplement(){
		llpage.clickImplementLink();
	}
	
	@Given("user clicks on the traversal link")
	public void clickTraversal(){
		llpage.clickTraversalLink();
	}
	
	@Given("user clicks on the Create link")
	public void clickCreate(){
		llpage.clickCreateLink();
	}
	
	@Given("user clicks on the Delete link")
	public void clickDelete(){
		llpage.clickDeleteLink();
	}
	
	@Given("user clicks on the Types link")
	public void clickTypesLink(){
		llpage.clickTypesLink();
	}
	
	@Then("close the browser")
	public void closeBrowser(){
		edpage.tearDown();
		llpage.clickSignOut();
	}
}









