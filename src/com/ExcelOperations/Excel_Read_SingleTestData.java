package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
		
		// Identify the Excel file in the System
FileInputStream file = new FileInputStream
						("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		
		// Identify the workBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		// Identify the Sheet in the WorkBook
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// Identify the Row in the Sheet
		Row row=sheet.getRow(0);
		
		// Identify the Row of a cell
		Cell cell=row.getCell(0);
		
		// get the data from the row of a cell
		String data=cell.getStringCellValue();
		System.out.println(data);
		

	}

}
