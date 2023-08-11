package selenium;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassThreeXpath {
	public void browser() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.name("email")).sendKeys("7010797976");
		driver.findElement(By.id("pass")).sendKeys("lokeshthala");
		driver.findElement(By.name("login")).click();*/
		               //thread concept
		/*driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("benny");
		driver.findElement(By.name("lastname")).sendKeys("mickel");
		driver.findElement(By.name("reg_email__")).sendKeys("lokibismibis");
		driver.findElement(By.id("password_step_input")).sendKeys("987654321");*/
	                	//implicitlyWait
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("loki");
		driver.findElement(By.name("lastname")).sendKeys("bobby");
		driver.findElement(By.name("reg_email__")).sendKeys("lokibismibis");
		driver.findElement(By.id("password_step_input")).sendKeys("987654321");*/
				               //ExplicityWait   -- types(webDriverWait,FluentWait)
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create new account")).click();
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("firstname")));	 
	driver.findElement(By.name("firstname")).sendKeys("loki");
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("lastname")));
	driver.findElement(By.name("lastname")).sendKeys("bobby");
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("reg_email__")));
	driver.findElement(By.name("reg_email__")).sendKeys("lokibismibis");
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("password_step_input")));
	driver.findElement(By.id("password_step_input")).sendKeys("987654321");
	
	}
public static void main(String[] args) throws InterruptedException {
	ClassThreeXpath xp =new ClassThreeXpath();
	xp.browser();
}
}
