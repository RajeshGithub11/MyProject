package string;

public class StringStudy {

	public static void main(String[] args) 
	{
		//method 1 length()
		String name="Hyderabad";
		
		System.out.println(name.length());
		
		int length=name.length();
		System.out.println(length);
		System.out.println("=========1");
		
		System.out.println(name.toUpperCase()); //method 2 toUpperCase()
		System.out.println(name.toLowerCase()); //method 3 toLowerCase()
		System.out.println("======2");
		//method 4  //equal() method use
		String name1="Banglore";
		String name2="Banglore"; 
		String c=new String("Banglore");
		String d=new String("Banglore");
		String e=new String("BANGLORE");
		
		//==compares memory locations of two operands & check case of two operands.
		//equals()is is used to compares character sequence of two objects, case of objects
		System.out.println(name1==name2);
		System.out.println(c==d); //memory location different that why false.
		System.out.println("=======3");
		System.out.println(name1.equals(name2));
		System.out.println(c.equals(d));
		System.out.println(d.equals(e));
		System.out.println("=======4");
		System.out.println(name1.equals(e));
		System.out.println("============5");
		
		// method  equalIgnoreCase()
		System.out.println(name1.equalsIgnoreCase(e));
		System.out.println("============6");
		
		//method 6 contains()
		String R="Rajesh";
		System.out.println(R.contains("Ra"));
		System.out.println(R.contains("Rj"));
		System.out.println("==========7");
		String A="test";
		String B=" ";
		String r=null;
		String s="";
		
		//method 7 isEmpty()
		System.out.println(A.isEmpty());
		System.out.println(s.isEmpty());
		//System.out.println(r.isEmpty()); nullpointer exception yety.
		System.out.println(B.isEmpty());
		System.out.println(s.isBlank());
		System.out.println("========8");
		
		//method 8 charAt()
		String country="India";
		System.out.println(country.charAt(2));
		
		System.out.println("===========9");
		//method 9 endsWith()
		System.out.println(country.endsWith("d"));
		System.out.println(country.endsWith("ia"));
		System.out.println("===========10");
		
		//method 10 
		System.out.println(country.startsWith("in"));//case sensitivity
		System.out.println(country.startsWith("In"));
		boolean sa=country.startsWith("Ind");
		System.out.println(sa);
		System.out.println("========11");

		//method 11 
		String company="tata consultancy services";
		System.out.println(company.substring(5, 16)); //space suddha index madhe calculate kela jatoy.
		String C1=company.substring(17);
		System.out.println(C1);
		System.out.println("=========12");
		
		//method 12
		
		String x="Pune";
		String y="City";
		System.out.println(x.concat(y).concat("Pimpri"));
		System.out.println("=========13");
		
		//method 13
		String State="Maharashtra";
		System.out.println(State.indexOf('r'));
		System.out.println(State.indexOf('t'));
		System.out.println(State.indexOf('a',3));
		System.out.println("============14");
		
		//method 14
		String Dis="Mumbai";
		System.out.println(Dis.replace('M', 'P'));
		System.out.println("=========15");
		
		//method 15
		
		System.out.println(State.lastIndexOf('a'));
		System.out.println(State.lastIndexOf('r'));
		System.out.println("=========16");
		
		//method 16
		
		String obj="I :LOVE :MY :INDIA";
		String obj1=":";
		String [] result=obj.split(obj1);
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		System.out.println("===========17");
		
		String test="Good Morning";
		String demo=" ";
		
		String[]result1=test.split(demo);
		System.out.println(result1[0]);
		System.out.println(result1[1]);
		System.out.println("=========18");
		
		
		//by using Array
		String W="I LOVE MY INDIA";
		String res[]=W.split(" ");
		
		for(int z=0;z<=res.length-1;z++)
		{
			System.out.println(res[z]);
		}
		
	}

}
