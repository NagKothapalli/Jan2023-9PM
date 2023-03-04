package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtilities
{
	WebDriver driver;//null
	Actions actions;
	WebDriverWait wait;
	public DriverUtilities(WebDriver driver)//1234 //local
	{
		System.out.println("Constructor of DriverUtilities");
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		//driver = new ChromeDriver(); //It will open an empty browser//4567
		actions = new Actions(driver);
		driver.manage().window().maximize();
		this.driver = driver; //1234
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	}
	//Synchronization : Fixed Wait , Implicit Wait , Explicit Wait
	//****************Utilitiy functions **************
	public void clickElement(String myxpath)
	{
		//driver.findElement(By.xpath(myxpath)).click();
		//Explicit Wait
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(myxpath)))).click();
	}
	public void enterText(String myxpath,String text)
	{
		//driver.findElement(By.xpath(myxpath)).sendKeys(text);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(myxpath)))).sendKeys(text);
	}	
	public void clickEnter()
	{		
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
	}
	public void fixedWait(int timeInSeconds)
	{
		actions.pause(Duration.ofSeconds(timeInSeconds)).build().perform();
	}
	

}
