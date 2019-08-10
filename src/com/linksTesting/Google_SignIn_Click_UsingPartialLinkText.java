package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_Click_UsingPartialLinkText {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://google.com";
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				 driver = new ChromeDriver();
				 
		driver.navigate().to(url);
		
		/*
 <a  id="gb_70" href="https://accounts.google.com/>Sign in</a>
		 */

		//WebElement signIn=driver.findElement(By.linkText("Sign in"));
					// OR
// consider a part of the text of the Link when going with locator partialLinkText
		
		WebElement signIn=driver.findElement(By.partialLinkText("Sign"));
		signIn.click();
		
		
		
	}
}
