import java.util.Scanner;

public class CheckArmstrong19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double res = 0;
		System.out.println("Enter Number");
		int len,ch,n = s.nextInt();
		ch = n;
		s.close();
		len = String.valueOf(n).length();
		while(n>0)
		{
			res = (res + (Math.pow(Double.valueOf(n%10),Double.valueOf(len))));
			n = n/10;
		}
		if(res == ch)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
