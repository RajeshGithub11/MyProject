package Methods;

public class CallingStaticMethodInsideStaticMethod {

	public static void main(String[] args) 
	{
		m1();
		m2();

	}
	public static void m1()
	{
		System.out.println("static method");
	}
	public static void m2()
	{
		System.out.println("calling static method in static method");
		m1();
		CallingNonstaticMethodInNonstaticMethod R=new CallingNonstaticMethodInNonstaticMethod();
		
		R.m3();//calling non static method inside static method with object creation
		
	}
	public void m3()
	{
		System.out.println("non static mehtod in static method");
	}
}
