package decisionStatement;

import java.util.Scanner;

public class CheckNumberIsEvenOrOdd {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=scn.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num +"   is Even Number");
		}
		else {
			System.out.println(num +"   is odd Number");
		}
	}

}
