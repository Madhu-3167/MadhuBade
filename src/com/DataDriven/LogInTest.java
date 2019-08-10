package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
	
	@Test
	public void logIn() throws IOException
	{
		FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		
		for(int i=1;i<=rows;i++) // to goto all the Rows - to test the functionality with the test data
		{
		
		
			Row row=sheet.getRow(i);
			
			WebElement userName=driver.findElement(By.name("userName"));
			userName.clear();
			userName.sendKeys(row.getCell(0).getStringCellValue());
			
			WebElement password=driver.findElement(By.name("password"));
			password.clear();
			password.sendKeys(row.getCell(1).getStringCellValue());
			
			driver.findElement(By.name("login")).click();
			
			String expected_Title="Find";
			System.out.println(" The expected Title is : "+expected_Title);
			
			String actual_Title=driver.getTitle();
			System.out.println(" The actual Title is : "+actual_Title);
			
			if(actual_Title.contains(expected_Title))
			{
				System.out.println(" LogIn Successfully - PASS");
				row.createCell(2).setCellValue("LogIn Successfully - PASS");
			}
			else
			{
				System.out.println("LogIn Failed - FAIL");
				row.createCell(2).setCellValue("LogIn Failed - FAIL");
			}
			
			driver.navigate().back();
			FileOutputStream file1 = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_LogIn_TestResults.xlsx");
			workBook.write(file1);
		}
		
		
		
	}

}
