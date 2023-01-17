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
	
	
	
	
	
	
	
	
	
	
	

}