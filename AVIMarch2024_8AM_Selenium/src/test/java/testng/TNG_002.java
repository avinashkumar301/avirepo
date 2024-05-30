package testng;

import org.testng.annotations.Test;

import com.selenium.project.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;  

public class TNG_002   {
  @Test
  public void f() {
	  System.out.println("test method");
  }
  @BeforeMethod
  public void beforeMethod() throws Exception
  {
	  System.out.println("dsnj");
	  WebDriverManager.chromedriver().setup();
     	WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
