package com.ValidtingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_BingHomePage {

	public static void main(String[] args) {
		
		// Automating the Chrome Browser
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
		// Navigate to an Application Url
		//driver.get("http://bing.com");
		driver.navigate().to("http://bing.com");
		
		String expected_BingHomePageTitle="Bing";
System.out.println(" The Expected Title of Bing Home Page is :"
												+expected_BingHomePageTitle);
				
		String actual_BingHomePageTitle=driver.getTitle();
System.out.println(" The actual Title of Bing Home Page is : "
													+actual_BingHomePageTitle);
	
// Validating the Title
		if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
		{
			System.out.println(" The Title Matched - PASS");
		}
		else
		{
			System.out.println(" The Title Not Matched - FAIL");
		}
				
		driver.close();
	}
}
