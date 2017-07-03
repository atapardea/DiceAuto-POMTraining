package com.dice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dice.base.BasePageObject;

public class LoginPageObject extends BasePageObject<LoginPageObject> {
	
	private static final String URL = "https://www.dice.com/dashboard";
	private By emailField = By.xpath("//input[@id='email']");
	private By passwordField = By.xpath("//input[@id='password']");
	private By signInButton = By.xpath("//button[@type='submit']");
	
	public LoginPageObject(WebDriver driver) {
		super(driver);
	}
    
	public void openLoginPage(){
		getPage(URL);
	}
	
	
	public void fillUpEmailAndPassword(String email, String password){
		type(email, emailField); 
		type(password, passwordField);
	}
	
	public ProfilePageObject pushSignInButton(){
		click(signInButton);
		return new ProfilePageObject(driver);
		
	}
	
}
