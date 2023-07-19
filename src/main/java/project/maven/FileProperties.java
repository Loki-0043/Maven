package project.maven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
 public class FileProperties {
//String filePath ="F:\java\java workspace\maven\src\main\java\project\maven\\input\\env.properties";
public void readProperties() throws IOException {
	File F =new File("F:\\java\\java workspace\\maven\\src\\main\\java\\project\\maven\\Example.txt");
	FileInputStream Fs= new FileInputStream(F);
	Properties p = new Properties();
	p.load(Fs);
	String actualName = p.getProperty("name");
	System.out.println(actualName);
	System.out.println(p.getProperty("age"));
	p.getProperty("course","testing");
	System.out.println(p.getProperty("course"));
	}
	 static void main(String[] args) throws IOException {
		 FileProperties p = new FileProperties ();
		p.readProperties();
	}
	}


