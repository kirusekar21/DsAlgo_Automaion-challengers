package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ArrayPage {
	
	private WebDriver driver;

	public ArrayPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	private By AGetStarted=By.xpath("//div/a[@href='array']");
	 private By arraysPythonLocator = By.xpath("//a[contains(text(),'Arrays in Python')]");
		private By arraysPythonTryHereLocator = By.xpath("//a[@href=\"/tryEditor\"]");
		private By arraysPythontextboxEditor = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By arraysPythonClickRunButton = By.xpath("//button[contains(text(),'Run')]");
		private By arraysPythontextboxEditor1 = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By arraysPythonClickRunButton1 = By.xpath("//button[contains(text(),'Run')]");
		private By arraysListLocator = By.linkText("Arrays Using List");
		private By arraysListTryHereLocator = By.xpath("//a[@href=\"/tryEditor\"]");
		private By arraysListTextboxEditor = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By arraysListClickRunButton = By.xpath("//button[contains(text(),'Run')]");
		private By arraysListTextboxEditor1 = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By arraysListClickRunButton1 = By.xpath("//button[contains(text(),'Run')]");
		private By OperationArraysLocator = By.xpath("//a[contains(text(),'Basic Operations in Lists')]");
	    private By OperationArraysTryHereLocator = By.xpath("//a[@href=\"/tryEditor\"]");
	    private By OperationArraysStackTextEditor = By.xpath("html/body/div/div/form/div/div/div[6]");
	    private By OperationArraysClickRunButton = By.xpath("//button[contains(text(),'Run')]");
	    private By OperationArraysTextEditor1 = By.xpath("html/body/div/div/form/div/div/div[6]");
	    private By OperationArraysClickRunButton1 = By.xpath("//button[contains(text(),'Run')]");
	    private By applicationArrayLocator = By.xpath("//a[contains(text(),'Applications of Array')]");
	    private By applicationArrayTryHereLocator = By.xpath("//a[@href=\"/tryEditor\"]");
	    private By applicationArrayTextEditor = By.xpath("html/body/div/div/form/div/div/div[6]");
	    private By applicationArrayClickRunButton = By.xpath("//button[contains(text(),'Run')]");
	    private By applicationArrayTextEditor1 = By.xpath("html/body/div/div/form/div/div/div[6]");
	    private By applicationArrayClickRunButton1 = By.xpath("//button[contains(text(),'Run')]");
	    private By practiceQuestionsLocator = By.xpath("//a[@href=\"/array/practice\"]");
	    private By practicequestion1 = By.xpath("//a[@href=\"/question/1\"]");
	    //private By practiceTextEditor1 = By.xpath("html/body/div/div/form/div/div/div[6]");
	    private By practicequestion2 = By.xpath("//a[@href=\"/question/2\"]");
	    private By practicequestion3 = By.xpath("//a[@href=\"/question/3\"]");
	    private By practicequestion4 = By.xpath("//a[@href=\"/question/4\"]");
	  //div[@class='CodeMirror-scroll']//div[@class='CodeMirror-scroll']
	    private By signout=By.linkText("Sign out");
    public void ArrayGetStarted() {
		driver.findElement(AGetStarted).click();
    }
    public void signout() {
    	driver.findElement(signout).click();
    }
    public void clickarraysinpython() {
		WebElement arraysPython = driver.findElement(arraysPythonLocator);
		arraysPython.click();
	}
	
	public void clickaiptryhereeditor() {
		WebElement aiptryEditor = driver.findElement(arraysPythonTryHereLocator);
		aiptryEditor.click();
	}
  
	public void textboxeditorboxarrays(String textbox) {
		WebElement textcode = driver.findElement(arraysPythontextboxEditor);
		Actions action = new Actions(driver); 
		action.sendKeys(textcode,"arr = []\r\n"
				+ "arr.append(10) \r\n"
				+ "arr.append(20)\r\n"
				+ "arr.append(30)\r\n"
				+ "arr.append(40)\r\n"
				+ "arr.append(50)\r\n"
				+ "print(arr) \r\n"             
				+ "print(arr)").build().perform();
	}
	

	public void clickarraysrunbutton() {
		WebElement arraysrunbutton = driver.findElement(arraysPythonClickRunButton);
	    arraysrunbutton.click();
	}
	
	public void textboxeditorboxarrays1(String textbox1) {
		WebElement textcode1 = driver.findElement(arraysPythontextboxEditor1);
		Actions action = new Actions(driver); 
		action.sendKeys(textcode1,"arr = [][]\r\n"
				+ "arr.append(10) \r\n"
				+ "arr.append(20)\r\n"
				+ "arr.append(30)\r\n"
				+ "arr.append(40)\r\n"
				+ "arr.append(50)\r\n"
				+ "print(arr) \r\n"             
				+ "print(arr)").build().perform();
	}
	public void alert_ok_click() {
	Alert simpleAlert = driver.switchTo().alert();
	//Thread.sleep(1000);
	simpleAlert.accept();
	}
	
	public void goBack()  {
  		
  		driver.navigate().back();
  	}
	public void clickarraysrunbutton1() {
		WebElement arraysrunbutton1 = driver.findElement(arraysPythonClickRunButton1);
	    arraysrunbutton1.click();
	}
	
	 public void clickarraylistlink() {
     	WebElement arraylistlink = driver.findElement(arraysListLocator);
     	arraylistlink.click();
     }
     
     public void clickarraylisttryherelink() {
     	WebElement arraylisttryhere = driver.findElement(arraysListTryHereLocator);
     	arraylisttryhere.click();
     }
     
     public void clickarraylisttexteditorpage() {
     	WebElement arraylisttexteditor = driver.findElement(arraysListTextboxEditor);
     	arraylisttexteditor.click();
     }
     
     public void arraylisttextboxeditorbox(String textbox) {
			WebElement textcode2 =driver.findElement(arraysListTextboxEditor);
			Actions action = new Actions(driver); 
			action.sendKeys(textcode2,"arr = []\r\n"
					+ "arr.append(10) \r\n"
					+ "arr.append(20)\r\n"
					+ "arr.append(30)\r\n"
					+ "arr.append(40)\r\n"
					+ "arr.append(50)\r\n"
					+ "print(arr) \r\n"             
					+ "print(arr)").build().perform();	
     } 
     
	public void arraylistclickrunbutton() {
		 WebElement arrlistclickrunbuttonimp = driver.findElement(arraysListClickRunButton);
	  arrlistclickrunbuttonimp.click();	
	}

  public void arraylisttextboxeditorbox1(String textbox1) {
			WebElement textcode3 =driver.findElement(arraysListTextboxEditor1);
			Actions action = new Actions(driver); 
			action.sendKeys(textcode3,"arr = [][]\r\n"
					+ "arr.append(10) \r\n"
					+ "arr.append(20)\r\n"
					+ "arr.append(30)\r\n"
					+ "arr.append(40)\r\n"
					+ "arr.append(50)\r\n"
					+ "print(arr) \r\n"             
					+ "print(arr)").build().perform();
  }
  
	public void arraylistclickrunbutton1() {
		WebElement arrlistclickrunbuttonimp1 = driver.findElement(arraysListClickRunButton1);
		arrlistclickrunbuttonimp1.click();
	}
	
	public void clickBasicLocator() {
		WebElement clickbasic = driver.findElement(OperationArraysLocator);
	    clickbasic.click();
	}
	
	public void clicktryherebasiclocator() {
		WebElement clicktryherebasic = driver.findElement(OperationArraysTryHereLocator);
		clicktryherebasic.click();
	}
	
	 public void clickbasictexteditorpage() {
	     	WebElement basictexteditor = driver.findElement(OperationArraysStackTextEditor);
	     	basictexteditor.click();
	     }
	 
	 public void basictextboxeditorbox(String textbox) {
			WebElement textcode4 = driver.findElement(OperationArraysStackTextEditor);
			Actions action = new Actions(driver); 
			action.sendKeys(textcode4,"arr = []\r\n"
					+ "arr.append(10) \r\n"
					+ "arr.append(20)\r\n"
					+ "arr.append(30)\r\n"
					+ "arr.append(40)\r\n"
					+ "arr.append(50)\r\n"
					+ "print(arr) \r\n"             
					+ "print(arr)").build().perform();
		}
		
		public void clickrunbuttonbasic() {
			WebElement runbuttonbasic = driver.findElement(OperationArraysClickRunButton);
			runbuttonbasic.click();
		}
		
		public void basictextboxeditorbox1(String textbox) {
			WebElement textcode5 = driver.findElement(OperationArraysTextEditor1);
			Actions action = new Actions(driver); 
			action.sendKeys(textcode5,"arr = [][]\r\n"
					+ "arr.append(10) \r\n"
					+ "arr.append(20)\r\n"
					+ "arr.append(30)\r\n"
					+ "arr.append(40)\r\n"
					+ "arr.append(50)\r\n"
					+ "print(arr) \r\n"             
					+ "print(arr)").build().perform();
		}
		
		public void clickrunbuttonbasic1() {
			WebElement runbuttonbasic1 = driver.findElement(OperationArraysClickRunButton1);
			runbuttonbasic1.click();
		}
		
		public void clickapparrayLocator() {
			WebElement clickapparray = driver.findElement(applicationArrayLocator);
		    clickapparray.click();
		}
		
		public void clicktryhereapparraylocator() {
			WebElement clicktryhereapparray = driver.findElement(applicationArrayTryHereLocator);
			clicktryhereapparray.click();
		}
		
		 public void clickapparraytexteditorpage() {
		     	WebElement apparraytexteditor = driver.findElement(applicationArrayTextEditor);
		     	apparraytexteditor.click();
		     }
		 
		 public void apparraytextboxeditorbox(String textbox) {
				WebElement textcode6 = driver.findElement(applicationArrayTextEditor);
				Actions action = new Actions(driver); 
				action.sendKeys(textcode6,"arr = []\r\n"
						+ "arr.append(10) \r\n"
						+ "arr.append(20)\r\n"
						+ "arr.append(30)\r\n"
						+ "arr.append(40)\r\n"
						+ "arr.append(50)\r\n"
						+ "print(arr) \r\n"             
						+ "print(arr)").build().perform();
			}
			
			public void clickrunbuttonapparray() {
				WebElement runbuttonapparray = driver.findElement(applicationArrayClickRunButton);
				runbuttonapparray.click();
			}
			
			public void apparraytextboxeditorbox1(String textbox) {
				WebElement textcode7 = driver.findElement(applicationArrayTextEditor1);
				Actions action = new Actions(driver); 
				action.sendKeys(textcode7,"arr = [][]\r\n"
						+ "arr.append(10) \r\n"
						+ "arr.append(20)\r\n"
						+ "arr.append(30)\r\n"
						+ "arr.append(40)\r\n"
						+ "arr.append(50)\r\n"
						+ "print(arr) \r\n"             
						+ "print(arr)").build().perform();
			}
			
			public void clickrunbuttonapparray1() {
				WebElement runbuttonapparray1 = driver.findElement(applicationArrayClickRunButton1);
				runbuttonapparray1.click();
			}

		
		public void clickarraypracticequestions() {
			WebElement clickarraypracticelink = driver.findElement(practiceQuestionsLocator);
			clickarraypracticelink.click();
		}

    public void searchpracticelink() {
    	WebElement clicksearch = driver.findElement(practicequestion1);
    	clicksearch.click();
    }
    
    public void practicequestion1link() {
    	WebElement clickquestion2 = driver.findElement(practicequestion2);
    	clickquestion2.click();
    }
    
    public void practicequestion2link() {
    	WebElement clickquestion3 = driver.findElement(practicequestion3);
    	clickquestion3.click();
    }
    
    public void practicequestion3link() {
    	WebElement clickquestion4 = driver.findElement(practicequestion4);
    	clickquestion4.click();
    }
    
}