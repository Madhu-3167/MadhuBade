package com.WebTable;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TimeAndData_CapturingCompleteWebTableData extends TestBase {
		
	@Test
	public void capturingCompleteWebTableData()
	{
		
/*
 / first Row of First Column Xpath Expression
 /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		 
 // Last Row of Last Column  Xpath Expression
/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]		
 */
		for(int i=1;i<=36;i++) // to goto all the Rows
		{
			for(int k=1;k<=8;k++) // to got Every Row of all the Columns
			{
String data=driver.findElement(By.xpath
("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["
										+i+"]/td["+k+"]")).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
			
		}
		
	}
	
	

}
