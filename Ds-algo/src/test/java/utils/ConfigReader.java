package utils;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
//     TestBaseT tc=new TestBaseT();
	private Properties prop;
	
    public Properties init_prop() {
//    	String url=prop.getProperty("url");
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\mukil\\eclipse-workspace\\Ds-algo\\src\\test\\resources\\Config\\global.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}

}


