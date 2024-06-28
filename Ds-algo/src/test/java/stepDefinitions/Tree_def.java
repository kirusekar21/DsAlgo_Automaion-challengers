//package stepDefinitions;
//
//import java.time.Duration;
//import PageObjectModel.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.*;
//import io.cucumber.java.en.Then;
//import utils.TestBaseT;
//
//public class Tree_def {
	
//	old tree steps
//	private WebDriver driver;
//	private dsalgo_Login loginPage;
//	private home_page hmpage;
//	private Tree_Page tpage;
//	private Editor_TreePage edtpage;
//	
//	
//	@Given("user is on the Tree page")
//	public void inHomePage() throws InterruptedException {
//		
//		System.out.println("I am in Tree definition");
////		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alice\\Desktop\\Wksp\\CucumberJava\\src\\main\\resources\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://dsportalapp.herokuapp.com/login");
//		loginPage = new dsalgo_Login(driver);
//		Thread.sleep(5000);
//		driver.manage().window().maximize();
//		hmpage = loginPage.doLogin("numpygirls", "@Aagks123");
//		tpage = hmpage.navigateTreePage();
////		tc=new TestBaseT();
////		DSIntroduction=new DSIntro(tc.WebDriverManager());
////		queue=new QueuePage(tc.WebDriverManager());
////		login=new loginPages(tc.WebDriverManager());
////		try_me=new TryMe(tc.WebDriverManager());
//
//	}
//	
//	@Given("user clicks on the introduction Treelink")
//	public void clickTreeIntro(){
//		tpage.clickTreeIntroLink();;
//	}
//	
//	@When("clicks on Try it tree button")
//	public void clickTryIt() {
//		edtpage = tpage.toEditorPage();
//	}
//	
//	@And("text editor Tree opens up")
//	public void runEditor() {
//		edtpage.sendCode();
//	}
//	
//	@Given("navigate back to Tree home page")
//	public void navigateBack(){
//		edtpage.navigateBack();
//	}
//	
//	@Given("user clicks on the insert Tree link")
//	public void clickInsert(){
//		//llpage.clickIsertLink();
//		tpage.clickIsertLink();
//	}
//	
//	@And("user enters tree wrong code")
//	public void runWrongEditor() {
//		edtpage.sendWrongCode();
//	}
//	
//	@Then("close the tree browser")
//	public void closeBrowser(){
//		edtpage.tearDown();
//		//llpage.clickSignOut();
//		tpage.clickSignOut();
//	}
	
//old tree steps end	
package stepDefinitions;
	import java.io.IOException;
	import java.time.Duration;
	import PageObjectModel.*;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.cucumber.java.en.*;
	import io.cucumber.java.en.Then;
	import utils.TestBaseT;
	
public class Tree_def {
		
		public TestBaseT tc;
		private WebDriver driver;
		private dsalgo_Login loginPage;
		private home_page hmpage;
		private Tree_Page tpage;
		private Editor_TreePage edtpage;
		

		
		
		@Given("user is on the Tree page")
		public void inHomePage() throws InterruptedException {
			
			System.out.println("I am in Tree definition");
			tc=new TestBaseT();
        try {
				loginPage = new dsalgo_Login(tc.WebDriverManager());
			} catch (IOException e) {
				e.printStackTrace();
			}
			Thread.sleep(5000);
			
			hmpage = loginPage.doLogin("numpygirls", "@Aagks123");
			tpage = hmpage.navigateTreePage();
		}
		
		@Given("user clicks on the introduction Treelink")
		public void clickTreeIntro(){
			tpage.clickTreeIntroLink();
		}
		
		@Given("user clicks on the terminologies Treelink")
		public void clickTreeTerm(){
			tpage.clickTerm();
		}
		
		@Given("user clicks on the traversal Treelink")
		public void clickTreeTraversal(){
			tpage.clickTraversal();
		}
		
		@Given("user clicks on the implementation Treelink")
		public void clickTreeImpB(){
			tpage.clickImpBTree();;
		}
		
		@Given("user clicks on the application Treelink")
		public void clickTreeApp(){
			tpage.clickAppTree();;
		}
		
		@Given("user clicks on the implementation binary Treelink")
		public void clickTreeBinary(){
			tpage.clickBinaryTree();;
		}
		
		
		@When("clicks on Try it tree button")
		public void clickTryIt() {
			edtpage = tpage.toEditorPage();
		}
		
		@And("text editor Tree opens up")
		public void runEditor() {
			edtpage.sendCode();
		}
		
		@Given("navigate back to Tree home page")
		public void navigateBack(){
			edtpage.navigateBack();
		}
		
		@Given("user clicks on the insert Tree link")
		public void clickInsert(){
			tpage.clickIsertLink();
		}
		
		@Given("user clicks on the binary Treelink")
		public void clickBinary(){
			tpage.clickBinaryTree();
		}
		
		
		@And("user enters tree wrong code")
		public void runWrongEditor() {
			edtpage.sendWrongCode();
		}
		
		@Then("close the tree browser")
		public void closeBrowser(){
			edtpage.tearDown();
			tpage.clickSignOut();
		}
	} 


