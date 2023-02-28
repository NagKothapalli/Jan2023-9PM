package seleniumPractice;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation
{
	WebDriver driver;//null
	public ApsrtcAutomation()
	{
		System.out.println("Constructor of GmailAutomation");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
	}
	@Before
	public void launchApplication()
	{
		System.out.println("Launch Application");
		driver.get("https://www.apsrtconline.in/");
	}
	@Test
	public void bookBusTicket()
	{
		System.out.println("Test Case : Book Bus Ticket");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("HYDERABAD");
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}	
	
	
	

}


/*
 * class Actions { public Actions(WebDriver driver) {
 * 
 * } }
 */










