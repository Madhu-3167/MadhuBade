package com.MouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHoverOperation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		 String url="http://amazon.in";
		 
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get(url);
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 // id="nav-link-accountList" - proptery of Hello SignIn Element
		 
	WebElement helloSingIn=driver.findElement(By.id("nav-link-accountList"));
		 
// Mouse Operations or KeyBoard Operation - using Actions Class 
		 Actions act = new Actions(driver);
		  act.moveToElement(helloSingIn).perform();;
		
		  Thread.sleep(10000); // Explicit Wait
	
		  // Automating "Your Wish List" element - Type of Element is link
		  // its a Hidden Link
		 	driver.findElement(By.linkText("Your Wish List")).click();	 
	}
}
