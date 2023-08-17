package project.maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class FaceBook {
	WebDriver driver;
	public void fb(String expectedValue) throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("loki");
		driver.findElement(By.name("lastname")).sendKeys("bismi");
		driver.findElement(By.name("reg_email__")).sendKeys("lokibismibis@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("1234567");
		Select DaydropDown = new Select(driver.findElement(By.name("birthday_day")));
		DaydropDown.selectByValue("11");
		Select MonthDropDown = new Select (driver.findElement(By.id("month")));
		MonthDropDown.selectByIndex(5);
		Select yearDropDown = new Select (driver.findElement(By.id("year")));
		yearDropDown.selectByValue("1999");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		List<WebElement> eachgender = driver.findElements(By.xpath("//*[contains(@class,'_5k_2')]"));
		System.out.println(eachgender);
		for(int i=1;i<eachgender.size();i++) 
		{
			String genderName = driver.findElement(By.xpath("//*[contains(@class,'_5k_2')]["+i+"]//label")).getText();
			System.out.println("pass");
		if(expectedValue.equalsIgnoreCase(genderName)) {
			driver.findElement(By.xpath("//*[contains(@class,'_5k_2')]["+i+"]//input")).click();
			break;
		}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		 FaceBook ob = new FaceBook();
         ob.fb("Female");
	}

}
