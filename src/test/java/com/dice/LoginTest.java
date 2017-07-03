package com.dice;

import org.testng.annotations.Test;

import com.dice.base.BaseTest;
import com.dice.pages.LoginPageObject;
import com.dice.pages.ProfilePageObject;

import junit.framework.Assert;

public class LoginTest extends BaseTest {

	@Test
	public void positiveLoginTest() {
	
		LoginPageObject loginpage = new LoginPageObject(driver);
		String expectedPageTitle = "Seeker Dashboard - Profile";
		
		// open dice login page : https://www.dice.com/dashboard		
		loginpage.openLoginPage();
		
		//fill up email and password
		loginpage.fillUpEmailAndPassword("atapardearo@outlook.com", "Iamcomplex123");
		
		// press sign in button and wait for profile page to load
		ProfilePageObject profilePage = loginpage.pushSignInButton();
		profilePage.waitForProfilePageToLoad();
	
		//Verifications
		
		
		//verify - title of the page
		String actualTitle = profilePage.getTitle();
		Assert.assertTrue("Actual Page title is different from expected page title", 
				expectedPageTitle.equals(actualTitle));
		
		//verify correct name on profile page
		Assert.assertTrue("Actual name is different from expected name title",
				profilePage.isCorrectProfileLoaded("atp atp"));
	}
	
}
