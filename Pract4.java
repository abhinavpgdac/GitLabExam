package Assignment1;

//question check if sum of two numers is greater then 100 then print "welcome" else print "sorry".

import java.util.*;

public class Pract4 {
	int e;
	int sum(int a,int b)
	{
		if((a+b)>100)
		{
			System.out.println("Welcome");
		}
		else System.out.println("Sorry");
		return e;
	}
	public static void main(String[] args) {
		Pract4 s=new Pract4();
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the First no.:- ");
		int c=x.nextInt();
		System.out.println("Enter the Second no.:- ");
		int d=x.nextInt();
		s.sum(c,d);
		

	}

}
