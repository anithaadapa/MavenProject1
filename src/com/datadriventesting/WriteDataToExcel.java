package com.datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDataToExcel {
	
	@Test
	
	public void WriteDataToExcel() throws EncryptedDocumentException, IOException
	{
		
		
		
		FileInputStream fs = new FileInputStream("./InputTestData/InputData.xlsx");
		
		//Step 2 is to load the Workbook
		
		Workbook wb = WorkbookFactory.create(fs);

		
		//Step 3 is to load the worksheet
		
		Sheet sh = wb.getSheet("Login");
		
		//Step 4 - Specify from which row we need to read the data
		
		Row rw = sh.createRow(12);
		
		//Step 5 - specify in which cell we have to give the data
		
		Cell cell = rw.createCell(0);
		
		cell.setCellValue("Nivya");
		
		//To write the output value in to excel
		
		FileOutputStream fout = new FileOutputStream("./InputTestData/InputData.xlsx");
		wb.write(fout);
		
	}
	
	

}
