package inheritanceByExtends;

import org.junit.Test;

public class TestCases
{
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
