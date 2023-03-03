package seleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation
{
	//private static final String ArrayList = null;
	WebDriver driver;//null
	Actions actions;
	public ApsrtcAutomation()
	{
		System.out.println("Constructor of GmailAutomation");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
		actions = new Actions(driver);
		driver.manage().window().maximize();
	}
	//page object xpaths
	    String homeXpath = "//a[@title='Home']";
		String fromPlaceXpath = "//input[@id='fromPlaceName']";
		String toPlaceXpath = "//input[@id='toPlaceName']";
		String openCalendarXpath = "//input[@name='txtJourneyDate']";
		String searchButtonXpath = "//input[@id='searchBtn']";
		String timeTableXpath = "//a[@title='TimeTable / Track']";
		String allServicesXpath = "//a[text()='All services Time Table & Tracking']";
	@Before
	public void launchApplication()
	{
		System.out.println("Launch Application");
		driver.get("https://www.apsrtconline.in/");
	}
	@Test
	public void bookBusTicketold()
	{
		System.out.println("Test Case : Book Bus Ticket");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("HYDERABAD");
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//open calendar , select date
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		//driver.findElement(By.xpath("//a[text()='20']")).click();
		selectJourneyDate("22");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	}
	@Test
	public void bookBusTicket()
	{
		System.out.println("Test Case : Book Bus Ticket");
		enterText(fromPlaceXpath,"HYDERABAD");
		clickEnter();
		enterText(toPlaceXpath,"GUNTUR");
		clickEnter();
		clickElement(openCalendarXpath);
		selectJourneyDate("22");
		clickElement(searchButtonXpath);
	}	
	
	public void selectJourneyDate(String JDate)
	{
		driver.findElement(By.xpath("//a[text()='"+JDate+"']")).click();
		//       "//a[text()='"+JDate+"']"   - "//a[text()='22']"
	}
	
	@Test
	public void keyBordOperations()
	{
		WebElement fromPlace = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		Actions actions = new Actions(driver);
		//actions.moveToElement(fromPlace).click().build().perform();
		//actions.moveToElement(fromPlace).click().sendKeys("HYDERABAD").build().perform();
		//actions.moveToElement(fromPlace).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		actions.moveToElement(fromPlace).click().sendKeys("HYDERABAD").doubleClick().contextClick().build().perform();
	}
	
	@Test
	public void multipleWindows()
	{
		clickElement("//a[@title='TimeTable / Track']");
		clickElement("//a[text()='All services Time Table & Tracking']");
	}
	@Test
	public void multipleWindows_2()
	{
		clickElement(timeTableXpath);
		clickElement(allServicesXpath);
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> windows = new ArrayList<String>(allwindows);
		for(int i=0;i<windows.size();i++)
		{
			System.out.println("Session IDs :" + windows.get(i));// i=0 1
		}
		System.out.println("Ttile of first window :" + driver.getTitle());
		driver.switchTo().window(windows.get(1));
		fixedWait(4);
		System.out.println("Ttile of second window :" + driver.getTitle());
		driver.close();
		//driver.quit();
		driver.switchTo().window(windows.get(0));
		fixedWait(4);
		clickElement(homeXpath);
		driver.quit();
	}
	
	//****************Utilitiy functions **************
	public void clickElement(String myxpath)
	{
		driver.findElement(By.xpath(myxpath)).click();
	}
	public void enterText(String myxpath,String text)
	{
		driver.findElement(By.xpath(myxpath)).sendKeys(text);
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


/*
 * class Actions { public Actions(WebDriver driver) {
 * 
 * } }
 */










