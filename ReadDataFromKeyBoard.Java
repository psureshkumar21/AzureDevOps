import java.util.*;
class ReadDataFromKeyBoard
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a;
		float f;
		String s;
		double c;
		a=obj.nextInt();
		f=obj.nextFloat();
		c=obj.nextDouble();
		s=obj.next();
		System.out.println("Entered integer value is:"+a);

		System.out.println("Entered Float value is:"+f);

		System.out.println("Entered  double value is:"+c);

		System.out.println("Entered String value is:"+s);
		
	}
}
