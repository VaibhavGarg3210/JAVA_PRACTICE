import java.util.Scanner;

public class FindEvenOdd3 {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		if(n%2 == 0)
			System.out.println("The Number is Even");
		else
		{
			System.out.println("The number is Odd");
		}

	}

}
