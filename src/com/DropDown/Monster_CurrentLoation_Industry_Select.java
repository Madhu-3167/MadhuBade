package com.DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLoation_Industry_Select {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = null;
		String url="https://my.monsterindia.com/sponsered_popup.html";
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// class="border_grey1" - property of Current Location DropDown
WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
	/*
	  // get all the elements of the DropDown - Current Location	
	 List<WebElement>currenLoc=currentLocation.findElements(By.tagName("option"));
		
System.out.println(" Count of Elements in Currentlocation are : "
															+currenLoc.size());
		
		for(int i=0;i<currenLoc.size();i++)
		{
			System.out.println(currenLoc.get(i).getText());
		}
	*/
		
		// selection of optional value from Current Location Element
		
		Select selection = new Select(currentLocation);
		selection.selectByVisibleText("Delhi");
		
		// Automating Industry Element - id="id_industry"
		WebElement industry=driver.findElement(By.id("id_industry"));
		
		Select selection1 = new Select(industry);
		selection1.selectByIndex(1);
		selection1.selectByValue("4");
		selection1.selectByVisibleText("Banking/Financial Services");
		
		// deseleting Optional values from Industry Element
		selection1.deselectByValue("5");
		selection1.deselectByIndex(1);
		selection1.deselectByVisibleText("Automotive/Ancillaries");
		
		Thread.sleep(10000);
		selection1.deselectAll();
		
		
		
		
		
		
		//driver.quit();
		
		
	}

}
