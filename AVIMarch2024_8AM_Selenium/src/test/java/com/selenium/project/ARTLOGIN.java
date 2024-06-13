package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ARTLOGIN {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://173.255.198.245/login");
		driver.manage().window().maximize();
		driver.wait(3000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("adjuster1@sakhaglobal.com");
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("Artigem#1");
		WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));
		logIn.click();
		

	}

}
