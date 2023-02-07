package interfaceConcept;

public interface ArithmeticOperations
{
	//Interface contains abstract methods
	//abstract method : A method without body
	//An interface has to be implemented by a class 
	// Meaning a class has to inherit the interface then class has to implement all the inherited abstract 
	   //methods of the interface
	public int addition(int a,int b); //abstract method : A method without body
	public int subtraction(int a,int b);
	public int multiplication(int a,int b);
	public int division(int a,int b);

}
