package selenium;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.edge.EdgeOptions;
public class ListConceptPractice {
	WebDriver driver;
	public void listConceptForCountrys( String ExpectedCountryesName) {
		EdgeOptions options = new EdgeOptions();
		driver= new EdgeDriver(options);
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='j_idt87:country']//div[contains(@class,'ui-selectonemenu-trigger')]")).click();
		List<WebElement> countries = driver.findElements(By.xpath("//*[@id='j_idt87:country_items']//li"));
		
		for(int i=1;i<=countries.size();i++)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='j_idt87:country_items']//li[last()]")));
			String actualCountryName = driver.findElement(By.xpath("//*[@id='j_idt87:country_items']//li["+i+"]")).getText();
			if(actualCountryName.equalsIgnoreCase(ExpectedCountryesName))
			{
			driver.findElement(By.xpath("//*[@id='j_idt87:country_items']//li["+i+"]")).click();
				break;
			}
		}
		
}
	public void citySeection( String ExpectedCityName) {
		
		driver.findElement(By.xpath("//*[@id='j_idt87:city']//div[contains(@class,'ui-selectonemenu-trigger')]")).click();
	System.out.println("pass"); 
		List<WebElement> citys = driver.findElements(By.xpath("//*[@id='j_idt87:city']//li"));
	 for(int i=1;i<=citys.size();i++) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='j_idt87:city_items']//li[last()]")));
	String actualCityName =	driver.findElement(By.xpath("//*[@id='j_idt87:city_items']//li["+i+"]")).getText();
	if(actualCityName.equalsIgnoreCase(ExpectedCityName)) {
		driver.findElement(By.xpath("//*[@id='j_idt87:city_items']//li["+i+"]")).click();
		break;
	}
	}
	}
	public void course(String ExceptedCourseName) {
		driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete']//*[contains(@class,'ui-autocomplete-dropdown')]")).click();
	List<WebElement> courses = driver.findElements(By.xpath("//*[@id='j_idt87:auto-complete']//li"));
	for(int i=1;i<=courses.size();i++) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@class,'ui-autocomplete-items')]//li[last()]")));
		String actualCourseName =driver.findElement(By.xpath("//*[contains(@class,'ui-autocomplete-items')]//li["+i+"]")).getText();	
	if(actualCourseName.equalsIgnoreCase(ExceptedCourseName))
	{
		driver.findElement(By.xpath("//*[contains(@class,'ui-autocomplete-items')]//li["+i+"]")).click();
		break;
	
	}
	}
	}
	public void launguage(String ExceptedlaunguageName) {
		driver.findElement(By.xpath("//*[@id='j_idt87:lang']//*[contains(@class,'ui-selectonemenu-trigger')]")).click();
	List<WebElement> launguage = driver.findElements(By.xpath("//*[@id='j_idt87:lang_items']//li"));
	for(int i=1;i<=launguage.size();i++) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='j_idt87:lang_items']//li[last()]")));
		String actuallaunguageName =driver.findElement(By.xpath("//*[@id='j_idt87:lang_items']//li["+i+"]")).getText();	
	if(actuallaunguageName.equalsIgnoreCase(ExceptedlaunguageName))
	{
		driver.findElement(By.xpath("//*[@id='j_idt87:lang_items']//li["+i+"]")).click();
		break;
	
	}
	}
	}


	public static void main(String[] args) {
		ListConceptPractice lc = new ListConceptPractice();
		lc.listConceptForCountrys("USA");
		//lc.citySeection("San Francisco");
		lc.course("Playwright");
		lc.launguage("Tami");

	}

}
