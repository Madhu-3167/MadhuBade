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

public class UserRegistration extends BaseTest
{
	@Test(priority=1)
	public void register() throws IOException
	{
		// <a href="mercuryregister.php">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
				
	}
	
	@Test(priority=2)
	public void userRegistration() throws IOException, InterruptedException
	{

		FileInputStream file = new FileInputStream
	("./src/com/ApplicationTestDataFiles/NewUserRegistrationTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<rowCount;i++)
		{
			Row row=sheet.getRow(i);
			
driver.findElement(By.name("firstName")).sendKeys(row.getCell(0).getStringCellValue());
driver.findElement(By.name("lastName")).sendKeys(row.getCell(1).getStringCellValue());
			
			// Type Casting
			double phone=row.getCell(2).getNumericCellValue();
			long phoneNo=(long)phone;
			String phoneNumber=Long.toString(phoneNo);
			
driver.findElement(By.name("phone")).sendKeys(phoneNumber);
driver.findElement(By.id("userName")).sendKeys(row.getCell(3).getStringCellValue());
driver.findElement(By.name("address1")).sendKeys(row.getCell(4).getStringCellValue());
driver.findElement(By.name("city")).sendKeys(row.getCell(5).getStringCellValue());
driver.findElement(By.name("state")).sendKeys(row.getCell(6).getStringCellValue());
			
			double postal=row.getCell(7).getNumericCellValue();
			long postalNo=(long)postal;
			String postalCode=Long.toString(postalNo);
			
driver.findElement(By.name("postalCode")).sendKeys(postalCode);
			
driver.findElement(By.name("country")).sendKeys(row.getCell(8).getStringCellValue());
driver.findElement(By.id("email")).sendKeys(row.getCell(9).getStringCellValue());
driver.findElement(By.name("password")).sendKeys(row.getCell(10).getStringCellValue());
driver.findElement(By.name("confirmPassword")).sendKeys(row.getCell(11).getStringCellValue());
			
			Thread.sleep(2000);
			driver.findElement(By.name("register")).click();
			
			
String expected_UserName=row.getCell(9).getStringCellValue();
	System.out.println(" The Expected UserName is : "+expected_UserName);

	// Xpath of the Registered Text
String actual_RegisteredUserNameText=driver.findElement
(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/"
		+ "td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
System.out.println(" The Actual Registered User Text is : "+actual_RegisteredUserNameText);
			
	if(actual_RegisteredUserNameText.contains(expected_UserName))
			{
	System.out.println(" User Registered Successfully - PASS");
	row.createCell(12).setCellValue("User Registered Successfully - PASS");
			}
			else
			{
				System.out.println(" user Registration Failed - FAIL");
	row.createCell(12).setCellValue("user Registration Failed - FAIL");
			}
			
	Thread.sleep(3000);
			driver.navigate().back();
			
FileOutputStream file1 = new FileOutputStream
	("./src/com/ApplicationTestResultFiles/UserRegistration_TestResult.xlsx");
			workBook.write(file1);
		}
		
		
	}
	
	
	
}
