package Constructor;

public class DefaultConstructor1 {
	int a=100;//global variable or non static variable
	int b=200;//global variable or non static variable
	public static void main(String[] args) 
	{
		DefaultConstructor1 A=new DefaultConstructor1();
		A.Addition(50,60);
		DefaultConstructor1 B=new DefaultConstructor1();
		B.Add();
		
		System.out.println("******************");
		DefaultConstructor1 r=new DefaultConstructor1();
		System.out.println(r.a);//--> calling non static variable in static method by object creation.

	}
	public void Addition(int a, int b)//with parameter in this we only declare 
	{                                 //variable and assign value in main method
		
		System.out.println("addition is "+(a+b));
	}
	public void Add()
	{
		int a=200;//variable in method is local variable
		int b=500;//variable in method is local variable
		System.out.println("This Addition is "+(a+b));
		
		System.out.println(this.a);//--> non static variable inside non static method using "this" keyword.
	}
}
