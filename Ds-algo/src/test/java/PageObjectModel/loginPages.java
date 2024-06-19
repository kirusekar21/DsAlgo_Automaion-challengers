package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPages {
	
public static WebDriver driver;

public loginPages(WebDriver driver) {
	 this.driver=driver;
}

private By loginBtn=By.linkText("Sign in");
private By username=By.id("id_username");
private By password=By.id("id_password");
private By clickLogin=By.xpath("//input[@type=\"submit\"]");


public void clickSignIn() {
	driver.findElement(loginBtn).click();
}
public void enterUsername(String user) {
	driver.findElement(username).sendKeys(user);	
}
public void enterpassword(String pass) {
	driver.findElement(password).sendKeys(pass);	
}
public void login_btn() {
	driver.findElement(clickLogin).click();	
}
}
