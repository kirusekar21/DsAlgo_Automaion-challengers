package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class RegistrationPage {
  static WebDriver driver;
  private By startBtn=By.xpath("//button[@class='btn']");
  private By registerLink=By.linkText("Register");
  private By registerBtn=By.xpath("//input[@value='Register']");
  private By username=By.id("id_username");
  private By password=By.id("id_password1");
  private By passwordConfirm=By.id("id_password2");
  private By loginInstead=By.linkText("Login");
 
  public RegistrationPage(WebDriver driver) {
	  this.driver=driver;
  }
  public void startButton() {
	  driver.findElement(startBtn).click();
  }
  
  public void registerlink() {
	  driver.findElement(registerLink).click();
  }
  public void ClickregisterButton() {
	  driver.findElement(registerBtn).click();
  }
  public void userNameValErr() {
	    WebElement activeElement = driver.switchTo().activeElement();
		String empfieldError=activeElement.getAttribute("validationMessage");
		System.out.println(empfieldError);
  }
  public void passwordValErr() {
	    WebElement activeElement = driver.switchTo().activeElement();
		String onlyUserfieldError=activeElement .getAttribute("validationMessage");
		System.out.println(onlyUserfieldError);
}
  public void passwordConfirmValErr() {
	   WebElement activeElement = driver.switchTo().activeElement();
	   String confirmfieldError=activeElement.getAttribute("validationMessage");
		System.out.println(confirmfieldError);
}
   public void username() {
	  driver.findElement(username).sendKeys("numpygirls");
  }
  public void password() {
	  driver.findElement(password).sendKeys("@Aagks123");
  }
  public void passwordDigits() {
	  driver.findElement(password).sendKeys("1234567");
  }
  public void passwordconfirm() {
	  driver.findElement(passwordConfirm).sendKeys("wrongpass");
  }
  public void correctpasswordconfirm() {
	  driver.findElement(passwordConfirm).sendKeys("@Aagks123");
  }
 
  public void registerationTitle() {
	    String actualTitle=driver.getTitle();
		String ExpectedTitle="Registeration";
		Assert.assertEquals(actualTitle,ExpectedTitle);
  }
  
  public String warningMsg() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement warningMsgText=driver.findElement(By.xpath("//div[@role=\"alert\"]"));
	  return warningMsgText.getText();
  }
public void  login() {
	driver.findElement(loginInstead).click();
}
}
