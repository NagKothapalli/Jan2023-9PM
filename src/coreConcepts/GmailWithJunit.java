package coreConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	//************** Test Suites ************************
	//BVT : Build Validation Test [ SMOKE ]
	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		replyToAnEmail();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
	}
	
	//********************** Test Cases ************************
	@Test
	public  void composeAndSendAnEmail() //method | function
	{
		//Browser should be opened , gmail.com should be called , user should be logged in
		 // compose mail , send the mail , logout , close
		System.out.println("Test Case : Compose And Send An Email ");
		//launch , login , compose , send , logout , close 
		launchApplication();
	}
	@Test
	public  void replyToAnEmail()
	{
		System.out.println("Test Case : Reply To An Email ");
		launchApplication();
	}
	@Test
	public  void forwardAnEmail()
	{
		System.out.println("Test Case : Forward An Email ");
		launchApplication();
	}
	@Test
	public  void deleteAnEmail()
	{
		System.out.println("Test Case : Delete An Email ");
		launchApplication();
	}
	//******************** Reusable Components *********************
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
	}

}
