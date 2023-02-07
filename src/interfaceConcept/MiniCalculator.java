package interfaceConcept;

//class A extends class B -> A is child and B is parent so A can enjoy the methods of B
//class A implements interface B -> 
public class MiniCalculator implements ArithmeticOperations
{
	// concrete method : A method with body
	//class contains concrete methods
	public void welcomeToMiniCalc()  // concrete method : A method with body
	{ //body
		System.out.println("Welcome to Casio Mini Calculator");
	} // we have 100s functions
	
	public int addition(int a,int b)
	{
		int sum = a+b;
		return sum;
	}

	@Override
	public int subtraction(int a, int b) {
		int diff = a-b;
		return diff;
	}

	@Override
	public int multiplication(int a, int b) {
		int prod = a*b;
		return prod;
	}

	@Override
	public int division(int a, int b) {
		int div = a/b;
		return div;
	}
	
}
