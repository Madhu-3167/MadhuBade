package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTour_HomePage_LinksTesting {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = null;
	String url="http://demoaut.com";
	
	System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
//	driver = new ChromeDriver();
	driver = new FirefoxDriver();
	
	driver.get(url);
	
	// Maximize the Browser
	driver.manage().window().maximize();
	
	List<WebElement>links=driver.findElements(By.tagName("a"));
	
	int linksCount=links.size();
	
	System.out.println(" The total number of links on NewTours Home Page are: "+linksCount);
	
	for(int i=0;i<linksCount;i++)
	{
		String linkName=links.get(i).getText();
		System.out.println(i+" "+linkName);
		
		links.get(i).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		//Thread.sleep(10000);
		
		driver.navigate().back();
		
// Re-creating the arrayList again -- since the elements in the arrayList will 
	//	be cleared - 
//Element not found in the cache - 
		//					perhaps the page has changed since it was looked up		
		
		links=driver.findElements(By.tagName("a"));
		
	}
	

	}

}
