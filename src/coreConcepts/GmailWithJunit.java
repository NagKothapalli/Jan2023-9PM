package coreConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	@Test
	public  void composeAndSendAnEmail() //method | function
	{
		//Browser should be opened , gmail.com should be called , user should be logged in
		 // compose mail , send the mail , logout , close
		System.out.println("Test Case : Compose And Send An Email ");
	}
	@Test
	public  void replyToAnEmail()
	{
		System.out.println("Test Case : Reply To An Email ");
	}
	@Test
	public  void forwardAnEmail()
	{
		System.out.println("Test Case : Forward An Email ");
	}
	@Test
	public  void deleteAnEmail()
	{
		System.out.println("Test Case : Delete An Email ");
	}

}
