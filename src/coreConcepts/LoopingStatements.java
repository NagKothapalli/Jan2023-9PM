package coreConcepts;

import org.junit.Test;

public class LoopingStatements
{
	//To perform particular task for n number of times we go for looping statement
	
	//Temple : i have to do 100 rounds around the temple
	
	//From where i have to start , how many rounds , count the rounds
	@Test
	public void doRoundsAroundTemple()
	{
		System.out.println("First Round");
		System.out.println("Second Round");
		System.out.println("Third Round");
		System.out.println("Fourth Round");
		System.out.println("Fifth Round");
		System.out.println("First Round");
		System.out.println("Second Round");
		System.out.println("Third Round");
		System.out.println("Fourth Round");
		System.out.println("Fifth Round");
		System.out.println("First Round");
		System.out.println("Second Round");
		System.out.println("Third Round");
		System.out.println("Fourth Round");
		System.out.println("Fifth Round");
		System.out.println("First Round");
		System.out.println("Second Round");
		System.out.println("Third Round");
		System.out.println("Fourth Round");
		System.out.println("Fifth Round");
	}
	//for(starting value ; how long ; step size){  Task - Do a round / Apply color  } 
	@Test
	public void doRoundsAroundTempleWithForLoop()
	{
		for(int iterator=1;iterator <= 10;iterator = iterator+1) //i=1 1<10->true , 2<10,....8<10 9<10  10<10->false 10<=10->true
		{//True - Task
			System.out.println("Do Round Around the Temple : "+iterator);
		}
		//false - it will come out of the for loop
		System.out.println("I came out of for loop");
	}
	@Test
	public void applyColorToSteps_Day1()
	{
		for(int i=1;i<=50;i=i+1)
		{
			System.out.println("Apply color to step Day One :" + i);
		}
	}
	@Test
	public void applyColorToSteps_Day2()
	{
		for(int i=51;i<=100;i=i+1)
		{
			System.out.println("Apply color to step Day Two :" + i);
		}
	}
	
	//WAP to generate even numbers
	@Test
	public void applyColorToSteps_B2_Day1()
	{
		for(int i=1;i<=50;i=i+2)  // i=1 3 5 7 9 11 13 ........
		{
			System.out.println("Apply RED color to step Day One :" + i);
		}
	}
	//WAP to generate odd numbers
	@Test
	public void applyColorToSteps_B2_Day2()
	{
		for(int i=2;i<=50;i=i+2)  // i=2 4 6 8 10 ........
		{
			System.out.println("Apply GREEN color to step Day One :" + i);
		}
	}
	//Git Create Git Repository , Publish the Repo , Commit , Push , Clone ,  Pull|Get Latest
	@Test
	public void findStudent() //rollNum = 25
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Searching student :" + i);
			if(i==25) //1==25->f  24==25->f 25==25->t
			{ //true
				System.out.println("Found the Student");
				break;
			}
		}
	}
	
	//WAP to apply color to 10 floors and different color in each floor , we have 20 steps in each floor
	@Test
	public void applyColorToBuilding()
	{
		for(int i=1;i<=10;i++)//Nested for loop   // Outer Loop
		{
			System.out.println("*********************Apply Color to Floor Number :" + i);
			for(int step=1;step<=20;step++) //Inner Loop
			{
				System.out.println("Apply Color to the Step :"+ step +"  in Floor Number :" + i);
			}
		}
	}
	
	//WAP to find given number is even or odd
	        //if we divide a number with 2 and the reminder is 0 then that is a even number
			// givenNumber / 2   -> Q   // givenNumber % 2  -> Reminder 
			// 5/2 -> Q-> 2  , R -> 1 
	@Test
	public void isItEven_Test()
	{
		isItEven(22);
		isItEven(25);
	}
	public void isItEven(int number)
	{
		System.out.println("Given Number :" + number);
		//int rem = number % 2;
		//if(rem == 0)
		if((number % 2) == 0)	
		{//true
			//System.out.println("Given Number :" + number);
			System.out.println("The Given Number is EVEN");
			//System.out.println("YES");
		}
		else
		{//false
			//System.out.println("Given Number :" + number);
			System.out.println("The Given Number is ODD");
			//System.out.println("NO");
		}
 	}
	
	@Test
	public void isItOdd_Test()
	{
		isItOdd(22);
		isItOdd(25);
	}
	public void isItOdd(int number)
	{
		System.out.println("Given Number :" + number);
		int rem = number % 2;
		if(!(rem == 0))
		{//true
			//System.out.println("Given Number :" + number);
			System.out.println("The Given Number is ODD");
			//System.out.println("YES");
		}
		else
		{//false
			//System.out.println("Given Number :" + number);
			System.out.println("The Given Number is EVEN");
			//System.out.println("NO");
		}
 	}
	//WAP to generate all even numbers in the range of  1 -  100
	@Test
	public void generateEvenNumbers()
	{
		for(int i=1;i<=100;i++)
		{
			//System.out.println("Given Number :" + i);
			if((i % 2) == 0)
			{
				System.out.println("Given Number :" + i + " and it is Even Number :");
			}
			else
			{
				System.out.println("Given Number :" + i + " and it is not Even Number :");
			}
		}
	}
	@Test
	public void generateEvenNumberSeries()
	{
		for(int i=1;i<=100;i++)
		{
			//System.out.println("Given Number :" + i);
			if((i % 2) == 0)
			{
				//System.out.println( i );
				System.out.print( i + " , " );
			}
			
		}
	}
	@Test
	public void sumOfNumbers()
	{
		int sum = 0; //1 3 6 10 15 21 28 36 45 55
		for(int i=1;i<=100;i++)
		{
			sum = sum + i; // 0+1+2+3+4+5+6+7+8+9+10
		}
		System.out.println("Sum of first 100 numbers :" + sum);
	}
	
	@Test
	public void productOfNumbers()
	{
		long prod = 1; //1 2 6 24 ...............
		for(int i=1;i<=20;i++)
		{
			prod = prod * i; // 1x1x2x3x4x5
		}
		System.out.println("Product of first 100 numbers :" + prod);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
