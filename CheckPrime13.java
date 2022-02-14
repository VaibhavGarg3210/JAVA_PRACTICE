import java.util.Scanner;

public class CheckPrime13 {

	public static void main(String[] args) {
		int n,i;
		System.out.println("Enter Number : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.close();
		for(i=2;i<=n/2;i++)
		{
			if(n%i == 0)
			{
				break;
			}
		}
		if(n/2 < i)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");
	}

}
