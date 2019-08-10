package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_HomePage_SignOn_Click {

	public static void main(String[] args) {
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get(url);
			 /*
 <a href="mercurysignon.php?">SIGN-ON</a>

		a - an Anchor Tag
		href - an Attribute

 		Type of Element - link

 		Locator - linkText
 		Selector - SIGN-ON
			  */
			
	// driver.findElement(By.linkText("SIGN-ON")).click();
			 // or
			 
	 WebElement signOn=driver.findElement(By.linkText("SIGN-ON"));
	 signOn.click();
	 
			 
 System.out.println(" The title of SignOn Webpage is : "+driver.getTitle());
 
 driver.close();
			 
			 
			 
			 
			
	}

}
