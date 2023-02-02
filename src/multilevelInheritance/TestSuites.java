package multilevelInheritance;

import org.junit.Test;
//          child                 parent           grand parent
//           A                   B                    C    - > A extends C also indirectly
//             child             parent|base
public class TestSuites extends TestCases // Simple Inheritance
{
	/*
	 * public void launchApplication() {
	 * System.out.println("RC : Launch Application from Test Suites"); }
	 */
	//************** Test Suites ************************
	//BVT : Build Validation Test [ SMOKE ]
	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		//launchApplication();
		//hello();
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
