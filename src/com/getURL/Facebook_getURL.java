package com.getURL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_getURL {

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
			String facebook_Url=driver.getCurrentUrl();
System.out.println(" The Current URl of Facebook HomePage is : "+facebook_Url);
			
		// getting the title of the current Webpage
			String facebook_Title=driver.getTitle();
System.out.println("The Title facebook HomePage is :"+facebook_Title);
				
			driver.close();	
	}
}
