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
	@FindBy(xpath="//button[@ng-click='NewClaim()']") WebElement newClaim;
	
	public Login(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		PageFactory.initElements(driver, this);
		
	}
	
	public void adjusterLogin() throws Exception 
	{
		adjEmail.sendKeys("adjuster1@sakhaglobal.com");
		adjPassword.sendKeys("Artigem#1");
		logButton.click();
		Thread.sleep(3000);
		int num = (int) (Math.random() * 1000000);
		System.out.println();
		newClaim.click();
		newClaim.click();
		
		
		
	}
}
