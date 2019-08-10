package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TimeAndDate_DynamicWebTable extends TestBase{

	@Test
	public void dynamicWebTable_dataCapture()
	{
		// Identifying the Table - xpath 
		// /html/body/div[1]/div[6]/section[1]/div
WebElement table=driver.findElement
						(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));

	// Identifying the Rows in the Table
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++) // to goto all the Rows in the table
		{
			// Goto a Row and find the number of Columns in it
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			
		for(int k=0;k<cols.size();k++) // to goto every Row of all the columns
			{
				// get the data from the Row of a Column
				String data=cols.get(k).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
	driver.quit();
	}
	}
