package Assignment1;

import java.util.Scanner;

/*write a program  to ask name and code (String) of security staff .
if code =="COOLCOOL" then print "welcome user" else Ask him to reenter code .and maximum chance to enter code is 3.After third attempt print "GoBack".
*/

public class Pract6 {
	Scanner x=new Scanner(System.in);
	int flag=0;
	void get() 
	{
		System.out.println("Enter your name:- ");
		String a=x.nextLine();
	}
	void check()
	{
		System.out.println("ENter the password:- ");
		String code="COOLCOOL";
		for(int i=0;i<=3;i++)
		{
			String b=x.nextLine();
			if(b.equalsIgnoreCase(code))
			{
				flag=1;
				System.out.println("Welcome User ");
				break;
			}
			System.out.println("Re-enter the code ");
		}
	}
	void error()
	{
		if (flag==0)
		{
			System.out.println("GoBack");
		}
	}
	public static void main(String[] args) {
		Pract6 s=new Pract6();
		s.get();
		s.check();
		s.error();

	}

}
