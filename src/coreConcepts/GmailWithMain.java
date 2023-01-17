package coreConcepts;

public class GmailWithMain 
{
	//JRE Code Execution flow : When we click on Run button in eclipse it will always search for 
	  // a function called main method .
	// psvm - public static void main
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Selenium Java Automation");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
	}
	
	public static void composeAndSendAnEmail() //method | function
	{
		//Browser should be opened , gmail.com should be called , user should be logged in
		 // compose mail , send the mail , logout , close
		System.out.println("Test Case : Compose And Send An Email ");
	}
	
	public static void replyToAnEmail()
	{
		System.out.println("Test Case : Reply To An Email ");
	}
	public static void forwardAnEmail()
	{
		System.out.println("Test Case : Forward An Email ");
	}
	public static void deleteAnEmail()
	{
		System.out.println("Test Case : Delete An Email ");
	}
	

}
