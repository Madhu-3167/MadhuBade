package com.getAttibute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_GetAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
String referenceURL=driver.findElement(By.linkText("REGISTER")).
														getAttribute("href");
		System.out.println(" The reference URL of Register Element is : "
																+referenceURL);
		
		// <input type="text" name="userName" size="10">
	
String userNameElement_Proptery=driver.findElement(By.name("userName"))
														.getAttribute("name");
		System.out.println(userNameElement_Proptery);
		
		driver.quit();
	}
}
