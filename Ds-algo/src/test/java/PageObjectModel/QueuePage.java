package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QueuePage {
		private WebDriver driver;

		public QueuePage(WebDriver driver) {
			
			this.driver = driver;
		}
		private By QueGetStarted=By.xpath("//div/a[@href='queue']");
		public void QueueGetStarted() {
			
			driver.findElement(QueGetStarted).click();
	    }
	}

