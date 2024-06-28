package PageObjectModel;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.*;
public class dsalgo_Login {
	
	private WebDriver driver;
	
	//By locators
	private By username = By.id("id_username");
	private By password = By.id("id_password");
	private By signIn = By.xpath("//a[@href='/login']"); 
	private By login = By.xpath("//input[@value = 'Login']");
	private By invalidMssg = By.xpath("//div[@role='alert']");
	
	//Constructor
	public dsalgo_Login(WebDriver driver) {
		this.driver = driver;		
	}
	
	//Actions
	public void enterUsername(String name) {
		WebElement user = driver.findElement(username);
		user.sendKeys(name);
	}
	
	public void enterPassword(String pass) {
		WebElement passwrd = driver.findElement(password);
		passwrd.sendKeys(pass);
	}
	
	public void clickLogin() {
		WebElement loginbtn = driver.findElement(login);
		loginbtn.click();
	}
	
	public void invalidClick()  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(signIn).click();		
		try {
				String filePath = "src\\test\\resources\\TestData\\cred.xlsx";
				FileInputStream fis = 	new FileInputStream(filePath);
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				int rCount = wb.getSheet("Sheet1").getLastRowNum();
				
				for(int i=0;i<=rCount;i++) {
						  String val =	wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
						  System.out.println(val);
						  driver.findElement(username).sendKeys(val);
						  String val2 =	wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
						  System.out.println(val2);
						  driver.findElement(password).sendKeys(val2);
						  Thread.sleep(2000);
						 
						  driver.findElement(login).click();
						  Thread.sleep(2000);
						 
						  System.out.println(driver.findElement(invalidMssg).getText());
						  Assert.assertEquals(driver.getTitle(), "Login");
				}
				
				wb.close();
				fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());		
		}
			
		System.out.println(driver.getTitle());
		if(driver != null) {
//			driver.close();
//			driver.quit();
		}
	}
	
	public home_page doLogin(String name, String pass) {
		
		driver.findElement(signIn).click();
		WebElement user = driver.findElement(username);
		user.sendKeys(name);
		WebElement passwrd = driver.findElement(password);
		passwrd.sendKeys(pass);
		WebElement loginbtn = driver.findElement(login);
		loginbtn.click();
		
		System.out.println(driver.getTitle());
		
		return new home_page(driver);
	}
	
	
}










