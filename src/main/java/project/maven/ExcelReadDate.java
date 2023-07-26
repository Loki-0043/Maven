package project.maven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
public class ExcelReadDate {
String FilePath =("F:\\java\\java workspace\\maven\\input\\Input.xlsx");
public void readWithDate() throws IOException {
	File f =new File(FilePath);
	FileInputStream FS =new FileInputStream(f);
	XSSFWorkbook wr =new XSSFWorkbook(FS);
	Sheet sheet =wr.getSheet("sheet");
	int totalRow =sheet.getPhysicalNumberOfRows();
	for(int i=0;i<totalRow;i++) {
		Row inputRow=sheet.getRow(i);
		int totalColumn=inputRow.getLastCellNum();
		for(int j=0;j<totalColumn;j++) {
			Cell cellValue =inputRow.getCell(j);
			System.out.print(GetData(cellValue));
			System.out.print(" ");
		}
		System.out.println("");
	}
			
}
	public Object GetData(Cell cellValue) {
	{
	if(cellValue.getCellType()==CellType.STRING)
	return cellValue.getStringCellValue();
	} 
	 if(cellValue.getCellType()==CellType.NUMERIC) 
	{
		DataFormatter dataFormatter=new DataFormatter();
		return dataFormatter.formatCellValue(cellValue);
	}
	return null;
	}

	public static void main(String[] args) throws IOException {
		ExcelReadDate E= new ExcelReadDate();
	E.readWithDate();

	}

}
