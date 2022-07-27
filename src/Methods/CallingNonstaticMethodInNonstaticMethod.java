package Methods;

public class CallingNonstaticMethodInNonstaticMethod {

	public static void main(String[] args) 
	{
		CallingNonstaticMethodInNonstaticMethod R=new CallingNonstaticMethodInNonstaticMethod();
		R.m1();
		R.m2();
		m3();

	}
	public void m1()
	{
		System.out.println("Non static method");
	}
	public void m2()
	{
		System.out.println("Calling non static method inside non static method");
		m1();//calling non static method inside non static method
		m3();//calling static method inside non static method
	}
	public static void m3()
	{
		System.out.println("static method inside non static method");
	}
}
