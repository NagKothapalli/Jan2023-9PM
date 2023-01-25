package coreConcepts;

import org.junit.Test;

public class StringOperations
{
	
	String a = "     Selenium With Java            ";
	String c = "   Selenium With JAVA                 ";
	String b="JAVA";
	//Run Time Exceptions | UnChecked Exceptions
	
	//java.lang.StringIndexOutOfBoundsException: String index out of range: 18
	//java.lang.NullPointerException
	//java.lang.ArithmeticException: / by zero
	
	//Compile Time Exceptions | Checked Exceptions
	@Test
	public void dividedByZeroException()
	{
		int a = 25;
		
		int e = 0/a; // zero by anything is zero
		System.out.println(e);
		
		int d = a/0; // anything by zero not possible 	
		System.out.println(e);
	}
	@Test
	public void basicOperations()
	{
		int len = a.length();
		System.out.println("Lenght of the string :"+len);
		String aT = a.trim();
		System.out.println("String after trim :" + aT);
		len = aT.length();
		System.out.println("Lenght of the string after trim :"+len);
		String aU = a.trim().toUpperCase();
		System.out.println("String after uppercase :" + aU);
		String aL = a.trim().toLowerCase();
		System.out.println("String after lowercase :" + aL);
	}
	@Test
	public void subStringOperation()
	{
		String a7 = a.trim().substring(9);
		System.out.println("substring  from 7th:"+a7);
		String a07 = a.trim().substring(0, 8);
		System.out.println("substring from 0-7 :" + a07);
	}
	@Test
	public void stringContainsOperation()
	{
		//if(a.trim().toUpperCase().contains(b.trim().toUpperCase()))
		if(a.trim().toLowerCase().contains(b.trim().toLowerCase()))
		{
			System.out.println("String a contains b");
		}
		else {
			System.out.println("String b is not there in a");
		}
	}
	
	//Equals : Both the objects must be of type string 
			 // They must be same in length
			 // They must be same in case
	         // They must be same in character sequence [ spelling]
	@Test
	public void stringEqualsOperation()
	{
		System.out.println("First String  :" + a);
		System.out.println("Second String :" + c);
		//if(a.equals(c))
		//if(a.trim().equals(c.trim()))
		//if(a.trim().toUpperCase().equals(c.trim().toUpperCase()))
		//if(a.trim().toLowerCase().equals(c.trim().toLowerCase()))
		if(a.trim().equalsIgnoreCase(c.trim()))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}
	}
	
	//charAt ,  split
	// 012 
	//"Selenium With Java";
	@Test
	public void characterAtOperation()
	{
		char mychar = a.trim().charAt(2);
		System.out.println("character at 2nd index :" + mychar);
		for(int i=0;i<a.length();i++)
		{
			mychar = a.charAt(i); //i = 0 1 2 3 4 5 6.......
			System.out.println(mychar);
		}
	}
	@Test   //find student
	public void findParticularChar() //e x
	{
		boolean flag = false;
		for(int i=0;i<a.trim().length();i++)
		{
			char mychar = a.trim().charAt(i);
			System.out.println(mychar);
			if(mychar == 'x')
			{
				//System.out.println("Found the Student");
				flag = true;
				break;
			}			
		}
		if(flag)
		{
			System.out.println("Found the Student");
		}
		else {
			System.out.println("Not Found the Student");
		}
	}
	@Test
	public void findCharacterCount() // a
	{
		String a = "     Selenium With Java   A a A AA a            ";
		int count = 0;
		for(int i=0;i<a.trim().length();i++) // i=0 1 2 3 4 5 6 7 8 9 10
		{
			char mychar = a.trim().charAt(i);
			System.out.println(mychar);
			// any one input is true final output will be true
			if(mychar == 'a' || mychar == 'A')
			{
				count++;  // count = count+1;				
			}		
		}
		System.out.println("Character Count :" + count);
	}
	String name;// null
	@Test
	public void demonstrateNullPointerException()
	{
		System.out.println(" Name value :" + name);
		if(name.equals("Ram"))
		{
			System.out.println("Student Name is Ram");
		}
	}
	@Test
	public void findDuplicateCharacters()
	{
		 //               
		String a = "     Selenium With Java            ";
		a = a.trim();
		
		for(int i=0;i<a.length();i++)//S
		{
			System.out.println("i th  character :" + a.charAt(i));
			int temp = 1;
			for(int j=i+1;j<a.length();j++)
			{
				//        S            e l e n i .......
				if(a.charAt(i) == a.charAt(j))
				{
					temp++;
				}				
			}
			System.out.println("Count of Char :" + a.charAt(i)  +  "  :  "  + temp);
		}
		
		
	}
	
	
	
	
	
	
}
