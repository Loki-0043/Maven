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
     WebDriver driver;
     public void fromElement(String ExpectedcityName) throws InterruptedException {
    	// ChromeOptions options = new ChromeOptions();
    	//	options.addArguments("--satart-maximized");
    		//options.addArguments("--disable--popup");
    		driver= new EdgeDriver();
    	 driver.get("https://www.makemytrip.com/");
    	 driver.manage().window().maximize();
    	// browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    //	 browser.findElement(By.xpath("//*[contains(@class,'react-autosuggest__suggestions')]")).click();
    
    	 //browser.findElement(By.className("desktop in")).click();
    	 Thread.sleep(2000);
          driver.findElement(By.xpath("//*[contains(@for,'fromCity')]")).click();
 		List<WebElement> fromCity = driver.findElements(By.xpath("//*[contains(@class,'autoSuggestPlugin')]//li"));
 	
 		for(int i=1;i<=fromCity.size();i++)
 		{
 			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
 			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'autoSuggestPlugin')]//li[last()]")));
 			String actualCity = driver.findElement(By.xpath("//*[contains(@class,'autoSuggestPlugin')]//li["+i+"]")).getText();
 			
 			if(actualCity.trim().contains(ExpectedcityName))
 			{
 				driver.findElement(By.xpath("//*[contains(@class,'autoSuggestPlugin')]//li["+i+"]")).click();
 				break;
 				
 			}}   
 		}
     public void ToElement(String ExpectedToName) throws InterruptedException {
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[contains(@for,'toCity')]")).click();
	List<WebElement> fromCity = driver.findElements(By.xpath("//*[contains(@class,'autoSuggestPlugin hsw_autocomplePopup')]//li"));

	for(int i=1;i<=fromCity.size();i++)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'autoSuggestPlugin hsw_autocomplePopup')]//li[last()]")));
		String actualCity = driver.findElement(By.xpath("//*[contains(@class,'autoSuggestPlugin hsw_autocomplePopup')]//li["+i+"]")).getText();
		
		if(actualCity.trim().contains(ExpectedToName))
		{
			driver.findElement(By.xpath("//*[contains(@class,'autoSuggestPlugin hsw_autocomplePopup')]//li["+i+"]")).click();
			break;
			
		}}   
	}
     public void dayElement(String ExpectedDate) throws InterruptedException {
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[text()='Departure']")).click();
         driver.findElement(By.xpath("//*[@class='DayPicker-Day'][contains(@aria-label,'Fri Sep 01 2023')]")).click();    	/*List<WebElement> fromCity = driver.findElements(By.xpath("//*[@class='DayPicker-Months']//li"));
    	for(int i=1;i<=fromCity.size();i++)
    	{
    		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
    		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'autoSuggestPlugin hsw_autocomplePopup')]//li[last()]")));
    		String actualCity = driver.findElement(By.xpath("//*[contains(@class,'autoSuggestPlugin hsw_autocomplePopup')]//li["+i+"]")).getText();
    		
    		if(actualCity.trim().contains(ExpectedDate))
    		{
    			driver.findElement(By.xpath("//*[contains(@class,'autoSuggestPlugin hsw_autocomplePopup')]//li["+i+"]")).click();
    			break;
    			
    		}}   
    	}*/
     }
         
	public static void main(String[] args) throws InterruptedException {
		
		MakeMyTrip mt =new MakeMyTrip();
		//mt.fromElement("Hyderabad, India");
		//mt.ToElement("Bangkok, Thailand");
		mt.dayElement("");
	}

}
