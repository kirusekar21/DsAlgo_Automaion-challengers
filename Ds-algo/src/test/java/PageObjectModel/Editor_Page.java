package PageObjectModel;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
public class Editor_Page {
	
	private WebDriver driver;
	private String exCode;
	private By run = By.xpath("//button[@type='button']");
	private By output = By.xpath("//pre[@id ='output']");
	
	//Constructor
	public Editor_Page(WebDriver driver) {
		this.driver = driver;		
	}
	
	//Actions
	public void navigateBack() {
		driver.navigate().back();
	}
	
	public void tearDown() {
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//if(driver != null) {
		driver.navigate().back();
		driver.navigate().back();
			//driver.close();
			//driver.quit();
		//}
	}
	
	public void sendCode() {
		
		try {
			String filePath = "src\\test\\resources\\TestData\\insertLink.xlsx";
			FileInputStream fis = 	new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int rCount = wb.getSheet("Sheet1").getLastRowNum();
			for(int i=0;i<=rCount;i++) {
				exCode =	wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
				Actions actions = new Actions(driver);
				actions.sendKeys(exCode).build().perform();
				actions.sendKeys(Keys.RETURN).build().perform();
				actions.sendKeys(Keys.HOME).build().perform();
			    //System.out.println(exCode);
			}
    		wb.close();
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());		
		}
		driver.findElement(run).click();
		String otp = driver.findElement(output).getText();
		System.out.println(otp);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { e.printStackTrace();	}
		
		
	}
	
	public void sendWrongCode() {
		
		Actions actions = new Actions(driver);
		actions.sendKeys("print(\1234567\")").build().perform();
		
		driver.findElement(run).click();
		Alert al = driver.switchTo().alert();
		String erMsg = al.getText();
		System.out.println(erMsg);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { e.printStackTrace();	}
		
		al.dismiss();
	}
}