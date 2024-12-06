package com.synechron.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test(groups= {"Regression" , "Sanity"})
	
	public void dragndrop() {
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.manage().window().maximize();
		 
        // Launch Website
        driver1.get("https://the-internet.herokuapp.com/drag_and_drop");
        
        WebElement source = driver1.findElement(By.xpath("//div[@id='column-a']"));
        WebElement dest = driver1.findElement(By.xpath("//div[@id='column-b']"));
        
        Actions act = new Actions(driver1);
        
        act.dragAndDrop(source, dest).perform();
	}

}
