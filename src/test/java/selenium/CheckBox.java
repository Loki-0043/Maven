package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
	WebDriver driver ;
	public void Checking() throws InterruptedException {
	//	EdgeOptions options = new EdgeOptions();
		
		driver= new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='j_idt87:j_idt91']//*[contains(@class,'ui-chkbox-box')]")).click();
		String className =driver.findElement(By.xpath("//*[@id='j_idt87:j_idt91']//*[contains(@class,'ui-chkbox-box')]")).getAttribute("class");
	
		if(className.contains("active")) {
		System.out.println("pass");
	}
	driver.findElement(By.id("j_idt87:j_idt100")).click();
	String checkbox= driver.findElement(By.id("j_idt87:j_idt100")).getAttribute("class");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='ui-growl-title']")));
	String ToastedMessage =driver.findElement(By.xpath("//*[@class='ui-growl-title']")).getText();
	if(checkbox.contains("Checking")) 
	{
	System.out.println("pass");
	}
	}
	public void launguage(String[] expectedText){

		for(String eachvalue:expectedText)
		{
			List<WebElement> eachElement = driver.findElements(By.xpath("//*[@id='j_idt87:basic']//tr//td"));
			for(int i=1;i<=eachElement.size();i++)
			{
				String actualText = driver.findElement(By.xpath("//*[@id='j_idt87:basic']//tr//td["+i+"]//label")).getText();
				if(eachvalue.equalsIgnoreCase(actualText))
				{
					driver.findElement(By.xpath("//*[@id='j_idt87:basic']//tr//td["+i+"]//div[contains(@class,'ui-chkbox-box')]")).click();
					break;
				}
			}
		}}
		
	public static void main(String[] args) throws InterruptedException {
		CheckBox cb = new CheckBox();
		cb.Checking();
		String lau[]= {"Python","C-Sharp"};
		cb. launguage(lau);
		

	}

}
