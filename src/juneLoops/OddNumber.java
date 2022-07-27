package juneLoops;

public class OddNumber {

	public static void main(String[] args) 
	{
		int x=0;
		while(x<=100)
		{
			if(!(x%2==0))
			System.out.print(x+" ");
			x++;
		}
		System.out.println();
		
		//reverse while loop
		int j=100;
		while(j>=0)
		{
			if(!(j%2==0))
			System.out.print(j+" ");
			j--;
		}
		System.out.println();
		
		int y=0;
		do
		{
			if(!(y%2==0))
			System.out.print(y+" ");
			y++;
		}
		while(y<=100);
		System.out.println();
		
		//reverse do while loop
		int k=100;
		do
		{
			if(!(k%2==0))
			System.out.print(k+" ");
			k--;
			
		}
		while(k>=0);
		System.out.println();
		
		
		for(int z=0;z<=100;z++)
		{
			if(!(z%2==0))
			System.out.print(z+" ");	
		}
		System.out.println();
		
		//reverse for loop.
		for(int l=100; l>=0; l--)
		{
			if(!(l%2==0))
			System.out.print(l+" ");
		}
	}

}
