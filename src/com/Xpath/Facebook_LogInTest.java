package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		

		WebDriver driver = null;
		String url="http://facebook.com";
				
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.get(url);
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
// <input type="email"   data-testid="royal_email">
// <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">			

	// Xpath expression - based on external Property	
//WebElement email=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		
		// Xpath expression - based on Locator
//		WebElement email=driver.findElement(By.xpath("//*[@name='email']"));
				
		// //*[@id='email']"
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("hello");
		
// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
		// Xpath expression - based on multiple Properties
driver.findElement(By.xpath
	("//input[@class='inputtext' and @data-testid='royal_pass']")).sendKeys("Testing");	
		
		
			
				
				
				

	}

}
