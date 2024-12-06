package com.synechron.practise;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test(groups = ("Regression"))
	public void downloadpdf() {
		
//		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.manage().window().maximize();
		 
        // Launch Website
        driver1.get("https://the-internet.herokuapp.com/download");
		
		WebElement download = driver1.findElement(By.xpath("//a[normalize-space()='sample.pdf']"));
		download.click();
		
		File f = new File("C:\\Users\\Kiosk_user\\Downloads\\sample.pdf");
		
		if(f.exists()) {
			System.out.println("File exists in the folder");
			
		}else {
			System.out.println("File doesn't exist");
		}
	}
	

}
