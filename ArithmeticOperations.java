import java.util.*;
class ArithmeticOperations1
{
         
	void add(int a, int b)
	{
		
		int c =a+b;
		System.out.println("Sum is:"+c);
	}


	void subtraction(int a, int b)
	{
		int c=a-b;
		System.out.println("Subtraction is:"+c);
	}


	void multiplication(int a, int b)
	{
			
		int c=a*b;
	        System.out.println("Mulitiplication result is:"+c);
	}

	void divison(int a, int b)
	{	
		int c =a/b;
		System.out.println("Divison result is:"+c);
	}

}


class ArithmeticOperations
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		ArithmeticOperations1 obj1=new ArithmeticOperations1();
		System.out.println("Enter first value:");
		int a=obj.nextInt();
		System.out.println("Enter Second Value:");
		int b=obj.nextInt();
		obj1.add(a,b);
		obj1.subtraction(a,b);
		obj1.multiplication(a,b);
		obj1.divison(a,b);
	}
	
}