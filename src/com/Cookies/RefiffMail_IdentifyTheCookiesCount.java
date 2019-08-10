package com.Cookies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefiffMail_IdentifyTheCookiesCount {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://register.rediff.com/register/register.php?FormName=user_details";
				
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.get(url);
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<Cookie>rediffMailHomePageCookies=driver.manage().getCookies();
		
		int CookiesCount=rediffMailHomePageCookies.size();
		System.out.println(" The total number of Cookies are : "+CookiesCount);
		
		// for each loop
		for(Cookie var:rediffMailHomePageCookies)
		{
			System.out.println(var);
		}
		
		driver.manage().deleteAllCookies();
		
		rediffMailHomePageCookies=driver.manage().getCookies();
		CookiesCount=rediffMailHomePageCookies.size();
		
		System.out.println(" The total number of Cookies are : "+CookiesCount);
		driver.quit();
	}
}
