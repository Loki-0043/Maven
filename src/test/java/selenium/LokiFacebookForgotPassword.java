package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class LokiFacebookForgotPassword{
public void lunchBrowser() {
	WebDriver browser = new ChromeDriver();
	
    browser.get("https://www.facebook.com/");
	browser.manage().window().maximize();
	//browser.findElement(By.name("email")).sendKeys("7010797976");
	//browser.findElement(By.id("pass")).sendKeys("lokeshthala");
   // browser.findElement(By.xpath("//input[@data-testid=\'royal_email']").click();
}
public void forgotPassword() {
	WebDriver browser =new ChromeDriver();
	browser.get("https://www.facebook.com/");
	browser.manage().window().maximize();
	browser.findElement(By.linkText("Forgotten password?")).click();	
}
	public static void main(String[] args) {
		LokiFacebookForgotPassword FP =new LokiFacebookForgotPassword();
        FP.lunchBrowser();
        FP.forgotPassword();
	}

}
