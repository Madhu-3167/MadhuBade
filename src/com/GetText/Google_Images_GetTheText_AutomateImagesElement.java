package com.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Images_GetTheText_AutomateImagesElement {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://google.com";
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				 driver = new ChromeDriver();
				 
		driver.navigate().to(url);
		
		// Property of Images Element
// <a class="gb_d" data-pid="2" href="https://www.google.co.in">Images</a>
		
// Identifying the Images Element with its property - Saving in a Variable (img)
// Since an Element is saved in a Variable - it should be declared as WebElement
		
		WebElement img=driver.findElement(By.linkText("Images"));
		//String images=driver.findElement(By.linkText("Images")).getText();
						// OR
		// using the 'img' Variable - Performing the Operation on it "getText()"
// Since the text of the Element is saved in a variable it should be declared
		// as String dataType
		
		String images_Text=img.getText();
		System.out.println(" The Text of Images WebElement is : "+images_Text);

// Using the same variable(img) - performing Click operation on it - instead of
	// finding the same element again - 
		img.click();
	System.out.println(" The title of Imaes WebPage is : "+driver.getTitle());
	
		driver.close();
	}
}
