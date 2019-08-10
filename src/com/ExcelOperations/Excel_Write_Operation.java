package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_Operation {

	public static void main(String[] args) throws IOException {
		
FileInputStream file = new FileInputStream
						("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// creating a Row in the Sheet
		Row row=sheet.createRow(3);
		
		// creating a Cell in the Row created
		Cell cell=row.createCell(4);
		
		// setting the value into the Row of a cell Created
		cell.setCellValue("Testing");
		
		// Saving the WorkBook in the FILE
FileOutputStream file1 = new FileOutputStream
						("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		workBook.write(file1);
	}
}
