package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_HomePage_LinksCount {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get(url);
			 
			 /*
	<a href="mercurysignon.php">SIGN-ON</a>
	<a href="mercuryregister.php">REGISTER</a>
	<a href="mercuryunderconst.php">SUPPORT</a>
			  */
	// Identifying all the elements on the Webpage by TagaName-'a'		 
// since more than One element is stored into links - it is declared as List		 
	List<WebElement>links=driver.findElements(By.tagName("a"));

	// finding the size of the ArrayList(links)
	int linksCount=links.size();
	
System.out.println("The total number of links on the NewTours Homepage are: "
																+linksCount);
	driver.quit();
	}

}
