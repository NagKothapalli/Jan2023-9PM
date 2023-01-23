package coreConcepts;

import org.junit.Test;

public class StringOperations
{
	
	String a = "     Selenium With Java               ";
	String c = "   Selenium With JAVA                 ";
	String b="JAVA";
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
	
	
	
	
	
	
	
	
	
	
	
	
}
