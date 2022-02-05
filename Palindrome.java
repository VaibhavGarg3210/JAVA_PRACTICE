package code;

import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
		int n,n2,rev=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		n = s.nextInt();
		n2 = n;
		s.close();
		while(n2>0)
		{
			rev = rev*10 + n2%10;
			n2 = n2/10;
		}
		if (rev == n)
			System.out.println(n+" is Palindrome");
		else
			System.out.println(n+" is not Palindrome");
		
	}

}
