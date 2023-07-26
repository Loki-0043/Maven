package project.maven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
public class ExcelFileRead {
String FilePath =("F:\\java\\java workspace\\maven\\input\\Input.xlsx");
	
public void ReadData() throws IOException {
	File f =new File(FilePath);
	FileInputStream FS = new FileInputStream(f);
	XSSFWorkbook wr =new XSSFWorkbook(FS);
	Sheet sheet =wr.getSheet("sheet");
	int totalRow=sheet.getPhysicalNumberOfRows();
	for(int i=0;i<totalRow;i++) {
		Row inputRow =sheet.getRow(i);
		int totalColumn =inputRow.getLastCellNum();
		for(int j=0;j<totalColumn;j++) {
			Cell cellValue =inputRow.getCell(j);
			String actualValue =cellValue.getStringCellValue();
			System.out.print(actualValue);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}
public static void main(String[] args) throws IOException {
	
	ExcelFileRead e =new ExcelFileRead();
	e.ReadData();
		}

	}


