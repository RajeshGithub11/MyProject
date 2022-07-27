package inheritance;

public class Inheritance {

	public static void main(String[] args) 
	{
		Parent.Add();
		Parent p=new Parent();
		p.sub();
		
		Child r=new Child();
		r.mul();
		Child.Div();
		
		Child.Add();
		r.sub();

	}

}
