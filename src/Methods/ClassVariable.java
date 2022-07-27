package Methods;

public class ClassVariable {
	int Rajesh=20;
	int Akshay=30;
	int Swapnil=40;

	public static void main(String[] args) {
		
		ClassVariable X=new ClassVariable();
		X.Rajesh=22;
		X.Akshay=33;
		X.Swapnil=44;
		
		System.out.println("The marks of Rajesh is "+X.Rajesh );
		System.out.println("The marks of Akshay is "+X.Akshay );
		System.out.println("The marks of Swapnil is "+X.Swapnil);
		System.out.println("\n");
		
		ClassVariable Y=new ClassVariable();
		Y.Rajesh=222;
		Y.Akshay=333;
		Y.Swapnil=444;
		
		System.out.println("the marks of Rajesh is "+Y.Rajesh);
		System.out.println("the marks of Akshay is "+Y.Akshay);
		System.out.println("the marks of Swapnil is "+Y.Swapnil);

	}

}
