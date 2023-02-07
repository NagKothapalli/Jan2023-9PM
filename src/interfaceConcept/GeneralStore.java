package interfaceConcept;

import org.junit.Test;

public class GeneralStore
{
	@Test
	public void customerBill()
	{
		int p1= 122324334;
		int p2 = 153232323;
		MiniCalculator mCalc = new MiniCalculator();
		ArithmeticOperations calc = new MiniCalculator();
		//WebDriver driver = new WebDriver();  x
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//this mCalc object will be loaded with all 100s of functions from the class and interface
		mCalc.welcomeToMiniCalc();
		int bill = mCalc.addition(p1, p2);
		//printer
		System.out.println("Customer Bill :" + bill);
		bill = calc.addition(p1, p2);
		System.out.println("Customer Bill 2 :" + bill);
	}

}
