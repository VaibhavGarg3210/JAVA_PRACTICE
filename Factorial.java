package code;
import java.util.Scanner;
public class Factorial {
	public static void main(String args[])
	{
		int n,res=1,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no");
		n = s.nextInt();
		s.close();
		for(i=n;i>0;i--)
		{
			res = i*res;
		}
			System.out.println("The Factorial is :"+res);
		
	}
	
}
