package com.getTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_CapturingTitle {

	public static void main(String[] args) {
		
		// Automating the Chrome Browser
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Navigate to an Application Url
		//driver.get("http://bing.com");
		driver.navigate().to("http://bing.com");
		
// Identifying the title of the Current Webpage - ( Application bing.com ) 
		String bingTitle=driver.getTitle();
		
// Printing the identified title of the current Webpage		
		System.out.println(" The Title of Bing Home page is : "+bingTitle);
	
		// Closing the Browser
		driver.close();

	}

}
