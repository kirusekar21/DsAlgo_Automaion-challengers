package PageObjectModel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DSIntro{
	
	    private WebDriver driver;
		
		
	
   //		get started
		 private By DSGetStarted=By.xpath("//div/a[@href='data-structures-introduction']");
		 private By clickTimeComp=By.linkText("Time Complexity");
		 private By codeEdit=By.xpath("//div[@class='CodeMirror-sizer']");
		 private By output=By.id("output");
		 
		 private By runBtn=By.xpath("//button[@type='button']");
		 private By practiceQuestion=By.linkText("Practice Questions");
		
		
		//constructor
		
		public DSIntro(WebDriver driver) {
			
			this.driver = driver;
		}
		
		//Methods/Actions
		
		
		
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
		public void quit() {
			driver.close();
			
		}
		
		
		
	}

