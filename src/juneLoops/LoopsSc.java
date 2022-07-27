package juneLoops;

import java.util.Scanner;

public class LoopsSc {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter NO.:");
		int num=scn.nextInt();
		if(num%2==0) 
			System.out.println(num+"is Even No.");
		else
			System.out.println(num+"is odd no.");
	}

}
