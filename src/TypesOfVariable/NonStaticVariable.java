package TypesOfVariable;

public class NonStaticVariable {
	int a=20;//non static variable
	
	public static void main(String[] args) 
	{
		NonStaticVariable R=new NonStaticVariable();
		//R.a=45;
		System.out.println(R.a);//calling non static variable in main method
		v1();//calling static method
		R.v2();//calling non static method
		
		NonStaticVariable obj1 =new NonStaticVariable();
		obj1.a=500;
		System.out.println("the value of variable with obj1 is "+obj1.a);
		
		NonStaticVariable obj2=new NonStaticVariable();
		obj2.a=3333;
		System.out.println("the value of variable with obj2 is "+obj2.a);
		
	}
	public static void v1()
	{
		NonStaticVariable N1=new NonStaticVariable();//object creation in static method for non static variable
		N1.a=400;//value changes of nan static variable
		System.out.println(N1.a);//calling non static variable in static method
	}
	public void v2()
	{
		int a=6865;
		System.out.println(this.a);//calling non static variable in non static method
	//	System.out.println(a);
	}
}
