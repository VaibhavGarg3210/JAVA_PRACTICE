import java.util.Scanner;

public class RevNumber9 {

	public static void main(String[] args) {
		int n,rev = 0;
		System.out.println("Enter Number : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.close();
		System.out.println("Number  = "+n);
		while(n > 0)
		{
			rev = rev*10 + n%10;
			n = n/10;
		}
		System.out.println("Reverse Number = "+rev);
	}

}
