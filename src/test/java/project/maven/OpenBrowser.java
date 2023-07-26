package project.maven;
import org.openqa.selenium.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenBrowser {
public void launchBrowser1() {
	WebDriver browser = new ChromeDriver();
	browser.get("https://www.facebook.com/");
	browser.manage().window().maximize();
}
public void lanchBrowser2() {
	WebDriver browser = new ChromeDriver();
	browser.get("https://www.instagram.com/");
	browser.manage().window().maximize();
}
	public static void main(String[] args) throws IOException {
	String filepath ="F:\\java\\java workspace\\maven\\src\\propertiesFile";
	File f = new File(filepath);
	//OpenBrowser lb =new OpenBrowser();
	FileInputStream FS = new FileInputStream(f);
	Properties p = new Properties();
	p.load(FS);
	OpenBrowser ob =new OpenBrowser();
	if (p.getProperty("getbrowser")==("facebook")) {
	ob.launchBrowser1();	
	}else if(p.getProperty("getbrowser")==("instagram")){
	ob.lanchBrowser2();
	}
	}

}
