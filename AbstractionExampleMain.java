abstract class AbstractExample  /*abstraction class should start with an abstract key word. and it should have at least one abstract method where only declartion and no implemtation. If we want we should implement it in immediate subclass*/
{
	int a=10;
	abstract void display(); /*abstract method*/
	
}
class AbstractImplementation extends AbstractExample /*abstract method implementation*/
{
	void display()
	{
		System.out.println("This is abstract implmentation");
	}
}
class AbstractionExampleMain
{
	public static void main(String args[])
	{
		AbstractImplementation obj=new AbstractImplementation(); /*We can't create objects for abstract class. We can create for immediate subclass and can access abstract variables and methods.*/
		System.out.println(obj.a);
		obj.display();
	}
}