package com.dice;
import org.testng.annotations.Test;
import com.dice.base.BaseTest;

public class FirstTest extends BaseTest {
	

	
	@Test
	public void firstTestMethod () {	
		//Open dice.com
		driver.get("http://dice.com");	
	} 
	
	
	
	
}
