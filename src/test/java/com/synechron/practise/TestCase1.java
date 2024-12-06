package com.synechron.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase1 {
    @Test(groups = ("Regression"))
	public void launchbrowser() {
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.manage().window().maximize();
		 
        // Launch Website
        driver1.get("https://www.amazon.in/");
	}
}
