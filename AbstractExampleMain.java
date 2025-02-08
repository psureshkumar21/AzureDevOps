/*Abstraction:

Show only essesntial part and hide implementation part.

abstract method:
only declaration but no definition

abstract class:
*. class contains atleast one abstract method
*. abstrc class wil have abstract methods and normal methods
*. implementation of abstract method will be in immediate subclass
*. object can't be created to abstract class.

concrete class: a class which all implementation of all methods.*/

abstract class AbstractionExample
{
	int a =20;
	void display()
	{
		System.out.println("This is normal method");
	}
	abstract void show();
}
class Abstract extends AbstractionExample
{
	void show()
	{
		System.out.println("This is Abstract method Implementation");
	}
}

class AbstractExampleMain
{
	public static void main(String args[])
	{
		Abstract obj=new Abstract();
		obj.show();
		obj.display();
		System.out.println(obj.a);
	}
}

