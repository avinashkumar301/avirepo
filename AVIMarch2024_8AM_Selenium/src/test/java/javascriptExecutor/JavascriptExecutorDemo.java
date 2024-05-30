package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorDemo {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("document.getElementById('email').value='avinash'");
		 
		 String title = js.executeScript("return document.title").toString();
		 System.out.println(title);
		 
		 js.executeScript("window.scrollBy(0,300)");
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
