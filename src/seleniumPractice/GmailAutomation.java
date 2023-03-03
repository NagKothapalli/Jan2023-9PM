package seleniumPractice;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation 
{
	//org.openqa.selenium.SessionNotCreatedException : Find the reason below	
		//Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 110
	    //Current browser version is 90.0.4430.212 with binary path C:\Program Files (x86)\Google\Chrome\Application\chrome.exe 
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"*[name='identifier']"}
	//org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
	//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	WebDriver driver;//null
	public GmailAutomation()
	{
		System.out.println("Constructor of GmailAutomation");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
	}
	String expectedTitle = "Amail";
	//WebDriver : get() , getTitle() , getWindowHandle(), getCurrentUrl(), findElement , findElements
	//WebElement : click() , clear() , sendKeys() 
	//By : id() , name , className , cssSlector , linkText , partialLinkText , tagName , xpath
	
	
	@Before
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Appliction");
		 //5 mnts pls 
		//Inside the constructor of ChromeDriver class they have written a code to open an empty 
		 // google chrome browser
		driver.get("https://gmail.com");
		String actualtitle = driver.getTitle();
		System.out.println("Title of the window :" + actualtitle);
		String sessionID = driver.getWindowHandle();
		System.out.println("Session ID of the window:" + sessionID);
		String cUrl = driver.getCurrentUrl();
		System.out.println("Current URL  :" + cUrl);
		//Assert.assertEquals(expectedTitle, actualtitle);
		if(expectedTitle.equals(actualtitle)) //validation | Assertion
		{
			System.out.println("Title Validation passed");
		}
		else {
			System.out.println("Title Vlidation Failed");
		}
		System.out.println("Code after if condition");
		
	}
	//TestMethod Execution -> Constructor -> Before   ->  TestMethod
	@Test
	public void loginToApplication() throws InterruptedException
	{
		System.out.println("Test Case : Login to Application");
		driver.findElement(By.name("identifier")).sendKeys("nag022");
		WebElement emailObj = driver.findElement(By.name("identifier"));
		emailObj.click();
		emailObj.clear();
		emailObj.sendKeys("nag022@gmail.com");
		emailObj.clear();
		emailObj.sendKeys("9959775757");
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		WebElement element = elements.get(1); // 0 1 2 3
		element.click();
		Thread.sleep(6000);
		driver.findElement(By.name("Passwd")).sendKeys("kothapalli@1234");
		//element.click();
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(1).click();
		//driver.findElement(By.className("VfPpkd-Jh9lGc")).click();
		//driver.findElement(By.linkText("Try again")).click();
	}
	//full xpath / absolute / fixed xpath / static xpath
	//relative xpath : 
	
	// tagName[@attribute='value']
	// tagName[@attribute1='value' and @attribute2='value']
		// boy[@fname='Ram' and @fname='K']
	// tagName[text()='value']
	// tagName[@attribute1='value' and text()='value']
	// select empName from EmployeeTable where empID=2343;

	// tagName[@attribute1='value' or @attribute2='value']
		// button[@color='red' or @color='green']

	// *[@attribute='value']
	// *[@attribute1='value' and @attribute2='value']
	// *[text()='value']
	// *[@attribute1='value' and text()='value']
	// *[@attribute1='value' or @attribute2='value']

	// tagName[contains(@attribute,'value')]
	// tagName[contains(@attribute1,'value') and contains(@attribute2,'value')]
	// tagName[contains(text(),'value')]
	// tagName[contains(@attribute1,'value') and contains(text(),'value')]
	// tagName[contains(@attribute1,'value') or contains(@attribute2,'value')]

	//*[contains(@attribute,'value')]
	//*[contains(@attribute1,'value') and contains(@attribute2,'value')]
	//*[contains(text(),'value')]	
	//*[contains(@attribute1,'value') and contains(text(),'value')]
	//*[contains(@attribute1,'value')  or  contains(@attribute2,'value')]
	
	//parent child
	@Test
	public void forgotEmail()
	{
		//driver.findElement(By.tagName("button")).click();
		//driver.findElements(By.tagName("button")).get(0).click();		
		///html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button
	    //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
		//driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
		//driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
		driver.findElement(By.xpath("//button[text()='Forgot email?' and @jsname='Cuz2Ue']")).click();
	}
	
	@Test
	public void learnMore()
	{
		//driver.findElement(By.tagName("a")).click();
		//driver.findElements(By.tagName("a")).get(0).click();
		//driver.findElement(By.linkText("Learn more")).click();
		//driver.findElement(By.partialLinkText("Learn")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/span/div/div/a")).click();
	}
	
	@Test
	public void createAccount()
	{
		//driver.findElement(By.tagName("button")).click();
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
	}
	
	@Test
	public void help()
	{
		driver.findElement(By.linkText("Help")).click();
	}
	
	
	
	
	
	
	
	
	
	
}
