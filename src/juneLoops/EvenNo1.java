package juneLoops;

public class EvenNo1 {

	public static void main(String[] args) 
	{
		int x=0;
		while(x<=100)
		{
			if(x%2==0)
			System.out.print(x+" ");
			x++;
		}
		System.out.println();
		
		int y=0;
		do
		{
			if(y%2==0)
			System.out.print(y+" ");
			y++;
		}
		while(y<=100);
		System.out.println();
		
		for(int z=0; z<=100; z++)
		{
			if(z%2==0)
			System.out.print(z+" ");
		}
	}
}
