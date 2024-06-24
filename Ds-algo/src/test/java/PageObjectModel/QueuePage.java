package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class QueuePage {
		private WebDriver driver;

		public QueuePage(WebDriver driver) {
			
			this.driver = driver;
		}
		String Url="https://dsportalapp.herokuapp.com/home";
		private By QueGetStarted=By.xpath("//div/a[@href='queue']");
		private By clickImplementationQueuebutton = By.xpath("//a[@href=\"implementation-lists\"]");
		private By clickTryEditorbutton = By.xpath("//a[@href=\"/tryEditor\"]");
		private By codetextbox = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By clickrunbutton = By.xpath("//button[contains(text(),'Run')]");
		private By codetextbox1 = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By clickrunbutton1 = By.xpath("//button[contains(text(),'Run')]");
		private By clickImplementationusingcollections = By.xpath("//a[contains(text(),'Implementation using collections.deque')]");
		private By clickTryHerebutton = By.xpath("//a[@href=\"/tryEditor\"]");
		private By pythoncodetxtbox = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By clickrunbutton2 = By.xpath("//button[contains(text(),'Run')]");
		private By pythoncodetxtbox1 = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By clickrunbutton3 = By.xpath("//button[contains(text(),'Run')]");
		private By clickImplementationusingArray = By.xpath("//a[contains(text(),'Implementation using array')]");
		private By clickTryHerebutton1 = By.xpath("//a[@href=\"/tryEditor\"]");
		private By pythoncodetxtbox2 = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By clickrunbutton4 = By.xpath("//button[contains(text(),'Run')]");
		private By pythoncodetxtbox3 = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By clickrunbutton5 = By.xpath("//button[contains(text(),'Run')]");
		private By clickQueueoperations = By.xpath("//a[@href=\"/queue/QueueOp/\"]");
		private By clickTryHerebutton2 = By.xpath("//a[@href=\"/tryEditor\"]");
		private By pythoncodetxtbox4 = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By clickrunbutton6 = By.xpath("//button[contains(text(),'Run')]");
		private By pythoncodetxtbox5 = By.xpath("html/body/div/div/form/div/div/div[6]");
		private By clickrunbutton7 = By.xpath("//button[contains(text(),'Run')]");
		private By clickpracticeqns = By.xpath("//a[contains(text(),'Practice Questions')]");
		
		public void QueueGetStarted() {
			
			driver.findElement(QueGetStarted).click();
	    }
		
		public void clicklink() {
			
			WebElement clickbuttonqueue = driver.findElement(clickImplementationQueuebutton);
			clickbuttonqueue.click();
		}

		public void clicktryeditor() {
			
			WebElement clickbuttontryeditor = driver.findElement(clickTryEditorbutton);
			clickbuttontryeditor.click();
		}	
		public void Enterpythoncode(String textbox) {
			
			WebElement entervalidcode = driver.findElement(codetextbox);
			Actions action = new Actions(driver); 
			action.sendKeys(entervalidcode,"queue = []\r\n"
				+ "queue.append(1) \r\n"
				+ "queue.append(2)\r\n"
				+ "queue.append(3)\r\n"
				+ "print(queue) \r\n"
				+ "x = queue.pop(0) \r\n"
				+ "print(x)\r\n"
				+ "print(queue)").build().perform();
			 
		}
		public void clickRunbutton() {
			
			WebElement Runbutton = driver.findElement(clickrunbutton);
			Runbutton.click();
			
			}
		public void Enterpythoncode1(String textbox) {
			WebElement entervalidcode1 = driver.findElement(codetextbox1);
			Actions action = new Actions(driver); 
			action.sendKeys(entervalidcode1,"queue = [][]\r\n"
					+ "queue.append(1) \r\n"
					+ "queue.append(2)\r\n"
					+ "queue.append(3)\r\n"
					+ "print(queue) \r\n"
					+ "x = queue.pop(0) \r\n"
					+ "print(x)\r\n"
					+ "print(queue)").build().perform();
				 }
public void clickRunbutton1() {
			
			WebElement Runbutton1 = driver.findElement(clickrunbutton1);
			Runbutton1.click();
			
			}

public void clickcollectionslink() {
	
	WebElement clickcollectionsbutton = driver.findElement(clickImplementationusingcollections);
	clickcollectionsbutton.click();
}

public void clickTryHere() {
	
	WebElement clickTryHere = driver.findElement(clickTryHerebutton);
	clickTryHere.click();
	
}

public void pythoncodequeue(String textbox) {
	
	WebElement clickpythoncode = driver.findElement(pythoncodetxtbox);
	Actions action = new Actions(driver); 
	action.sendKeys(clickpythoncode,"from collections import deque\r\n"
			+ "my_deque = deque()\r\n"
			+ "print(my_deque)\r\n"
			+ "my_deque.append(1) \r\n"
			+ "my_deque.append(2) \r\n"
			+ "my_deque.appendleft(3) \r\n"
			+ "print(my_deque)").build().perform();
}

public void clickRunbutton2() {
	
	WebElement Runbutton2 = driver.findElement(clickrunbutton2);
	Runbutton2.click();
	
	}

public void pythoncodequeue1(String textbox) {
	
	WebElement clickpythoncode1 = driver.findElement(pythoncodetxtbox1);
	Actions action = new Actions(driver); 
	action.sendKeys(clickpythoncode1,"from collections import deque\r\n"
			+ "my_deque = deque()()\r\n"
			+ "print(my_deque)\r\n"
			+ "my_deque.append(1) \r\n"
			+ "my_deque.append(2) \r\n"
			+ "my_deque.appendleft(3) \r\n"
			+ "print(my_deque)").build().perform();
}

public void clickRunbutton3() {
	
	WebElement Runbutton3 = driver.findElement(clickrunbutton3);
	Runbutton3.click();
	
	}

public void clickArrayImplementation() {
	
	WebElement clickArraybutton = driver.findElement(clickImplementationusingArray);
	 clickArraybutton.click();
}

public void clickTryHerebox() {
	

	WebElement clickTryHere1 = driver.findElement(clickTryHerebutton1);
	clickTryHere1.click();
}

public void pythoncodeArray(String textbox) {
	
	WebElement clickpythoncodeArray = driver.findElement(pythoncodetxtbox2);
	Actions action = new Actions(driver); 
	action.sendKeys(clickpythoncodeArray ,"#empty array declaration\r\n"
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
			+ "").build().perform();
}

public void clickRunbutton4() {
	
	WebElement Runbutton4 = driver.findElement(clickrunbutton4);
	Runbutton4.click();
	
	}

public void pythoncodeArray1(String textbox) {
	WebElement clickpythoncodeArray1 = driver.findElement(pythoncodetxtbox3);
	Actions action = new Actions(driver); 
	action.sendKeys(clickpythoncodeArray1 ,"#empty array declaration\r\n"
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
			+ "").build().perform();
	
}

public void clickRunbutton5() {
	
	WebElement Runbutton5 = driver.findElement(clickrunbutton5);
	Runbutton5.click();
	
}

public void Queueoperations() {
	
	WebElement clickQueueop = driver.findElement(clickQueueoperations);
	clickQueueop.click();
}

public void TryEditorbox() {
	
	WebElement clickTryEditor = driver.findElement(clickTryHerebutton2);
	clickTryEditor.click();
}

public void PythoncodeQueueop(String textbox) {
	
	WebElement clickpythoncodeQueueop = driver.findElement(pythoncodetxtbox4);
	Actions action = new Actions(driver); 
	action.sendKeys(clickpythoncodeQueueop,"from collections import deque\r\n"
			+ "\r\n"
			+ "# Create a queue\r\n"
			+ "queue = deque()\r\n"
			+ "\r\n"
			+ "# Enqueue elements\r\n"
			+ "queue.append(\"apple\")\r\n"
			+ "queue.append(\"banana\")\r\n"
			+ "queue.append(\"cherry\")\r\n"
			+ "\r\n"
			+ "print(queue)").build().perform();
	
}

public void clickRunbutton6() {
	
	WebElement Runbutton6 = driver.findElement(clickrunbutton6);
	Runbutton6.click();
	
}

public void PythoncodeQueueop1(String textbox) {
	
	WebElement clickpythoncodeQueueop1 = driver.findElement(pythoncodetxtbox5);
	Actions action = new Actions(driver); 
	action.sendKeys(clickpythoncodeQueueop1,"from collections import deque\r\n"
			+ "\r\n"
			+ "# Create a queue\r\n"
			+ "queue = deque()()\r\n"
			+ "\r\n"
			+ "# Enqueue elements\r\n"
			+ "queue.append(\"apple\")\r\n"
			+ "queue.append(\"banana\")\r\n"
			+ "queue.append(\"cherry\")\r\n"
			+ "\r\n"
			+ "print(queue)").build().perform();
	
}

public void clickRunbutton7() {
	
	WebElement Runbutton7 = driver.findElement(clickrunbutton7);
	Runbutton7.click();
	
}

public void practiceqns() {
	
	WebElement clickpracticequestions = driver.findElement(clickpracticeqns);
	clickpracticequestions.click();
}

public void Queue() {
			clicklink();
			clicktryeditor();
			}
		
public void pythoncode(String textbox) {
			
			Enterpythoncode(textbox);
			clickRunbutton();
			Enterpythoncode1(textbox);
			clickRunbutton1();
		}
		
public void Queuecollections() {
			
			clickcollectionslink();
			clickTryHere();
		}
public void pythoncodeQueueImpl(String textbox) {
			pythoncodequeue(textbox);
			clickRunbutton2();
			pythoncodequeue1(textbox);
			clickRunbutton3();
			
		}
		
public void ArrayImpl()
		{
			clickArrayImplementation();	
			clickTryHerebox();
			
		}

public void pythoncodeArrayImpl(String textbox) {
			pythoncodeArray(textbox);
			clickRunbutton4();
			pythoncodeArray1(textbox);
			clickRunbutton5();
		}
		
public void QueueoperationsImpl() {
	
	Queueoperations();
	TryEditorbox();
	
}

public void pythoncodeQueueoperationsImpl(String textbox) {
	PythoncodeQueueop(textbox);
	clickRunbutton6();
	PythoncodeQueueop1(textbox);
	clickRunbutton7();
	practiceqns();
	
	}		
public void alert_ok_click() {
	Alert simpleAlert = driver.switchTo().alert();
	simpleAlert.accept();
		}

public void goBack()  {
	  		
	  driver.navigate().back();
	  	}

public void toHomePage() {
		driver.navigate().to(Url);
	}

		public void scrollAction() {
			Actions a = new Actions(driver);
			a.sendKeys(Keys.PAGE_DOWN).build().perform();
			
			}	
	}
