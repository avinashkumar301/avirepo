package com.selenium.project;

import org.openqa.selenium.By;

public class TC_002 extends BaseTest {

	public static void main(String[] args) throws Exception {
		init();
		launch("chromebrowser");
		navigateURL("amazonurl");
		driver.manage().window().maximize();
		
	/*	driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		driver.findElement(By.name("field-keywords")).sendKeys("Harry potter");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		*/
		selectOption("amazonsearchdropbox_id","Books");
		typeText("amazonsearchtext_name","Harry potter");
		clickElement("amazonsearchbutton_xpath");

	}
	
	

	
}
