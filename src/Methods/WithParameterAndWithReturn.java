package Methods;

public class WithParameterAndWithReturn {

	public static void main(String[] args) 
	{
		WithParameterAndWithReturn w=new WithParameterAndWithReturn();
		System.out.println(w.m1(10, 10));
		
		m2();
		System.out.println(m2());
		
		

	}
	
	public boolean m1(int a, int b)
	{
		int c=a+b;
		if(c==20)
			return true;
		return false;
	}
	public static float m2()
	{
		return '%';
		
	}
}

