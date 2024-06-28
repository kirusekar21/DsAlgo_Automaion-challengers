package PageObjectModel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DSIntro{
	
	    private WebDriver driver;
		
		
	    String Url="https://dsportalapp.herokuapp.com/home";
   //		get started
		 private By DSGetStarted=By.xpath("//div/a[@href='data-structures-introduction']");
		 private By clickTimeComp=By.linkText("Time Complexity");
		 private By codeEdit=By.xpath("//div[@class='CodeMirror-sizer']");
		 private By output=By.id("output");
		 private By signin=By.linkText("Sign in");
		 private By runBtn=By.xpath("//button[@type='button']");
		 private By practiceQuestion=By.linkText("Practice Questions");
		 private By Clickdropdownlistbutton = By.xpath("html/body/div/nav/div/div/div/a");
			private By ClickDSoptionbutton = By.xpath("//a[contains(text(),'Arrays')]");
			private By Clickerrormsg = By.xpath("//div[contains(text(),'You are not logged in')]");
			private By ClickGetstartedbutton = By.xpath("html/body/div[3]/div[2]/div/div/a");
			private By ClickRegistrationlink = By.xpath("//a[contains(text(),'Register')]");
			private By Clicksignin = By.xpath("//a[contains(text(),'Sign in')]");
			private By Entervalidusername = By.xpath("//input[@name=\"username\"]");
			private By Entervalidpwd = By.xpath("//input[@name = \"password\"]");
			private By ClickLoginbutton = By.xpath("//input[@value = \"Login\"]");
			private By Checkloginbutton = By.xpath("//div[contains(text(),'You are logged in')]");
			
			private By signout = By.xpath("//a[contains(text(),'Sign out')]");
		
		//constructor
		
		public DSIntro(WebDriver driver) {
			
			this.driver = driver;
		}
		public void toHomePage() {
	  		driver.navigate().to(Url);
	  	}
		public void clickSignIn() {
			driver.findElement(signin).click();
		}
		//Methods/Actions
public void clickdropdownbutton() {
			
			WebElement clickbutton = driver.findElement(Clickdropdownlistbutton);
			clickbutton.click();
		}
		
		public void clickDSbutton() {
			
			WebElement clickbutton1 = driver.findElement(ClickDSoptionbutton);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",clickbutton1);
		}
		
		public boolean checkerrormsg() {
			
			return driver.findElement(Clickerrormsg).isDisplayed();
		}
		
		public void clickGetstarted() {
			
			WebElement clickbutton2 = driver.findElement(ClickGetstartedbutton);
			clickbutton2.click();
		}
		
		public void clickRegistration() {
			
			WebElement clickbutton3 = driver.findElement(ClickRegistrationlink);
			clickbutton3.click();
		}
		
		public void clicksigninbutton() {
			
			WebElement clicksignin = driver.findElement(Clicksignin);
			clicksignin.click();
		}
		
		public void enterusername(String username1) {
			
			WebElement username = driver.findElement(Entervalidusername);
			username.sendKeys(username1);
		}
		
		public void enterpassword(String password1) {
			
			WebElement password = driver.findElement(Entervalidpwd);
			password.sendKeys(password1);
		}
		
		public void clicklogin() {
			
			WebElement login = driver.findElement(ClickLoginbutton);
			login.click();
		}
		public boolean checkloginbutton() {
			
			return driver.findElement(Checkloginbutton).isDisplayed();
			
		}
		
		
		public void DataGetStarted() {
			
			driver.findElement(DSGetStarted).click();
	    }
		public void clickTime() {
			driver.findElement(clickTimeComp).click();
		}
		
		public void validcode() {
			WebElement entervalidcode=driver.findElement(codeEdit);
			 Actions action = new Actions(driver);
			 action.sendKeys(entervalidcode,"print \"hello\"").build().perform();
		}
		public void invalidCode() {
			WebElement entervalidcode=driver.findElement(codeEdit);
			 Actions action = new Actions(driver);
			action.sendKeys(entervalidcode,"print hello").build().perform();
		}
		public void alert_ok_click() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		public void clickPractice() {
			driver.findElement(practiceQuestion).click();
		}
		public void run_btn_click() {
			driver.findElement(runBtn).click();
		}
		public void outputText() {
	  		WebElement outputPrint=driver.findElement(output);
	  		String printOutput=outputPrint.getText();
	  		System.out.println(printOutput);
	  	}
		public void goBack()  {
	  		driver.navigate().back();
	  	}
		public void refresh() {
			driver.navigate().refresh();
		}
//		public void quit() {
//			driver.close();
//			
//		}
		
		
		
	}

