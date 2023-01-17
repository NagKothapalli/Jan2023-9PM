package coreConcepts;

//Signature : CLASS
  // Modifier  class   Name{   Members : Variables / Functions }
  //Access Modifiers : private , default , protected , public 

//Naming Conventions : Class name must start with Uppercase , no space in the class name , no special characters 
   // should not use reserved keywords as class name    
   // in a java file we can have multiple classes but only one public class
  //Name of the public class and name of the java file must be same 
public class BasicConcepts{
	//Members : Variables  , Functions 
//Signature : VARIABLE
	//Modifier[opt]    DataType   Name ;  - Declaration
	
	//Modifier[opt]    DataType   Name  =  value ;  - Declaration and Assignment
	
	//Numeric : byte , short , int , long
	//typemismatch : 
	byte num1 = 99;
	short num2 = 9999;
	int num3 = 999999999;
	long num4 = 999999999;
	
	private int  xyz = 22;
	
	public String stdName = "Ram";
	
	protected char stdGrade = 'A';
	
	public double stdPercentage = 94.52;
	
	public boolean stdResult = true;
	
	//Oops concepts : Inheritance , Polymorphism , abstraction , encapsulation
	
	//Signature : FUNCTION / METHOD
	
	//Modifier[opt]   ReturnType    Name(){  body- implementation | Definition | coding  } 
	                  //void - if not returning anything
	                  // int , char , boolean , string , double , array , object
	
	//Modifier[opt]   ReturnType    Name(arguments[opt]){  body- implementation | Definition | coding  } 
	                                     //DataType arg1,DataType arg2.....
	//No output , No input - 0 , 0 
	public void addition()
	{
		//implementation
	}	
	// 0 , 1
	//No output , Yes input
	
	public void addition(int num1)
	{
		//implementation
	}
	
	// 0 , 1 1
	//No output , Yes input
	
	public void addition(int num1,int num2)
	{
		//implementation
	}
	// 0 , 1 1
	//No output , Yes input
	
	public void addition(int num1,int num2,int num3)
	{
		//implementation
	}
	// 0 , 1 1
	//No output , Yes input
	
	public void addition(int a,String b)
	{
		//implementation
	}

	//Naming Conventions : For Member of a CLASS
	
	//Can start with _ , $ , a-z , A-Z 
	//It should follow camelCasing
	//It should not have any space
	//It should not start with Numeric
	//Constructor of a class need not follow camelCasing , only for constructor they allow upper case
	
	int _num; int $num; int num; int Num; int std1Num; int stdNum1; int num5;
	int stdNum;  int StdNum; int std_Num; int stdNum_;  int std$Num ; int stdNum$; 
	
	//Invalid cases	
	//int 1num; int std#Num;int std Num;

	

}


class Yahoo{
	//you need a file called Yahoo.java
}

class Amazon{
	
}

class FlipKart{
	
}



















