package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{

	@Test
	public void logIn() throws IOException
	{
		// identifying the file on the System
FileInputStream file = new FileInputStream
							("./src/com/NewTours/Config/newTours.properties");

		// Properties - its a class in Java to work with Properties file
		Properties prop = new Properties();
		prop.load(file);
		
	WebElement userName=driver.findElement(By.name(prop.getProperty("uName")));
		userName.sendKeys(prop.getProperty("UserName"));
		
	WebElement password=driver.findElement(By.name(prop.getProperty("pwd")));
		password.sendKeys(prop.getProperty("Password"));
		
	WebElement signIn=driver.findElement(By.name(prop.getProperty("signIn")));
		signIn.click();
		
		String expected_Title="Find";
		System.out.println(" The expected Title is : "+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println(" The actual Title is : "+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println(" LogIn Successfully - PASS");
			
		}
		else
		{
			System.out.println("LogIn Failed - FAIL");
			
		}
	}
	
}
