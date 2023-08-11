package project.maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MakeMyTrip {
     WebDriver browser;
     public void fromElement(String ExpectedcityName) {
    	 ChromeOptions options = new ChromeOptions();
    		options.addArguments("--satart-maximized");
    		options.addArguments("--disable--popup");
    		browser= new ChromeDriver(options);
    	 browser.get("https://www.makemytrip.com/");
    	 browser.manage().window().maximize();
    	 browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    	 browser.findElement(By.xpath("//*[@class='chNavIcon appendBottom2 chSprite chFlights active']")).click();
    
    	 //browser.findElement(By.className("desktop in")).click();
    	 browser.findElement(By.xpath("//*[@id='fromCity']")).click();
    	/*List<WebElement> city = browser.findElements(By.xpath("//*[@id='react-autowhatever-1']//li"));
    	 for(int i=1;i<=city.size();i++) {
    		 WebDriverWait wait = new WebDriverWait (browser, Duration.ofSeconds(60));
    		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='react-autowhatever-1']//li[last()]")));
    		 String actualcityName = browser.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]")).getText();
    	
    		 if(actualcityName.equalsIgnoreCase(ExpectedcityName))
 			{
 			browser.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]")).click();
 			break;
 			}}*/
    	 
     }
     
	public static void main(String[] args) {
		
		MakeMyTrip mt =new MakeMyTrip();
		mt.fromElement("New Delhi, India");
		
	}

}
