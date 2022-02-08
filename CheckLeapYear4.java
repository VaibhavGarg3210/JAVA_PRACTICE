import java.util.Scanner;

public class CheckLeapYear4 {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter year :");
		n = s.nextInt();
		s.close();
		if(n%100 == 0)
		{
			if(n%400 == 0)
				System.out.println("Leap Year");
			else
				System.out.println("Not Leap Year");
		}
		else {
			if(n%4 == 0)
				System.out.println("Leap Year");
			else
				System.out.println("Not Leap Year");
		}

	}

}
