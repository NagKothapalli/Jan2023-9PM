package inheritanceByExtends;

import org.junit.Test;
//             child             parent
public class TestSuites extends TestCases // Simple Inheritance
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
	

}
