package Mock_Method;

public class Mock_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add(20,30);
		Mock_Static R=new Mock_Static();
		R.Sub(20,10);
	}

	public static void Add(int a, int b)//static method with  parameter
	{
	//	int a=15;
	//	int b=20;
	//	int addition=a+b;
		
		System.out.println("the value of A is "+(a+b));
	}
	public void Sub(int a, int b)//non static method with  parameter
	{
	//	int a=20;
	//	int b=10;
		System.out.println("the value of Sub us "+(a-b));
	}
	
}
