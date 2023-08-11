package XpathAndCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {
	WebDriver driver;
public void FlipCakt() throws Exception {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--satart-maximized");
	options.addArguments("--disable--popup");
	driver= new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
	
	
	}
public static void main(String[] args) throws Exception {
	Xpath p= new Xpath();
	p.FlipCakt();
}

}
