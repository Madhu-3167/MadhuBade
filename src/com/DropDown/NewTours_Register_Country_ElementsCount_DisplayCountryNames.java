package com.DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_Country_ElementsCount_DisplayCountryNames {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		// name="country" - property of Country Element
		
		WebElement country=driver.findElement(By.name("country"));
// in the country dropDown finding all the elements in it using option tag
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
		int countiesCount=countries.size();
System.out.println(" The total number of Countries are : "+countiesCount);
		
		for(int k=0;k<countiesCount;k++)
		{
			String countryName=countries.get(k).getText();
			System.out.println(k+" "+countryName);
		}
	driver.quit();
		
		
		
		
		
		
		

	}

}
