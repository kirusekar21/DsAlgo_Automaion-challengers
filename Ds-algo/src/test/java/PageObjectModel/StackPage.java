package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StackPage {
	private WebDriver driver;

	public StackPage(WebDriver driver) {
		
		this.driver = driver;
	}
	private By StackGetStarted=By.xpath("//div/a[@href='stack']");
	public void stackGetStarted() {
		
		driver.findElement(StackGetStarted).click();
    }
}
