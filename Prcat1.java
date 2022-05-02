package Assignment1;

//write a program to display Hello message

import java.util.*;

public class Prcat1 {
	String a;
	String name(String a)
	{
		//System.out.println("a");
		return a;
	}
	public static void main(String[] args) {
		Prcat1 s=new Prcat1();
		Scanner b=new Scanner(System.in);
		System.out.println("Enter any Word:- ");
		String c=b.nextLine();
		c=s.name(c);
		System.out.println(c);
		
	}

}
