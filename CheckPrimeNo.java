package code;
import java.util.Scanner;
public class CheckPrimeNo {
	public static void main(String args[])
	{
		int n,k;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		n = s.nextInt();
		k = n/2;
		s.close();
		while(k>1)
		{
			if(n%k == 0)
				break;
			else
				k -= 1;
		}
		if (k<=1&&k>=0)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}

}
