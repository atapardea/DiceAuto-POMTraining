package com.dice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dice.base.BasePageObject;

public class LoginPageObject extends BasePageObject<LoginPageObject> {
	
	private static final String URL = "https://www.dice.com/dashboard";
	private By emailField = By.xpath("//input[@id='email']");
	private By passwordField = By.xpath("//input[@id='password']");
	private By signInButton = By.xpath("//button[@type='submit']");
	private By errorMessage = By.xpath("//span[@data-automation-id='login-failure-help-message']");
	
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
	
	public String getLoginErrorMessage(){
		waitForVisibilityOf(errorMessage, 10);
		return getText(errorMessage);
	}
	
}
