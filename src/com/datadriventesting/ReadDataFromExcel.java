package com.datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	
	@Test
	
	public void ReadDataFromFile() throws EncryptedDocumentException, IOException
	{
		//Step 1 to read the input xls file
		
		FileInputStream fs = new FileInputStream("./InputTestData/InputData.xlsx");
		
		//Step 2 is to load the Workbook
		
		Workbook wb = WorkbookFactory.create(fs);
		
		//Step 3 is to load the worksheet
		
		Sheet sh = wb.getSheet("Login");
		
		//Step 4 is to read the Row value
		Row rw = sh.getRow(3);
		
		//Step 5 is to read the Coloum attribute
		Cell cel = rw.getCell(1);
		
		//String username = cel.getStringCellValue();
		
		//System.out.println(username);
		
		//This is your normal for loop
	
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			
			Row rowvalue = sh.getRow(i);
			System.out.println(rowvalue.getCell(0));
		}
		
		//Enhanced for loop
		for(Row rowvalue1:sh)
		{
			Cell cell = rowvalue1.getCell(1);
			System.out.println(rowvalue1.getCell(1));
			
		}
		
		
		
	}

}
