package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LinkedList_Page {
	
	private WebDriver driver;
		
	//By locators
	private By introLink = By.xpath("//a[@href='introduction']");
	private By insertLink =By.xpath("//a[@href = '/linked-list/insertion-in-linked-list/']");
	private By implementLink = By.xpath("//a[@href='/linked-list/implement-linked-list-in-python/']");
	private By traversalLink =By.xpath("//a[@href = '/linked-list/traversal/']");
	private By createtLink = By.xpath("//a[@href='/linked-list/creating-linked-list/']");
	private By deleteLink =By.xpath("//a[@href = '/linked-list/deletion-in-linked-list/']");
	private By typesLink = By.xpath("//a[@href='/linked-list/types-of-linked-list/']");
//	private By deleteLink =By.xpath("//a[@href = '/linked-list/deletion-in-linked-list/']");
	private By btnTryIt = By.xpath("//a[@href='/tryEditor']");
	private By signOut = By.xpath("//a[@href='/logout']");
	
	//Constructor
	public LinkedList_Page(WebDriver driver) {
		this.driver = driver;		
	}
	
	//Actions
	public void clickIntroLink() {
		driver.findElement(introLink).click();
	}
	
	public Editor_Page toEditorPage() {
		driver.findElement(btnTryIt).click();
		return new Editor_Page(driver);
	}
	
	public void clickIsertLink() {
		driver.findElement(insertLink).click();
	}
	
	public void clickImplementLink() {
		driver.findElement(implementLink).click();
	}
	
	public void clickTraversalLink() {
		driver.findElement(traversalLink).click();
	}
	
	public void clickCreateLink() {
		driver.findElement(createtLink).click();
	}
	
	public void clickDeleteLink() {
		driver.findElement(deleteLink).click();
	}
	
	public void clickTypesLink() {
		driver.findElement(typesLink).click();
	}
	
	public void clickSignOut() {
		driver.findElement(signOut).click();
//		if(driver != null) {
//			driver.close();
//			driver.quit();
//		}
	}
}





















