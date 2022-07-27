package decisionStatement;

public class ElseIfStatement {

	public static void main(String[] args) 
	{
		int marks=66;
		if (marks>60)
		{
			System.out.println("Result is first class");
		}
		else if (marks<=60)
		{
			System.out.println("result is second class");
		}
		else if(marks<=50)
		{
			System.out.println("result is pass class");
		}
		else
		{
			System.out.println("result is fail");
		}
	}

}
