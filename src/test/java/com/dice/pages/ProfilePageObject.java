package com.dice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dice.base.BasePageObject;

public class ProfilePageObject extends BasePageObject<ProfilePageObject> {

	private By editProfileButton = By.xpath("//button[@id='editProfile']");
	private By advancedSearchButton = By.xpath("//a[@class='dice-btn-link']");
	private By profileContactNameText = By.xpath("//h1[@class='profile-contact-name']");
	
	public ProfilePageObject(WebDriver driver) {
		super(driver);		
	}

	
	public void waitForProfilePageToLoad () {
		waitForVisibilityOf(editProfileButton);
		waitForVisibilityOf(advancedSearchButton, 10);
	}
	
	
	public boolean isCorrectProfileLoaded(String correctProfileName){
		if (getText(profileContactNameText).equals(correctProfileName)){return true;
		}
		else{
		return false;}
	}
	
}
