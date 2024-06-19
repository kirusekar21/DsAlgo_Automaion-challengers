package stepDefinitions;




import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObjectModel.DSIntro;
import PageObjectModel.QueuePage;
import PageObjectModel.StackPage;
import PageObjectModel.TryMe;
import PageObjectModel.graphPage;
import PageObjectModel.loginPages;
import io.cucumber.java.en.Then;
import utils.TestBaseT;

public class QueueSteps {
	public static WebDriver driver;
	private QueuePage queue;
	private TryMe try_me;
	public loginPages login;
	public TestBaseT tc;
	DSIntro DSIntroduction;
	WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(5));
	public QueueSteps() throws IOException {
		tc=new TestBaseT();
		DSIntroduction=new DSIntro(tc.WebDriverManager());
		queue=new QueuePage(tc.WebDriverManager());
		login=new loginPages(tc.WebDriverManager());
		try_me=new TryMe(tc.WebDriverManager());

	}
	@Then("The User should navigate to Queue Page")
	public void the_user_should_navigate_to_stack_page() {
		queue.QueueGetStarted();
	}
}


