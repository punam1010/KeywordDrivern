package KeyDrivern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
	public static WebDriver driver;
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:/JARs/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public static void navigate() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/");
		
	}
	public static void inputUsername() {
		driver.findElement(By.id("identifierId")).sendKeys("punammatade10@gmail.com");
		
	}
	public static void clickNext() {
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	}
	public static void inputPassword() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("punammatade10@gmail.com");
		
	}
	public static void clickSignIn() {
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
}
