package project.maven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class NewExcellReadData {
	//Static Object s;
String FilePath=("F:\\java\\java workspace\\maven\\input\\InputData.xlsx");
public Object[] [] ExcelRead(String FileName, String SheetName) throws FileNotFoundException{
	Object [] [] excelreadarray =null;
	File f =new File(FilePath,FileName);
	FileInputStream FS =new FileInputStream(f);
	return excelreadarray;
	
	
	
}
	

	public static void main(String[] args) {
		

	}

}
