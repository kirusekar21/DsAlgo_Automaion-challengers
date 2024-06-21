package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class home_page {
	
	private WebDriver driver;

	
	//By locators
	private By startLink = By.xpath("//a[@href ='linked-list']");
	private By startTreeLink = By.xpath("//a[@href ='tree']");
	
	//Constructor
	public home_page(WebDriver driver) {
		this.driver = driver;		
	}
	
	//Actions
	public void clickStartedLink() {
		driver.findElement(startLink).click();
	}
	
	public LinkedList_Page navigateLinkedList()
	{
		driver.findElement(startLink).click();
		return new LinkedList_Page(driver);
	}
	
	public Tree_Page navigateTreePage()
	{
		driver.findElement(startTreeLink).click();
		return new Tree_Page(driver);
	}
	
	
	

}
