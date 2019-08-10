package com.ValidatingUrl;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_Url_Title_FaceBook_Homepage {

	public static void main(String[] args) {
		
		// Saving the URL address of an application in a Variable
		String url="http://facebook.com";
		
		// Automating the Chrome Browser
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
//Passing the Variable(in which already the URl address is saved)to the get 
																	  //Method 
				driver.get(url);

		// getting the Url of the Current Webpage
			String actual_FacebookHomePageUrl=driver.getCurrentUrl();
System.out.println(" The Current URl of Facebook HomePage is : "
												+actual_FacebookHomePageUrl);

				String expected_FacebookHomePageUrl="facebook.com";
System.out.println("The expected Url of Facebook HomePage is : "
												+expected_FacebookHomePageUrl);

	if(actual_FacebookHomePageUrl.contains(expected_FacebookHomePageUrl))
	{
		System.out.println(" URL matched - PASS");
	}
	else
	{
		System.out.println(" URL Not Matched -FAIL");
	}


	// getting the title of the current Webpage
	String actual_FacebookHomePageTitle=driver.getTitle();
System.out.println("The Title facebook HomePage is :"
												+actual_FacebookHomePageTitle);
	
	String expected_FacebookHomePageTitle="Facebook – log in or sign up";
	System.out.println(" The expected Title of facebook HomePage is : "
											+expected_FacebookHomePageTitle);
	
	if(actual_FacebookHomePageTitle.equals(expected_FacebookHomePageTitle))
	{
		System.out.println(" Title Matched - PASS");
	}
	else
	{
		System.out.println(" Title Not Matched - FAIL");
	}

	driver.close();
	}
}
