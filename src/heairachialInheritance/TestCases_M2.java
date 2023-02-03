package heairachialInheritance;

import org.junit.Test;

public class TestCases_M2 extends ReusableComponents// , Rc2
{
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

}
