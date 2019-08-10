package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Images_Click {

	public static void main(String[] args) {

		WebDriver driver = null;
		String url="http://google.com";
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				 driver = new ChromeDriver();
				 
		driver.navigate().to(url);
		
// <a class="gb_d" data-pid="2" href="https://www.google.co.in">Images</a>
		
// <a class="gb_e" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=ri&amp;ogbl">Images</a>
// <a class="gb_e" data-pid="23" href="https://mail.google.com/mail/?tab=rm&amp;ogbl">Gmail</a>		
		
		//driver.findElement(By.className("gb_d")).click();
		driver.findElement(By.className("gb_e")).click();
		
		// WebElement images=driver.findElement(By.linkText("Images"));
				
		//images.click();

	}

}
