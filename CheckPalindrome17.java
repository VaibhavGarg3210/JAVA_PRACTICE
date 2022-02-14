import java.util.Scanner;

public class CheckPalindrome17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int fib=0,ch,n = s.nextInt();
		s.close();
		ch = n;
		while(n>0)
		{
			fib = (fib*10)+n%10;
			n = n/10;
		}
		if(fib == ch)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
