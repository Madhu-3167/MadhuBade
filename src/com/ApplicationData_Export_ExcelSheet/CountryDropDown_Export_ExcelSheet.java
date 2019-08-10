package com.ApplicationData_Export_ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountryDropDown_Export_ExcelSheet {

	public static void main(String[] args) throws IOException {
	
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
		
FileInputStream fis = new FileInputStream
						("./src/ExcelTestDataFiles/SingleTestData.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		for(int k=0;k<countiesCount;k++)
		{
			Row row=sheet.createRow(k);
			Cell cell=row.createCell(0);
			
			String countryName=countries.get(k).getText();
			System.out.println(k+" "+countryName);
		
			cell.setCellValue(countryName);
			
FileOutputStream file = new FileOutputStream
						("./src/ExcelTestDataFiles/SingleTestData.xlsx");
			workBook.write(file);
		}
	driver.quit();
	}
}
