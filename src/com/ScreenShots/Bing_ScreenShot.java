package com.ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_ScreenShot {

	public static void main(String[] args) throws IOException {
				
		 WebDriver driver = null;
		 String url="http://bing.com";
		 
 System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get(url);
		 
		 // TakesScreenshot - its an interface of WebDriver
		 // OutputType - its an interface of webDriver
		 // Type Casting
		 
File bing_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(bing_ScreenShot, new File("./ScreenShots/bing.png"));
		 
		 driver.close();
	
	}

}
