package decisionStatement;

public class Exapmple1 {

	public static void main(String[] args) 
	{
		int i=10;
		int j=3;
		int k=i/j;
		int l=i%j;
		
		System.out.println("the value ok k is: "+k);
		System.out.println("the value of l is: "+l);

		if(i<j)
		{
			System.out.println("i is smaller than j");
		}
		else
		{
			System.out.println("i is grater than j");
		}
		boolean m=i>j;
		System.out.println(m);
		
		boolean n=i<j;
		System.out.println(n);
		
		boolean o= i==10;
		System.out.println(i);
		
		System.out.println("==================");
		
		//logical operator
		//&& OPERATOR - THIS OPERATOR GIVES TRUE VALUE WEHN BOTH COND. IS TRUE OTHERWISE FALSE 
		int r=100;
		int s=200;
		 boolean a =(r<s) && (r>50);
		System.out.println(a);
		
		int b=400;
		int c=20;
		
		//OR(!) OPERATOR - TRUE VALUE WHEN ONE CONDITION IS TRUE.
		boolean result = (b>c) || (b<100);
		System.out.println(result);
		 System.out.println("==========");
		//3. LOGICAL NOT OPERATOR - IT GIVES EXACT OPPOSITE BOOLEAN VALUE WHEN APPLIED TO CONDITION.
		// ! --> symbol.
		int f=12;
		int g=12;
		
		boolean  y=!(f==12);
		System.out.println(y);
		
		boolean z=!(g==20);
		System.out.println(z);
	}

}
