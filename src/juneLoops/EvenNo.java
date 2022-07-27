package juneLoops;

public class EvenNo {

	public static void main(String[] args) 
	{
		//by using while loop
		System.out.println("======while Loop=========");
		int x=0;
		while(x<=100)
		{
			if(x%2==0)
			System.out.print(x +" ");
			x++;
		}
			
		System.out.println();
		
		//by using the do while loop
		System.out.println("=====do while loop========");
		int y=0;
		do{
			if(y%2==0)
			System.out.print(y +" ");
			y++;
		}
		while(y<=100);
		System.out.println();
		
		//by using the for loop
		System.out.println("=====for loop========");
		for(int z=0;z<=100;z++)
		{
			if(z%2==0)
			System.out.print(z+" ");
		}
		System.out.println();
		
		
		
	}

}
