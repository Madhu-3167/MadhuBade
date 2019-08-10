package com.Xpath;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail_FullName {

	public static void main(String[] args) {
		

		WebDriver driver = null;
		String url="http://register.rediff.com/register/register.php?FormName=user_details";
				
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.get(url);
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Automating Full Name Element -  name="namee363e1ad"
		
		// name="name05e79af3"
		// name="name0fe2a262"
		
		//driver.findElement(By.name("namee363e1ad")).sendKeys("Srini");
		
//we see the Property of Full Name Element dynamically Changing - handling using
		// Dynamic Xpath expression Creation
driver.findElement(By.xpath("//*[starts-with(@name,'name')]"))
														.sendKeys("testing");
		
		
	}

}
