package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlock_ElementsCount {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://www.tsrtconline.in/oprs-web/";
		
System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		
		driver.get(url);
		
		// Maximize the Browser
		driver.manage().window().maximize();
		
		// class="menu-wrap" - property of HeaderBlock
		WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		
	List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		
		int headerBlockLinksCount=headerBlockLinks.size();
System.out.println(" The total number of Elements in HeaderBlock are :"
														+headerBlockLinksCount);
		
		for(int k=0;k<headerBlockLinksCount;k++)
		{
			String headerBlockLinkName=headerBlockLinks.get(k).getText();
			System.out.println(k+" "+headerBlockLinkName);
		}
		driver.close();
	}
}
