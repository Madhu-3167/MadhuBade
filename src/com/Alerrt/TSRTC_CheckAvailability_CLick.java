package com.Alerrt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_CheckAvailability_CLick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="https://www.tsrtconline.in/oprs-web/";
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// id="searchBtn" - property of Check Availability Element
		driver.findElement(By.id("searchBtn")).click();
		
		// Switching from the WebPage to an Alert window
		Alert alt =driver.switchTo().alert();
		
		String alert_Text=alt.getText();
		System.out.println(" the text of an Alert is :"+alert_Text);
		
		Thread.sleep(10000);
		
		// accept the OK button of an Alert
		alt.accept();
		
		// to perform the operation on Cancel Button
		//alt.dismiss();
		
		// sending the data into an alert
		//alt.sendKeys("Testing");
		
		// id="fromPlaceName"
		driver.findElement(By.id("fromPlaceName")).sendKeys("MANCHERIAL");
		
	}

}
