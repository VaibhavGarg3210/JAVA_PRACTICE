
public class FibonacciSeries16 {
	static int recFact(int n)
	{
		if(n == 1)
			return(0);
		else if(n == 2)
			return(1);
		else
			return(recFact(n-1)+recFact(n-2));
	}
	public static void main(String[] args) {
		int n = 8;
		System.out.println(recFact(n));

	}

}
