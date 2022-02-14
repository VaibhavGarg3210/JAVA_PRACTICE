import java.util.Scanner;
public class FibonacciSeries15 {
	static int a = 0,b=1;
	public static void main(String[] args) {
	System.out.println("Enter Series no");
	Scanner s = new Scanner(System.in);
	int fib =0,n = s.nextInt();
	s.close();
	if(n == 1)
		System.out.println("Fibonacci series = "+a);
	else if(n == 2)
		System.out.println("Fibonacci series = "+b);
	else
	{
	for(int i = 3;i<=n;i++)
	{
		fib = a+b;
		a = b;
		b = fib;
	}
	System.out.println("Fibonacci Series = "+(fib));
	}
	}

}
