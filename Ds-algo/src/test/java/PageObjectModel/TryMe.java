package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TryMe {
   
	public static WebDriver driver;
	private By try_me=By.linkText("Try here>>>");
	
	public TryMe(WebDriver driver) {
		this.driver = driver;
	}
	public void clickTryMe() {
		driver.findElement(try_me).click();
	}
}
