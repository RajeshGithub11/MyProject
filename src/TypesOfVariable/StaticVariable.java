package TypesOfVariable;

public class StaticVariable {
	
	static int a=100;
	static int b;
	//a=a+500;

	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);//default value of variable is consider to be zero
		v1();
		StaticVariable V=new StaticVariable();//object creation for method
		V.v2();
		
		StaticVariable obj1 =new StaticVariable();
		obj1.a=500;
		System.out.println("the value of variable with obj1 is "+obj1.a);
		
		//StaticVariable obj2=new StaticVariable();
		//obj2.a=400;
		//System.out.println("the value of variable with obj2 is "+obj2.a);
		
		System.out.println(a);

	}
	public static void v1()
	{
		 int add=a+100;
		System.out.println(add);
	}
	public void v2()
    {
		System.out.println(a);
    }

}
