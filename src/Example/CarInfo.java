package Example;

public class CarInfo {
	String carname;
	String company;
	int date;
	int cost;
	char grade;
		
	public CarInfo(String string, String string2, int i, int j, char c) {
		
		this.carname="Wagonr";
		this.company="Maruti";
		this.date=23042023;
		this.cost=100000;
		this.grade='A';
	}
	public  void Car()
	{
		System.out.println("the car name is:"+this.carname);
		System.out.println("company name is:"+this.company);
		System.out.println("launch date of car is:"+this.date);
		System.out.println("cost of the car is"+this.cost);
		System.out.println("car grade is"+this.grade);
	}

	public static void main(String[] args) {
		
		CarInfo A=new CarInfo("abc","asd",12,32,'A');
		A.Car();
		
		

	}
	

}
