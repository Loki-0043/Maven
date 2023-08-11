package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
public class MouseActionPractice {
	WebDriver browser;
	public void mouseImplementation() {
		EdgeOptions option = new EdgeOptions();
		browser= new EdgeDriver(option);
		browser.get("https://www.ebay.com/");
		browser.manage().window().maximize();
		Actions mouse = new Actions(browser);
		mouse.moveToElement(browser.findElement(By.xpath("//*[@class='hl-cat-nav__js-tab']//*[text()='Electronics']"))).perform();
		//mouse.moveToElement(browser.findElement(By.xpath("")))
		
	}

	public static void main(String[] args) {
		

	}

}
