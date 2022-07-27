package Methods;

public class Demo1 {

	public static void main(String[] args) 
	{
		m1(10, 20, (10+20));//
		Demo1 m=new Demo1();
		System.out.println("-------------------");
		m.m2("Rajesh", 992363374, 'A', 8.5518f);

	}
	
	public static void m1(int a, int b, int c) // method with parameter
	{
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("----------------");
		System.out.println("the addition of c is "+c);
	}
	public void m2(String Name,int mob_no, char grade,float pointer)
	{
		System.out.println("The student name is "+Name);
		System.out.println("mobile no is "+mob_no);
		System.out.println("my grade is "+grade);
		System.out.println("my pointer in degree is "+pointer);
	}
	
}
