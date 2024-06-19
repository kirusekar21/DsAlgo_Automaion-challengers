package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArrayPage {
	
	private WebDriver driver;

	public ArrayPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	private By AGetStarted=By.xpath("//div/a[@href='array']");
	
    public void ArrayGetStarted() {
		driver.findElement(AGetStarted).click();
    }
}
