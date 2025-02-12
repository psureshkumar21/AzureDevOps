import java.util.*;
class AddTwoNumbers
{
	public static void main(String args[])
	{
		//This is to add two numbers
		Scanner obj = new Scanner(System.in);
		int sum, num1, num2;
		System.out.println("Enter First Number");
		num1=obj.nextInt();
		System.out.println("Enter Second Number:");
		num2=obj.nextInt();
		sum=num1+num2;
		System.out.println("Sum of two numbers is":+sum);
	}
}
