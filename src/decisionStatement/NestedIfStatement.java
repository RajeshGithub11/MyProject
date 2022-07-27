package decisionStatement;

public class NestedIfStatement {

	public static void main(String[] args) 
	{
		String un="Velocity";
		String pwd="1234";
		
		if(un=="Velocity")
		{
		  System.out.println("correct username please enter password.");

			if(pwd=="1234")
			{
				System.out.println("login successfull.");
			}
			else
			{
				System.out.println("please enter correct password");
			}
			
	    }
		
	    else
	    	{
	    		System.out.println("please enter correcrt username");
	    	}
	}
}
