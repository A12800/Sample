package com.synechron.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParametersExample {

	@Test
	@Parameters("browsers")
	public void launchbrowser(String browsers) {
		
		if(browsers.equals("chrome")) {
			WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			// Launch Website
			driver.get("https://www.amazon.in/");
			
		}else if(browsers.equals("firefox")) {
			WebDriver driver = new ChromeDriver();
			WebDriver driver1 = new FirefoxDriver();
			
			driver1.manage().window().maximize();
			
			// Launch Website
			driver1.get("https://www.amazon.in/");
		}
	}
	
}
