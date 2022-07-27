package Methods;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We learn static method");
		staticmethod(); //static method from same class(method name)
		Static_Class.method1(); //static method from other class(class name.methodname)
		
	}

	public static void staticmethod()
	{
		System.out.println("this is Static method from same class");
	}
}
