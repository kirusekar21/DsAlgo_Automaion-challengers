package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class graphPage {
	public static  WebDriver driver;
	 
	 String Url="https://dsportalapp.herokuapp.com/home";
	 private By graphStarted=By.xpath("//div/a[@href='graph']");
	 private By graphPagelink=By.linkText("Graph");
	 private By runBtn=By.xpath("//button[@type='button']");
	 private By codeEdit=By.xpath("//div[@class='CodeMirror-sizer']");
	 private By output=By.id("output");
	 private By graph_Representations=By.linkText("Graph Representations");
	 private By veriftGraphRepText=By.xpath("//strong/p[@class='bg-secondary text-white']");
	 private By practiceQuestion=By.linkText("Practice Questions");
	 private By signout=By.linkText("Sign out");
  public graphPage(WebDriver driver) {
	  
	     this.driver=driver;
	 }
  public void signout() {
  	driver.findElement(signout).click();
  } 
	public void clickgraph() throws InterruptedException   {
		Thread.sleep(2000);
		driver.findElement(graphStarted).click();
	}
	public void clickgraphPage() {
		driver.findElement(graphPagelink).click();
	}
	public void run_btn_click() {
		driver.findElement(runBtn).click();
	}
	public void CodeEditor() {
		WebElement entervalidcode=driver.findElement(codeEdit);
		 Actions action = new Actions(driver);
		action.sendKeys(entervalidcode,"graph = {\r\n"
			+ " \"a\" : [\"b\",\"c\"], \r\n"
			+ "\"b\" : [\"a\", \"d\"],\r\n"
			+"}\r\n"
			+ "print(graph)").build().perform();
		}
	public void invalidCodeEditor() {
		WebElement entervalidcode=driver.findElement(codeEdit);
		Actions action = new Actions(driver);
		action.sendKeys(entervalidcode,"System.out.println(\"Hello World\")").build().perform();
		}
	public void alert_ok_click() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	
  	public void outputText() {
  		WebElement outputPrint=driver.findElement(output);
  		String printOutput=outputPrint.getText();
  		System.out.println(printOutput);
  	}
  	
  	public void goBack()  {
  		
  		driver.navigate().back();
  	}
  	public void toHomePage() {
  		driver.navigate().to(Url);
  	}
  	public void clickgraphRepresentations() {
		driver.findElement(graph_Representations).click();
	}
  	public void verifycodeTitle() {
  		String actualTitle=driver.getTitle();
  		String ExpectedTitle="Assessment";
  		System.out.println(actualTitle);
  		Assert.assertEquals(actualTitle,ExpectedTitle);
    }
  	public void verifyGraphTitle() {
  		String actualTitle=driver.getTitle();
  		String ExpectedTitle="Graph";
  		Assert.assertEquals(actualTitle,ExpectedTitle);
    }
  	public void verifyPracticeTitle() {
  		String actualTitle=driver.getTitle();
  		String ExpectedTitle="Practice Questions";
  		System.out.println(actualTitle);
  		Assert.assertEquals(actualTitle,ExpectedTitle);
    }
  	public void verifyGRTitle() {
  		String actualTitle=driver.getTitle();
  		String ExpectedTitle="Graph Representations";
  		System.out.println(actualTitle);
  		Assert.assertEquals(actualTitle,ExpectedTitle);
//  		WebElement verifyTextGR=driver.findElement(veriftGraphRepText);
//  		String ver_Graph_Rep=verifyTextGR.getText();
//  		System.out.println(ver_Graph_Rep);
  	}
  	public void CodeEditorGR() {
		WebElement entervalidGR=driver.findElement(codeEdit);
		Actions action = new Actions(driver);
		action.sendKeys(entervalidGR,"class Graph:\r\n"
				+ " def __init__(self):\r\n"
				+ "self.vertices = {}\r\n"
				+ "def add_vertex(self, vertex):\r\n"
				+ "self.vertices[vertex] = []\r\n"
				+ "def add_edge(self, vertex1, vertex2):\r\n"
				+ "self.vertices[vertex1].append(vertex2)\r\n"
				+ "def print_graph(self):\r\n"
				+ "for vertex in self.vertices:\r\n"
				+ "print(vertex, \"->\", self.vertices[vertex])\r\n"
				
				+ "graph = Graph()\r\n"
				+ "# Add vertices\r\n"
				+ "graph.add_vertex(\"A\")\r\n"
				+ "graph.add_vertex(\"B\")\r\n"
				+ "graph.add_vertex(\"C\")\r\n"
				+ "graph.add_vertex(\"D\")\r\n"
				+ "graph.add_vertex(\"E\")\r\n"
				
				+ "graph.add_edge(\"A\", \"B\")\r\n"
				+ "graph.add_edge(\"A\", \"C\")\r\n"
				+ "graph.add_edge(\"B\", \"C\")\r\n"
				+ "graph.add_edge(\"B\", \"D\")\r\n"
				+ "graph.add_edge(\"C\", \"D\")\r\n"
				+ "graph.add_edge(\"D\", \"E\")\r\n"
				
				+ "graph.print_graph()").build().perform();
		}
  	public void clickPractice() {
		driver.findElement(practiceQuestion).click();
	}
  	
	}
	
	
	
	
	

