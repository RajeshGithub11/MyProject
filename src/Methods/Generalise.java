package Methods;

public class Generalise {

	public static void main(String[] args) 
	{
		Generalise G=new Generalise();
		G.m1();
		m2();

	}
	public static void generalize(int maths, int chem, int phy, String name)
	{
		System.out.println("marks of the student: ");
		System.out.println("Name of the student "+name);
		System.out.println("Maths : "+maths);
		System.out.println("Chem : "+chem);
		System.out.println("Phy : "+phy);
		System.out.println(" ");
		
		
	}
	public void m1()
	{
		generalize(40,50,60,"Sachin");
	}
	public static void m2()
	{
		generalize(11,22,33,"Virat");
	}
}
