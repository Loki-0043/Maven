package project.maven;
import java.io.IOException;

//import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
//import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class ExcelRead {
	String filePath=("F:\\Microsoft 365\\Book.xlsx");
public void readData() throws IOException 
{
	File f = new File("filePath");
	FileInputStream FS =new FileInputStream(f);
	XSSFWorkbook workbook =new XSSFWorkbook(FS);
	//HSSFWorkbook workbook = new HSSFWorkbook(FS); 
	Sheet sheet = workbook.getSheet("Sheet1");// read sheet inside the workbook by its name
	int totalRows = sheet.getPhysicalNumberOfRows();
	
	for(int i=0;i<totalRows;i++) {
		Row inputRow =sheet.getRow(i);
		int totalColumn =inputRow.getLastCellNum();
		for(int j=0;j<totalColumn;j++) {
			Cell cellValue = inputRow.getCell(j);
			String actualValue =cellValue.getStringCellValue();
			System.out.print(actualValue);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}
	public static void main(String[] args) throws IOException {
		ExcelRead e =new ExcelRead();
		e.readData();
		

	}

}
