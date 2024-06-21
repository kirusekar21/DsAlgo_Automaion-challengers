package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tree_Page {
	
	private WebDriver driver;
		
	//By locators
	private By introTreeLink = By.xpath("//a[@href='types-of-trees']");
	private By insertTreeLink =By.xpath("//a[@href = '/tree/types-of-binary-trees/']");
	private By btnTreeTryIt = By.xpath("//a[@href='/tryEditor']");
	private By treeSignOut = By.xpath("//a[@href='/logout']");

	
	//Constructor
	public Tree_Page(WebDriver driver) {
		this.driver = driver;		
	}
	
	//Actions
	public void clickTreeIntroLink() {
		driver.findElement(introTreeLink).click();
	}
	
	public Editor_TreePage toEditorPage() {
		driver.findElement(btnTreeTryIt).click();
		return new Editor_TreePage(driver);
	}
	
	public void clickIsertLink() {
		driver.findElement(insertTreeLink).click();
	}
	
	public void clickSignOut() {
		driver.findElement(treeSignOut).click();
		if(driver != null) {
			driver.close();
			driver.quit();
		}
	}

}
