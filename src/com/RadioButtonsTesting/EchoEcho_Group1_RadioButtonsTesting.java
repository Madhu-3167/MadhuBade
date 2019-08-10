package com.RadioButtonsTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EchoEcho_Group1_RadioButtonsTesting {
	
	WebDriver driver = null;
	String url="http://www.echoecho.com/htmlforms10.htm";
	
	@BeforeTest
	public void setUp()
	{		
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	

	@Test
	public void group1_RadioButtonsTesting()
	{
		
		/*
<input type="radio" name="group1" value="Milk">
<input type="radio" name="group1" value="Butter" checked="">
<input type="radio" name="group1" value="Cheese">

		 */
	
// identify the Block of the Radio Buttons
// /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td
		
WebElement radioButtonsBlock=driver.findElement
(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/"
		+ "tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));

List<WebElement>group1_RadioButtons=radioButtonsBlock.findElements
															(By.name("group1"));
		
int group1_radioButtonsCount=group1_RadioButtons.size();
System.out.println
	("The elements - radio Buttons in group1 are "+group1_radioButtonsCount);
				
	for(int i=0;i<group1_radioButtonsCount;i++)
	{
		//String radioButtonName=group1_RadioButtons.get(i).getAttribute("value");
		//System.out.println(radioButtonName);
		
		group1_RadioButtons.get(i).click();
		
		for(int k=0;k<group1_radioButtonsCount;k++)
		{
	
//System.out.println(group1_RadioButtons.get(k).getAttribute("value")+"  - "+ 
	//				group1_RadioButtons.get(k).getAttribute("checked"));
			
System.out.println(group1_RadioButtons.get(k).getAttribute("value")+"  - "+ 
				group1_RadioButtons.get(k).isSelected());
		}
		
	}


		driver.quit();
	}

}
