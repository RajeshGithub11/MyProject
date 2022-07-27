package casting;

public class UpCasting {

	public static void main(String[] args) {
		Son obj=new Son();
		obj.money();
		obj.Nature();
		System.out.println("===========");
		Father test=new Son();
		test.money();
		test.Nature();

	}

}
