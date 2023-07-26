package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
public class DayOne {
public void launch() {
	WebDriver Browser = new ChromeDriver();
	Browser.get("https://www.facebook.com/");
	Browser.manage().window().maximize();
	//Browser.manage().window().minimize();
	//Browser.quit();
	//Browser.navigate()
	//Browser.nagavit().("https://www.zomato.com/chennai");
	Browser.navigate().refresh();
	//Browser.findElement(By.className("inputtext")).sendKeys("Benny ");
}
	public static void main(String[] args) {
		
		DayOne s = new DayOne();
		s.launch();
	}

}
