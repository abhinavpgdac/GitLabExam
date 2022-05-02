package Assignment1;

//write a program to ask two number from user and print their sum.(using scanner class)

import java.util.*;

public class Pract2 {
	int sum(int a,int b)
	{
		int f=a+b;
		return f;
				
	}
	public static void main(String[] args) {
		Pract2 s=new Pract2();
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the First no.:- ");
		int c=x.nextInt();
		System.out.println("Enter the second no.:- ");
		int d=x.nextInt();
		int e=s.sum(c, d);
		System.out.println(e);

	}

}
