package project.maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class CreatNewAccount {
	public void create() 
	{
		WebDriver user = new ChromeDriver();
		user.get("https://www.facebook.com/");
		user.manage().window().maximize();
		user.findElement(By.linkText("Create new account")).click();
		user.findElement(By.name("firstname")).click();
		user.findElement(By.name("firstname")).sendKeys("lokesh");
		user.findElement(By.id("u_2_d_tw")).sendKeys("loki");
		user.findElement(By.name("reg_email__")).sendKeys("lokibismibis@gmail.com");
		user.findElement(By.name("reg_email_confirmation__")).sendKeys("lokibismibis@gmail.com");
		user.findElement(By.id("password_step_input")).sendKeys("701079");
		
		}
	
	public static void main(String[] args)
	{
		CreatNewAccount CA = new CreatNewAccount();
		CA.create();
	}
}


