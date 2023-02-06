package inheritanceByObject;

import org.junit.Test;
//             child             parent|base
public class TestSuites //extends TestCases // Simple Inheritance
{
	//Modifier ClassName   objName = new Constructor();
	//public TestCases testCases = new TestCases();
	public TestCases testCases = new TestCases("Edge");
	//************** Test Suites ************************
	//BVT : Build Validation Test [ SMOKE ]
	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		testCases.composeAndSendAnEmail();
		testCases.replyToAnEmail();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		testCases.composeAndSendAnEmail();
		testCases.replyToAnEmail();
		testCases.forwardAnEmail();
		testCases.deleteAnEmail();
	}
	

}
