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
	@Test
	public  void forwardAnEmail()
	{
		System.out.println("Test Case : Forward An Email ");
		launchApplication(); //Test Steps - 1
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void deleteAnEmail()
	{
		System.out.println("Test Case : Delete An Email ");
		launchApplication(); //Test Steps - 1
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	//******************** Reusable Components *********************
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
	}
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Login To Application");
	}
	public void closeApplication()
	{
		System.out.println("RC : Login To Application");
	}
	
	public void compose()
	{
		System.out.println("RC : Compose Mail");
	}
	public void send()
	{
		System.out.println("RC : Send Mail");
	}
	public void open()
	{
		System.out.println("RC : Open Mail");
	}
	public void reply()
	{
		System.out.println("RC : Reply Mail");
	}
	public void forward()
	{
		System.out.println("RC : Forward Mail");
	}
	public void delete()
	{
		System.out.println("RC : Delete Mail");
	}
	
	
	
	
	
	
	
	
	
	
	

}
