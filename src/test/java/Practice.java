import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {
public void launch() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Forgotten password?")).click();
	driver.close();
}
public void browser() {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.co.in/");
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Forgotten password?")).click();
}
	public static void main(String[] args) {
		Practice obj = new Practice();
		obj.launch();
		obj.browser();

}
}
 