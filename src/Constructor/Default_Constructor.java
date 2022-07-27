package Constructor;

public class Default_Constructor {

	/*public XYZ() -->This is default constructor provided by the compiler which is invinsible
	 * {
	 * 
	 * 
	 * 
	 * }
	 * 
	 */
	public static void main(String[] args) 
	{
		Default_Constructor S=new Default_Constructor();
		S.TataIpl();//calling from same class
		
		Default_Constructor R=new Default_Constructor();
		R.India();//calling from same class.
		
		Method1 OC=new Method1();
		OC.OtherClass();// calling from other class
		
		Method1 X=new Method1();
		X.TATA_IPL1("RCB", 200, 'A', 1.5645f); // -->calling from other class With Parameter.
		X.TATA_IPL1("CSK", 150, 'B', 2.5555f);// -->calling from other class with paraemeter.
	}
	public void TataIpl()//Zero parameter
	{
		System.out.println("This is Indian premier League");
	}
	public void India()// Zero parameter
	{
		System.out.println("This is my Country");
	}

}
