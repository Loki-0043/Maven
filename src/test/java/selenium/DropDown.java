package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
WebDriver driver;
public void multiSelect() throws InterruptedException {
     driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	Select products = new Select(driver.findElement(By.xpath("//*[@class='col-lg-3'and @id='second']")));
	if (products.isMultiple()) {
		Thread.sleep(200);
		products.selectByValue("burger");
		Thread.sleep(200);
		products.selectByIndex(1);
		Thread.sleep(200);
		products.selectByVisibleText("Bonda");
		Thread.sleep(200);
		products.deselectByVisibleText("Donut");
		Thread.sleep(200);
	    products.deselectAll();
	}
}
public void dropdown() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.linkText("Create new account")).click();
	Select DayDropDown =new Select(driver.findElement(By.xpath("//*[@id='day']")));
	DayDropDown.selectByValue("17");
	Select monthDropDown = new Select(driver.findElement(By.xpath("//*[@id='month']")));
	monthDropDown.selectByValue("10");
	Select YearDropDown = new Select(driver.findElement(By.xpath("//*[@id='year']")));
	YearDropDown.selectByValue("1999");
}

public void radiobutton(String expectedgenderName)
{
	// implicity wait
	EdgeOptions options = new EdgeOptions();
	//options.addArguments("start-maximized");
	//options.addArguments("--disable-Notifications");

	driver = new EdgeDriver(options);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	// implicity wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
	List<WebElement> eachGender = driver.findElements(By.xpath("//*[contains(@class,'_5k_2')]"));

	for(int i=1;i<=eachGender.size();i++)
	{
		String genderName = driver.findElement(By.xpath("//*[contains(@class,'_5k_2')]["+i+"]//label")).getText();
		if(expectedgenderName.equalsIgnoreCase(genderName))
		{
			driver.findElement(By.xpath("//*[contains(@class,'_5k_2')]["+i+"]//input")).click();
			break;
		}
	}
	driver.findElement(By.className("//*[@class='_17ie _5dbb']")).click();
	System.out.println("print the value");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	Select radiobutton = new Select (driver.findElement(By.className("//*[@name='preferred_pronoun']")));
	radiobutton.selectByValue("3");
	
}
	
	
	
	public static void main(String[] args) throws InterruptedException {
	
		DropDown dd =new DropDown();
		//dd.multiSelect();
		dd.dropdown();
		//dd.radiobutton("Custom");
		
	}

}
