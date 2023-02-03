package heairachialInheritance;

import org.junit.Test;

public class TestCases_M1 extends ReusableComponents
{
	//********************** Test Cases ************************
	@Test
	public  void composeAndSendAnEmail() //method | function
	{
		//Browser should be opened , gmail.com should be called , user should be logged in
		 // compose mail , send the mail , logout , close
		System.out.println("Test Case : Compose And Send An Email ");
		//launch , login , compose , send , logout , close 
		launchApplication(); //Test Steps - 1
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void replyToAnEmail()
	{
		System.out.println("Test Case : Reply To An Email ");
		launchApplication(); //Test Steps - 1
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}

}
