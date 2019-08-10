package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		
FileInputStream fis = new FileInputStream
						("./src/com/ExcelTestDataFiles/MultipleTestData.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// finding the active Rows in the Sheet - with the test Data
		int rowCount=sheet.getLastRowNum();
		
		for(int i=0;i<=rowCount;i++) // To reach to every active Row
		{
			Row row=sheet.getRow(i); // at a particular Row
			
int cellCount=row.getLastCellNum(); // finding active cell's of a particular Row

	for(int j=0;j<cellCount;j++) // to goto every active Cell of the Row
	{
		String data=row.getCell(j).getStringCellValue();
		System.out.print(data+" ");
	}
	System.out.println();
			
		}
		

	}

}
