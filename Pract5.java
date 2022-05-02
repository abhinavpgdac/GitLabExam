package Assignment1;

/*write a program that ask 5 subject marks of a student .Find average marks by dividing total by 5 . Check if marks less then 40 print fail .
if marks between 40 to 60 print c grade
if marks between 60 to 80 print B grade
else A grade*/

import java.util.*;
public class Pract5 {
	int f;
	int average(int a,int b,int c,int d,int e)
	{
		double avg=(a+b+c+d+e)/5;
		if(avg>80)
		{
			System.out.println("Scored grade A " +avg);
		}
		else if(avg>60 && avg<80)
		{
			System.out.println("Scored grade B " +avg);
		}
		else if(avg>40 && avg<60)
		{
			System.out.println("Scored grade C " +avg);
		}
		else System.out.println("Fail");
		return f;
	}
	public static void main(String[] args) {
		Pract5 s=new Pract5();
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the first marks:- ");
		int g=x.nextInt();
		System.out.println("Enter the sceond marks:- ");
		int h=x.nextInt();
		System.out.println("Enter the third marks:- ");
		int i=x.nextInt();
		System.out.println("Enter the fourth marks:- ");
		int j=x.nextInt();
		System.out.println("Enter the fifth marks:- ");
		int k=x.nextInt();
		s.average(g, h, i, j, k);

	}

}
