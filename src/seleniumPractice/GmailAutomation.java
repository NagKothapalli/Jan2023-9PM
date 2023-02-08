package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation 
{
	//org.openqa.selenium.SessionNotCreatedException : Find the reason below	
		//Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 110
	    //Current browser version is 90.0.4430.212 with binary path C:\Program Files (x86)\Google\Chrome\Application\chrome.exe 
	String expectedTitle = "Amail";
	@Test
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Appliction");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //5 mnts pls 
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

}
