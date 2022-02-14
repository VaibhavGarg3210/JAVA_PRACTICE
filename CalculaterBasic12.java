import java.util.Scanner;
public class CalculaterBasic12 {
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Operation");
	System.out.println("1.Addition\n2.Subtration");
	System.out.println("3.Multiplication\n4.Divide");
	int n = s.nextInt();
	System.out.println("Enter Number");
	int fst = s.nextInt();
	System.out.println("Enter second number");
	int sec = s.nextInt();
	s.close();
	
	if(n == 1)
		System.out.println("Addition = "+(fst+sec));
	else if(n==2)
		System.out.println("Subtraction = "+(fst-sec));
	else if(n==3)
		System.out.println("Multiplication = "+(fst*sec));
	else if(n==4)
		System.out.println("Divide = "+(float)(fst/sec));
	
	}
}
