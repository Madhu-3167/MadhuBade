package com.IsDisplayed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LogIn_IdentifyLinksCount_DisplayingNamesOfLinks {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.id("btnLogin")).click();
		
		String expected_LogInText="Welcome";
System.out.println(" The Expected Text after LogIn to OHRM Application is :"
														+expected_LogInText);
		
// <a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		
		WebElement actual_WelcomeElement=driver.findElement(By.id("welcome"));
		String actual_WelComeText=actual_WelcomeElement.getText();
System.out.println(" The actual Text after LogIn to OHRM Application is :"
														+actual_WelComeText);
		
		if(actual_WelComeText.contains(expected_LogInText))
		{
			System.out.println(" LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn failed - FAIL");
		}
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		System.out.println(" The total Number of Links are : "+linksCount);
				
		for(int i=0;i<linksCount;i++)
		{
			if(links.get(i).isDisplayed())
			{
		String linkName=links.get(i).getText();
		System.out.println(linkName);
			}
		}
				
		actual_WelcomeElement.click();
	// <a href="/orangehrm-4.0/symfony/web/index.php/auth/logout">Logout</a>
		
		// Synchronization
		Thread.sleep(10000);// Explicit Wait
				
		WebElement logOut=driver.findElement(By.linkText("Logout"));
		logOut.click();
			
		driver.close();
	}
}
