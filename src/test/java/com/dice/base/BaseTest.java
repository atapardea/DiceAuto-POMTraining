package com.dice.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver;
	
	
	@Parameters ({"browser"})
	@BeforeMethod
	public void setUp(String browser){
		
		
		driver = BrowserFactory.getDriver(browser);
		
		
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();	
	}
	
}
