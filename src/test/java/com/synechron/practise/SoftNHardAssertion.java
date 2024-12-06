package com.synechron.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftNHardAssertion {
	@Test
	public void Soft() {
		
		WebDriver driver = new ChromeDriver();
//	WebDriver driver1 = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		// Launch Website
		//soft assertion
		driver.get("https://the-internet.herokuapp.com/download");
		SoftAssert soft = new SoftAssert();
		
		String ExpTitle = "selenium";
		String ActTitle = driver.getTitle();
		soft.assertEquals(ExpTitle,ActTitle);
		
		//hard assertion
		
		HardAssert hard = new HardAssert();
				
		
		
	}

}
