//package stepDefinitions;
//
//import java.io.IOException;
//import java.time.Duration;
//
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import PageObjectModel.TryMe;
//import PageObjectModel.loginPages;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import utils.TestBaseT;
//
//public class loginSteps {
//	public static WebDriver driver;
//	public TestBaseT tc;
//	public loginPages login;
//	TryMe try_me=new TryMe(driver);
//	WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(5));
//	
//	public loginSteps() throws IOException {
//		tc=new TestBaseT();
//		login=new loginPages(tc.WebDriverManager());
//	}
//	
//    @Given("The user is on the DS Algo Sign")
//	public void The_user_is_on_the_DS_Algo_Sign() {
////    	System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
////    	driver=new ChromeDriver();
////		driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
////		driver.get("https://dsportalapp.herokuapp.com/home");
//	}
//    @Given("The user is on the DS Algo Sign in Page")
//	public void The_user_is_on_the_DS_Algo_Sign_in_Page() {
//    	login.clickSignIn();
//	}
//   
//    @When("The user clicks login button after entering valid {string} and valid {string}")
//    public void the_user_clicks_login_button_after_entering_valid_and_valid(String user, String pass) {
//    	login.enterUsername(user);
//        login.enterpassword(pass);
//        login.login_btn();
//     }
//
//    @Then("The user should land in Data Structure Home Page")
//    public void the_user_should_land_in_data_structure_home_page() {
//        System.out.println("The user should land in Data Structure Home Page");
//    }
//  }
