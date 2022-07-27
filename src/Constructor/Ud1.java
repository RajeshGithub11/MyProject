package Constructor;

public class Ud1 {
	
	String Name;   // globally variable declaration 
	int Runs;     // globally variable declaration
	float average;  // globally variable declaration
	char grade;    // globally variable declaration
	public Ud1()
	
	{
		Name="Virat kohli";  // variable initialization
		Runs=14735;         // variable initialization
		average=53.65f;     // variable initialization
		grade='A';          // variable initialization
	}
	public Ud1(String a)
	{
		Name=a;
		
	}

	public static void main(String[] args) 
	{
		Ud1 R=new Ud1();
		R.Info();
		
		
		Ud1 S=new Ud1("Rohit sharma");
		S.Info1();
		

	}
	
	public void Info()
	{
		System.out.println("The player name is "+Name);
		System.out.println("The player Runs is "+Runs);
		System.out.println("The player average is "+average);
		System.out.println("the player grade is "+grade);
	}
	public void Info1()
	{
		System.out.println(Name);
	}
}
