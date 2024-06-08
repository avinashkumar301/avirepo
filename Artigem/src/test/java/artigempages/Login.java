package artigempages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{

	@FindBy(id="UserName") WebElement adjEmail;
	@FindBy(name="password") WebElement adjPassword;
	@FindBy(xpath="//button[@type='button'][@ng-click='LogIn($event)']") WebElement logButton;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void adjusterLogin() 
	{
		adjEmail.sendKeys("adjuster1@sakhaglobal.com");
		adjPassword.sendKeys("Artigem#1");
		logButton.click();
		
	}
}
