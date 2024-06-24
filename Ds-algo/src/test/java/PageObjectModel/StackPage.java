package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StackPage {
	private WebDriver driver;

	public StackPage(WebDriver driver) {
		
		this.driver = driver;
	}
	String Url="https://dsportalapp.herokuapp.com/home";
	private By StackGetStarted=By.xpath("//div/a[@href='stack']");
	private By operationInStackLocator = By.xpath("//a[contains(text(),'Operations in Stack')]");
	private By operationTryHereLocator = By.xpath("//a[@href=\"/tryEditor\"]");
	private By operatinInStacktextboxEditor = By.xpath("html/body/div/div/form/div/div/div[6]");
	private By operationInStackClickRunButton = By.xpath("//button[contains(text(),'Run')]");
	private By operatinInStacktextboxEditor1 = By.xpath("html/body/div/div/form/div/div/div[6]");
	private By operationInStackClickRunButton1 = By.xpath("//button[contains(text(),'Run')]");
	private By implementationLocator = By.xpath("//a[contains(text(),'Implementation')]");
	private By implementationTryHereLocator = By.xpath("//a[@href=\"/tryEditor\"]");
	private By implementationStackTextboxEditor = By.xpath("html/body/div/div/form/div/div/div[6]");
	private By implementationStackClickRunButton = By.xpath("//button[contains(text(),'Run')]");
	//private By runBtn=By.xpath("//button[@type='button']");
	private By implementationStackTextboxEditor1 = By.xpath("html/body/div/div/form/div/div/div[6]");
	private By implementationStackClickRunButton1 = By.xpath("//button[contains(text(),'Run')]");
	private By applicationStackLocator = By.xpath("//a[contains(text(),'Applications')]");
    private By applicationTryHereLocator = By.xpath("//a[@href=\"/tryEditor\"]");
    private By applicationStackTextEditor = By.xpath("html/body/div/div/form/div/div/div[6]");
    private By applicationStackClickRunButton = By.xpath("//button[contains(text(),'Run')]");
    private By applicationStackTextEditor1 = By.xpath("html/body/div/div/form/div/div/div[6]");
    private By applicationStackClickRunButton1 = By.xpath("//button[contains(text(),'Run')]");
    //private By practiceQuestionsLocator = By.xpath("//a[contains(text(),'Practice Questions')]");
    private By practiceQuestionsLocator = By.xpath("//a[@href=\"/stack/practice\"]");
	public void stackGetStarted() {
		
		driver.findElement(StackGetStarted).click();
    }
	public void clickoperationsinstack() {
		WebElement operationStack = driver.findElement(operationInStackLocator);
		operationStack.click();
	}
	
	public void clickoistryhereeditor() {
		WebElement oistryEditor = driver.findElement(operationTryHereLocator);
		oistryEditor.click();
	}
 
	public void textboxeditorboxoperation(String textbox) {
		WebElement textcode = driver.findElement(operatinInStacktextboxEditor);
		Actions action = new Actions(driver);
		action.sendKeys(textcode,"stack = []\r\n"
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
				+ "print(stack)").build().perform();
	}
	
	public void clickoperationrunbutton() {
		WebElement operationrunbutton = driver.findElement(operationInStackClickRunButton);
	    operationrunbutton.click();
	}
	
	public void textboxeditorboxoperation1(String textbox1) {
		WebElement textcode1 = driver.findElement(operatinInStacktextboxEditor1);
		Actions action = new Actions(driver);
		action.sendKeys(textcode1,"stack = [][]\r\n"
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
				+ "print(stack)").build().perform();
	}
	public void alert_ok_click() {
	Alert simpleAlert = driver.switchTo().alert();
	//Thread.sleep(1000);
	simpleAlert.accept();
	}
	
	public void goBack()  {
  		
  		driver.navigate().back();
  	}
	public void clickoperationrunbutton1() {
		WebElement operationrunbutton1 = driver.findElement(operationInStackClickRunButton1);
	    operationrunbutton1.click();
	}
	
	 public void clickimplementationstacklink() {
     	WebElement implementationstacklink = driver.findElement(implementationLocator);
     	implementationstacklink.click();
     }
    
     public void clickimplementationstacktryherelink() {
     	WebElement implementationstacktryhere = driver.findElement(implementationTryHereLocator);
     	implementationstacktryhere.click();
     }
    
     public void clickimplementationtexteditorpage() {
     	WebElement implementationstacktexteditor = driver.findElement(implementationStackTextboxEditor);
     	implementationstacktexteditor.click();
     }
    
     public void implementstacktextboxeditorbox(String textbox) {
			WebElement textcode2 =driver.findElement(implementationStackTextboxEditor);
			Actions action = new Actions(driver);
			action.sendKeys(textcode2,"stack = []\r\n"
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
					+ "print(stack)").build().perform();		
     }
    
	public void implementationclickrunbutton() {
		 WebElement impclickrunbuttonimp = driver.findElement(implementationStackClickRunButton);
	  impclickrunbuttonimp.click();	
	}
  public void implementstacktextboxeditorbox1(String textbox1) {
			WebElement textcode3 =driver.findElement(implementationStackTextboxEditor1);
			Actions action = new Actions(driver);
			action.sendKeys(textcode3,"stack = [][]\r\n"
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
					+ "print(stack)").build().perform();
  }
 
	public void implementationclickrunbutton1() {
		WebElement impclickrunbuttonimp1 = driver.findElement(implementationStackClickRunButton1);
		impclickrunbuttonimp1.click();
	}
	
	public void clickapplicationLocator() {
		WebElement clickapplication = driver.findElement(applicationStackLocator);
	    clickapplication.click();
	}
	
	public void clicktryhereapplicationlocator() {
		WebElement clicktryhereapplication = driver.findElement(applicationTryHereLocator);
		clicktryhereapplication.click();
	}
	
	 public void clickapplicationtexteditorpage() {
	     	WebElement applicationstacktexteditor = driver.findElement(applicationStackTextEditor);
	     	applicationstacktexteditor.click();
	     }
	
	 public void applicationtextboxeditorbox(String textbox) {
			WebElement textcode4 = driver.findElement(applicationStackTextEditor);
			Actions action = new Actions(driver);
			action.sendKeys(textcode4,"stack = []\r\n"
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
					+ "print(stack)").build().perform();
		}
		
		public void clickrunbuttonapplication() {
			WebElement runbuttonapplication = driver.findElement(applicationStackClickRunButton);
			runbuttonapplication.click();
		}
		
		public void applicationtextboxeditorbox1(String textbox) {
			WebElement textcode5 = driver.findElement(applicationStackTextEditor1);
			Actions action = new Actions(driver);
			action.sendKeys(textcode5,"stack = []\r\n"
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
					+ "print(stack)").build().perform();
		}
		
		public void clickrunbuttonapplication1() {
			WebElement runbuttonapplication1 = driver.findElement(applicationStackClickRunButton1);
			runbuttonapplication1.click();
		}
		
		public void clickstackpracticequestions() {
			WebElement clickstackpracticelink = driver.findElement(practiceQuestionsLocator);
			clickstackpracticelink.click();
		}
		public void toHomePage() {
	  		driver.navigate().to(Url);
	  	}
		public void quit() {
			driver.close();
			driver.quit();
		}
}
