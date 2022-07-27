package TypesOfVariable;

public class LocalVariable {
	static int a=20;
	int b=30;
	public static void main(String[] args) 
	{
		int a=200;
		int b=300;
		System.out.println("value of local variable a is "+a);
		System.out.println("value of local variable b is "+b);
		System.out.println("the calue of static variable a is "+LocalVariable.a);//calling static variable inside static method
		LocalVariable L=new LocalVariable();//object creation is required
		System.out.println("The Value of Non static  Variable is "+L.b);//calling non static variable in static method
		
		
		//LocalVariable x=new LocalVariable();
		//x.a=500;
		//System.out.println(x.a);
		
	}
		
}
