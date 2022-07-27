package Constructor;

public class Method1 {//Default Constructor
	int z=500;
	
	public void OtherClass()//without parameter
	{
		int a=10;
		int b=20;
		int Add=a+b;
		System.out.println("The Addition is "+Add);
	}
	public void TATA_IPL1(String teamName,int score,char grade, float runRate )//with parameter
	{
		System.out.println("**********************");
		System.out.println("Team name is "+teamName);
		System.out.println("Total Score is "+score);
		System.out.println("Team Grade is "+grade);
		System.out.println("Team runRate is "+runRate);
		System.out.println("***********************");
		System.out.println(this.z); //--> calling by using "this" keyword
		System.out.println(z); //--> direct calling non static  variable in non static method.
	}
	
	

}
