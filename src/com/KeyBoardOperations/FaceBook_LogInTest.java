package com.KeyBoardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBook_LogInTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http:facebook.com";
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// id="email"
		driver.findElement(By.id("email")).sendKeys("hello");
		
		Actions act = new Actions(driver);
				// Using actions class Object(act) - performing "TAB" Operation
// the focus of the cursor will move from Email element to password Element
		act.sendKeys(Keys.TAB).perform();
		
		// Automating Password Element
// since the action Class Object(act) focus is on Password Element -without
		//  recognizing the Property of Password Element automating it
		
		act.sendKeys("Testing").perform();
		
//Automating LogIn button-Using actions Class object-with Enter Key of keyboard 			
		act.sendKeys(Keys.ENTER).perform();
			
	}
}
