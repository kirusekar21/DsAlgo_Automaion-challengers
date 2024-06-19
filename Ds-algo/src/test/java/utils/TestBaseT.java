package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseT {

	protected static WebDriver driver;
	public static String browser;
	// public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	public WebDriver WebDriverManager() throws IOException {

		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"//src/test/resources/Config/global.properties");
		Properties prop= new Properties();
		prop.load(ip);
		String url=prop.getProperty("url");

		if(driver==null) { 
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.edge.driver","./src/test/resources/drivers/chromedriver.exe");
				driver =new FirefoxDriver();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
				//		  System.setProperty("webdriver.edge.driver","./src/test/resources/drivers/chromedriver.exe");
				driver = new EdgeDriver();
			}

			driver.get(url); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		return driver;
	}

}
//String browserName = prop.getProperty("browser");