//package PageObjectModel;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class Tree_Page {
//	
//	private WebDriver driver;
//		
//	//By locators
//	private By introTreeLink = By.xpath("//a[@href='types-of-trees']");
//	private By insertTreeLink =By.xpath("//a[@href = '/tree/types-of-binary-trees/']");
//	private By btnTreeTryIt = By.xpath("//a[@href='/tryEditor']");
//	private By treeSignOut = By.xpath("//a[@href='/logout']");
//
//	
//	//Constructor
//	public Tree_Page(WebDriver driver) {
//		this.driver = driver;		
//	}
//	
//	//Actions
//	public void clickTreeIntroLink() {
//		driver.findElement(introTreeLink).click();
//	}
//	
//	public Editor_TreePage toEditorPage() {
//		driver.findElement(btnTreeTryIt).click();
//		return new Editor_TreePage(driver);
//	}
//	
//	public void clickIsertLink() {
//		driver.findElement(insertTreeLink).click();
//	}
//	
//	public void clickSignOut() {
//		driver.findElement(treeSignOut).click();
//		if(driver != null) {
//			driver.close();
//			driver.quit();
//		}
//	}
//
//}
// old code from alice ends

package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tree_Page {
	
	private WebDriver driver;
		
	//By locators
	private By introTreeLink = By.xpath("//a[@href='types-of-trees']");
	private By termTreeLink = By.xpath("//a[@href='/tree/terminologies/']");
	private By traversalTreeLink = By.xpath("//a[@href='/tree/traversals-illustration/']");
	private By implTreeLink = By.xpath("//a[@href='/tree/implementation-in-python/']");
	private By binaryTreeLink = By.xpath("//a[@href='/tree/binary-tree-traversals/']");
	private By appTreeLink = By.xpath("//a[@href='/tree/applications-of-binary-trees/']");
	private By impbTreeLink = By.xpath("//a[@href='/tree/implementation-of-bst/']");
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
	
	public void clickTraversal() {
		driver.findElement(traversalTreeLink).click();
	}
	
	public void clickTerm() {
		driver.findElement(termTreeLink).click();
	}
	
	public void clickImpl() {
		driver.findElement(implTreeLink).click();
	}
	
	public void clickAppTree() {
		driver.findElement(appTreeLink).click();
	}
	
	public void clickImpBTree() {
		driver.findElement(impbTreeLink).click();
	}
	
	public void clickBinaryTree() {
		driver.findElement(binaryTreeLink).click();
	}
	
	
	public void clickSignOut() {
		driver.findElement(treeSignOut).click();
		if(driver != null) {
			driver.close();
			driver.quit();
		}
	}
}

