package coreConcepts;

import org.junit.Test;

public class ConditionalStatements {
	// if condition
	// if(expression -> boolean : true | false){ task-amount transfer }

	int a = 28;
	int b = 24;

	@Test
	public void compareNumbers_if() {
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if (a == b) {
			System.out.println("Both A and B are same");
		}
	}

	@Test
	public void compareNumbers_ifnotequal() {
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if (!(a == b)) {
			System.out.println("Both A and B are not same");
		}
	}

	@Test
	public void compareNumbers_ifelse() {
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if (a == b) {
			System.out.println("Both A and B are same");
		} else {
			System.out.println("Both A and B are not same");
		}
	}

	@Test
	public void compareNumbers_ifelse_test() {
		compareNumbers_ifelse(22, 22);
		compareNumbers_ifelse(42, 22);
	}

	// @Test
	public void compareNumbers_ifelse(int x, int y) // Dev code
	{
		System.out.println("A value :" + x);
		System.out.println("B value :" + y);
		if (x == y) {
			System.out.println("Both A and B are same");
		} else {
			System.out.println("Both A and B are not same");
		}
	}

	// Write a program to read two integers as input and perform addition if they
	// are equal , if not do subtraction
	@Test
	public void performArithemeticOperations_test() {
		performArithemeticOperations(40, 40);
		performArithemeticOperations(80, 40);
	}

	public void performArithemeticOperations(int a, int b) {
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if (a == b) // if(true)
		{// true
			int sum = a + b;
			System.out.println("Sum of two numbers :" + sum);
		} else // false
		{
			int diff = a - b;
			System.out.println("Difference of two numbers :" + diff);
		}
	}

	// Write a program to read two integers as input and perform addition if they
	// are equal , if a>b do subtraction , if a<b multiplication
	@Test
	public void demonstrateElseIfCondition_test() {
		demonstrateElseIfCondition(22, 22);
		demonstrateElseIfCondition(82, 22);
		demonstrateElseIfCondition(22, 42);
	}

	public void demonstrateElseIfCondition(int a, int b) {
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if (a == b) // if(true)
		{// true
			int sum = a + b;
			System.out.println("Sum of two numbers :" + sum);
		} else if (a > b) // false
		{
			int diff = a - b;
			System.out.println("Difference of two numbers :" + diff);
		} else if (a < b) {
			int prod = a * b;
			System.out.println("Product of two numbers :" + prod);
		}
	}

	// Write a program to read two integers as inputs and perform the below task if
	// and only if both inputs are above 10
	// Task : perform addition if they are equal , if a>b do subtraction , if a<b
	// multiplication
	@Test
	public void logicalOperators_test() {
		logicalOperators(4, 8);
		logicalOperators(44, 8);
		logicalOperators(4, 88);
		logicalOperators(-4, 88);
		logicalOperators(34, -78);
		logicalOperators(-34, -78);
		logicalOperators(10, 10);
		logicalOperators(34, 34);
		logicalOperators(354, 34);
		logicalOperators(34, 44); // (12/16) * 100 =75 %
	}

	public void logicalOperators(int a, int b) {
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		// T && T -> T
		if ((a > 10) && (b > 10)) // Outer condition // > , < , == : Relational , && - AND , || - OR: Logical
		{
			// Task
			if (a == b) // Nested if - inner condition //if(true) // == : Relational
			{// true
				int sum = a + b; // + , - , * , / : Arithemetic
				System.out.println("Sum of two numbers :" + sum);
			} else if (a > b) // false
			{
				int diff = a - b; // = : Assignment
				System.out.println("Difference of two numbers :" + diff);
			} else if (a < b) {
				int prod = a * b;
				System.out.println("Product of two numbers :" + prod);
			}
		} else {
			System.out.println("Both A and B or any one of them might be below 10");
		}
	}

	// WAP to prin the class of the student by reading the grade as input using else
	// if
	// A -> Distinction , B -> First Class , C -> Second , D->Third , E->Ordinary ,
	// F->Fail
	@Test
	public void printStudentGrade_elseif_test() {
		printStudentGrade_elseif('D'); // out of 30 lines this case will cover only 4 : 4/30 = 13.33333
		printStudentGrade_elseif('A');
		printStudentGrade_elseif('F');
		printStudentGrade_elseif('G');
		printStudentGrade_elseif('E');
		printStudentGrade_elseif('B');
		printStudentGrade_elseif('C');
	}

	public void printStudentGrade_elseif(char grade) {
		System.out.println("User Given Grade :" + grade);
		if (grade == 'A') {
			System.out.println("Student passed in Distintion");
		} else if (grade == 'B') {
			System.out.println("Student passed in First Class");
		} else if (grade == 'C') {
			System.out.println("Student passed in Second Class");
		} else if (grade == 'D') {
			System.out.println("Student passed in Third Class");
		} else if (grade == 'E') {
			System.out.println("Student passed in Ordinay Class");
		} else if (grade == 'F') {
			System.out.println("Student Failed");
		} else {
			System.out.println("Invalid Grade");
		}
	}
	// WAP to prin the class of the student by reading the grade as input using
	// switch case
	// A -> Distinction , B -> First Class , C -> Second , D->Third , E->Ordinary ,
	// F->Fail
    // Code formating : Select All ,  Ctrl+Shift+F
	@Test
	public void printStudentGrade_switch_test()
	{
		printStudentGrade_switch('A');
		printStudentGrade_switch('F');
		printStudentGrade_switch('E');
		printStudentGrade_switch('B');
		printStudentGrade_switch('D');
		printStudentGrade_switch('C');
		printStudentGrade_switch('K');
	}
	public void printStudentGrade_switch(char grade) {
		System.out.println("User Given Grade :" + grade);
		// switch(expression) { case 'A' , case 'B' ,
		switch (grade)
		{
			case 'A': 
			{
				System.out.println("Student passed in Distintion");
				break;
			}
			case 'B': 
			{
				System.out.println("Student passed in First Class");
				break;
			}
			case 'C': 
			{
				System.out.println("Student passed in Second Class");
				break;
			}
			case 'D': 
			{
				System.out.println("Student passed in Third Class");
				break;
			}
			case 'E': 
			{
				System.out.println("Student passed in Ordinary");
				break;
			}
			case 'F': 
			{
				System.out.println("Student Failed");
				break;
			}
			default :
			{
				System.out.println("Invalid Grade");
			}
			
		}
	}

}
