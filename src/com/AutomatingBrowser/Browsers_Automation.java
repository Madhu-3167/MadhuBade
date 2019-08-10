package com.AutomatingBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers_Automation {

	public static void main(String[] args) {
		
		// Chrome Browser Automation
System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\1030JulyBatch\\WebApplicationTesting\\driverFiles\\chromedriver.exe");
ChromeDriver cd = new ChromeDriver();
		
		// FireFox Browser Automation
		// '.' indicates Current Working directory
System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		FirefoxDriver f = new FirefoxDriver();
		
		// Edge Browser Automation
System.setProperty("webdriver.edge.driver", "./driverFiles/MicrosoftWebDriver.exe");
		EdgeDriver ed = new EdgeDriver();
		
		// Internet Explorer Browser Automation
System.setProperty("webdriver.ie.driver", "./driverFiles/IEDriverServer.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();

	}
}
