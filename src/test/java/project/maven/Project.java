package project.maven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
public final class Project {
	static WebDriver browser;
	public void luanchBrowser( String browservalue) {
		//String browser =p.get
		if(browservalue.equalsIgnoreCase("Chrome")) {
		WebDriver browser =new ChromeDriver();
		browser.get("https://www.facebook.com");
		browser.manage().window().maximize();
		browser.findElement(By.linkText("Forgotten password?")).click();
	}else if(browservalue.equalsIgnoreCase("edge")) {
		
	   WebDriver browser = new EdgeDriver();
		browser.get("https://www.facebook.com");
		browser.manage().window().maximize();
		browser.findElement(By.linkText("Forgotten password?")).click();
	}	
	}
		public static void main(String[] args) throws IOException {
			//String filePath =("F:\\java\\java workspace\\maven\\src\\test\\Project.Properties");
		//	File f = new File(filePath);
			/*FileInputStream FS = new FileInputStream("F:\\\\java\\\\java workspace\\\\maven\\\\src\\\\test\\\\Project.Properties");
			Properties p = new Properties();
			p.load(FS);*/
			Project FP =new Project();
			 FP.luanchBrowser("edge");
		}

	}


