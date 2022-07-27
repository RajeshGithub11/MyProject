package Methods;

public class Non_StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is non static method program");
		
		Non_StaticMethod Rajesh=new Non_StaticMethod();
		Rajesh.SameClass();
		
		NonStaticClass Swapnil=new NonStaticClass();
		Swapnil.method2();
		
		Swapnil.test();
	}
	
	public void SameClass()
	{
		System.out.println("This is Non static method from same class");
	}
}
