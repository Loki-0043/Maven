package project.maven;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelWrite 
{
	String FilePath =("E:\\Output.xls");
String[] name= {"Kishor","Mohan","Mega"};

public void ExcelWriteData() throws IOException {
	File f = new File(FilePath);
	FileOutputStream FS = new FileOutputStream(f);
	HSSFWorkbook wr =new HSSFWorkbook();
	Sheet sheet = wr.createSheet("login");
	int totalRow =name.length;
	for(int i=0;i<totalRow;i++) {
		Row inputRow =sheet.createRow(i);
		Cell cellValue =inputRow.createCell(i);
		cellValue.setCellValue(name[i]);
	}
	wr.write(FS);
	wr.close();
	FS.close();
	System.out.println("done");
	
}
	public static void main(String[] args) throws IOException {
		
		ExcelWrite e = new ExcelWrite ();
		e.ExcelWriteData();
	}

}
