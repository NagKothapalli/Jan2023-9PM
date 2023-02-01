package coreConcepts;

import org.junit.Test;

public class ArraysConcept
{
	//Array : Group of memory locations with similar data type .
	int stdNum1 = 22;
	
	//Fixed array - to store known info we go for Fixed array
	  //Modifier[opt]   DataType  name = value;
	//java.lang.ArrayIndexOutOfBoundsException
	  //Modifier[opt]   DataType[]  name = { values };
	  public   String[]   stdNames = {"Ram","Ravi","Ramesh","Rajesh"};
	  public int[] stdNumbers = {22,45,3,56,43,334,876};
	@Test
	public void integer_fixedArray()
	{
		 int[] stdNumbers = {22,45,3,56,43,334,876};
		int val1 = stdNumbers[0];
		 for(int i=0;i<stdNumbers.length;i++)
		 {
			 val1 = stdNumbers[i];
			 System.out.println(val1);
		 }
	}
	
	@Test
	public void string_fixedArray()
	{
		// int[] stdNumbers = {22,45,3,56,43,334,876};
		 String[] stdNumbers = {"Ram","Ravi","Raj","Ramu","Raheem"};
		 for(int i=0;i<stdNumbers.length;i++)
		 {
			String val1 = stdNumbers[i];
			 System.out.println(val1);
		 }
	}
	@Test
	public void findStudent()
	{
		 int[] stdNumbers = {22,45,3,56,43,334,876};
		int val1 = stdNumbers[0];
		 for(int i=0;i<stdNumbers.length;i++)
		 {
			 val1 = stdNumbers[i];
			 System.out.println(val1);
			 if(val1 == 43)
			 {
				 System.out.println("Found Student");
				 break;
			 }
		 }
	}
	
    // I have to store total marks of all students in a class
	
	//Modifier[opt]   DataType[]   name = new DataType[length];
	@Test
	public void integer_DynamicArray()
	{
		// int[] stdNumbers = {22,45,3,56,43,334,876}; //fixed array
		 int[]  stdMarks = new int[60];
		 int val1 = stdMarks[0];
		 for(int i=0;i<stdMarks.length;i++)
		 {
			 val1 = stdMarks[i];
			 System.out.println(val1);
		 }
		 
		 for(int i=0;i<stdMarks.length;i++)
		 {
			 stdMarks[i] = 22+i;
			 int val2 = stdMarks[i];
			 System.out.println(val2);
		 }
		 
	}	
	@Test
	public void string_DynamicArray()
	{
		// int[] stdNumbers = {22,45,3,56,43,334,876}; //fixed array
		 String[]  stdNames = new String[60];
		 String val1 = stdNames[0];
		 for(int i=0;i<stdNames.length;i++)
		 {
			 val1 = stdNames[i];
			 System.out.println(val1);
		 }
		 
		 for(int i=0;i<stdNames.length;i++)
		 {
			 stdNames[i] = "Selenium-"+i;
			 String val2 = stdNames[i];
			 System.out.println(val2);
		 }
		 
	}
	
	
	
	
	
	
	
	
	
	
}
