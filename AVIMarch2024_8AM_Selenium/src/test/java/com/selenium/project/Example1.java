package com.selenium.project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.wait(3000);
		if(driver.switchTo().alert() != null)
		{
			System.out.println("egtg");
		    Alert alert = driver.switchTo().alert();
		    String alertText = alert.getText();
		    alert.dismiss(); // alert.accept();

		}
		
		//driver.wait(3000);
		//driver.findElement(By.className("logSprite icClose")).click();
		//Alert alert = driver.switchTo().alert();
	}

}
