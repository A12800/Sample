package com.synechron.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	
		@Test
		public void launchbrowser() {
			WebDriver driver = new ChromeDriver();
//			WebDriver driver1 = new FirefoxDriver();
			
			driver.manage().window().maximize();
			 
	        // Launch Website
	        driver.get("https://www.amazon.in/");
		}
		@Test
		public void launchbrowserFireFox() {
//			WebDriver driver = new ChromeDriver();
			WebDriver driver1 = new FirefoxDriver();
			
			driver1.manage().window().maximize();
			
			// Launch Website
			driver1.get("https://www.amazon.in/");
		}
	

}
