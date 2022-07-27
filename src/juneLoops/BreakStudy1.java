package juneLoops;

public class BreakStudy1 {

	public static void main(String[] args) 
	{
		OuterLoop: for(int i=1;i<=2;i++)
		{
			System.out.println("Outerloop");
		
		for(int j=1;j<=5;j++)
		{
			System.out.println("Innerloop");
			if(j==3)
				break OuterLoop;
		}
	}
}

}
