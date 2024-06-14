package artigempages;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class POM_LOGON   {
	WebDriver driver = null;
  @Test
  public void f() throws Exception {
	  System.out.println("inside f method");
	  Login log = new Login(driver);
	  log.adjusterLogin();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://173.255.198.245:8080/evolution/#/login");
		driver.manage().window().maximize();
		
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

}
