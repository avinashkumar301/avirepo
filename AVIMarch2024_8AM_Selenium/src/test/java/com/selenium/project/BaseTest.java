package com.selenium.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties p;
	public static  Properties mainprop;
	public static  Properties childprop;
	public static Properties orProp;

	
	public static void init() throws Exception  {
		File f = new File("C:\\Users\\SAKHA TECH\\eclipse-workspace\\March2024_8AM_Selenium\\src\\test\\resources\\data.properties");
		FileInputStream fis = new FileInputStream(f);//retrive data from file
		 p = new Properties();
		p.load(fis);
		String val = p.getProperty("chromebrowser");
		//System.out.println(val);
		fis = new FileInputStream("C:\\Users\\SAKHA TECH\\eclipse-workspace\\March2024_8AM_Selenium\\src\\test\\resources\\Environment.properties");
		mainprop = new Properties();
		mainprop.load(fis);
		String e = mainprop.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream("C:\\Users\\SAKHA TECH\\eclipse-workspace\\March2024_8AM_Selenium\\src\\test\\resources\\"+e+".ptoperties");
		childprop = new Properties();
		childprop.load(fis);
		String v = childprop.getProperty("amazonurl");
		System.out.println(v);
		fis = new FileInputStream("C:\\Users\\SAKHA TECH\\eclipse-workspace\\March2024_8AM_Selenium\\src\\test\\resources\\or.properties");
		orProp = new Properties();
		orProp.load(fis);
		
		
		
		
	}
	
	public static void launch(String browserType ) {
		if(p.getProperty(browserType).equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(p.getProperty(browserType).equals("firefox")) {
		driver = new FirefoxDriver();
	}else if(p.getProperty(browserType).equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
  }
	public static void navigateURL(String url) {
		driver.get(childprop.getProperty(url));
	}
	
	public static void clickElement(String locatorKey) {
		driver.findElement(By.xpath(orProp.getProperty(locatorKey))).click();
	}

	public static void typeText(String locatorKey, String text) {
		driver.findElement(By.name(orProp.getProperty(locatorKey))).sendKeys(text);
		
	}

	public static void selectOption(String locatorKey, String option) {
		driver.findElement(By.id(orProp.getProperty(locatorKey))).sendKeys(option);
		
	}

}

//	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//
//	}


