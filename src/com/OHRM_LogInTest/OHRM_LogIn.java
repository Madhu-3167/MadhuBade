package com.OHRM_LogInTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LogIn
{

public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = null;
String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		
System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
FileInputStream file = new FileInputStream
("./src/com/ApplicationTestDataFiles/OHRM_LogIn_TestData_SingleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		Row row=sheet.getRow(1);
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(row.getCell(0).getStringCellValue());
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(row.getCell(1).getStringCellValue());
		
		WebElement logIn=driver.findElement(By.id("btnLogin"));
		logIn.click();
		
		String expected_LogInText="Welcome";
		System.out.println(" The expected logIn text is :"+expected_LogInText);
		
		WebElement welComeElement=driver.findElement(By.id("welcome"));
		String actual_LogInText=welComeElement.getText();
		System.out.println(" The actual LogIn text is : "+actual_LogInText);
		
		if(actual_LogInText.contains(expected_LogInText))
		{
			System.out.println(" LogIN Is successfull - PASS");
			row.createCell(2).setCellValue("LogIN Is successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn is Failed - FAIL");
			row.createCell(2).setCellValue("LogIn is Failed - FAIL");
		}

		// Writing the Result into another Package into a New File
FileOutputStream file1 = new FileOutputStream
("./src/com/ApplicationTestResultFiles/OHRM_LogInTestResult_SingleTestData.xlsx");
		workBook.write(file1);
		
		welComeElement.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
}
