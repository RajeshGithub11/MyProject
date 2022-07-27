package StringPrograms;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s="RAJESH";
		String rev="";
		for(int i=(s.length()-1);i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("The Reversed String is:- "+rev);
		
		String r="Automation";
		String m="";
		for(int j=r.length()-1;j>=0;j--)
		{
			m=m+r.charAt(j);
		}
		System.out.println(m);
	}

}
