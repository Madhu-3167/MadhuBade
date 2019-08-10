package com.ApplicationNavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_NavigateTo_BingApplication {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.bing.com");
		
		driver.get("http://www.facebook.com");
		
		driver.close();
		
		
		

	}

}
