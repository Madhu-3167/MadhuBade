package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest {

	public static void main(String[] args) {
				
		// WebDriver - its an interface of Selenium
		
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		
System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		 driver = new FirefoxDriver();
		
		// System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 //driver = new ChromeDriver();
		 
		 driver.get(url);
		 
		 // <input type="text" name="userName" size="10">
		 driver.findElement(By.name("userName")).sendKeys("tutorial");
		 
		 // <input type="password" name="password" size="10">
		 driver.findElement(By.name("password")).sendKeys("tutorial");
		 
// <input type="image" name="login" >		 
	driver.findElement(By.name("login")).click();
	
	String expected_TitleAfterLogIn="Find";
	System.out.println(" The Expected Title is : "+expected_TitleAfterLogIn);
	
	String actual_TitleAfterLogIn=driver.getTitle();
	System.out.println(" The Actual Title is : "+actual_TitleAfterLogIn);
	
	if(actual_TitleAfterLogIn.contains(expected_TitleAfterLogIn))
	{
		System.out.println(" The Title Matched - PASS");
	}
	else
	{
		System.out.println(" The Title Not Matched - FAIL");
	}
		driver.quit(); // Will close the Browser along with Tab's
		 

		 	
	}

}
