import java.util.Scanner;
public class ReverseNumRecur10
{
	static int rev;
static int revFun(int n)
{	
	while(n>0)
	{
		rev = rev*10 + n%10;
		n = n/10;
	}
	return(rev);
}
	public static void main(String[] args) {
			int n;
			System.out.println("Enter Number : ");
			Scanner s = new Scanner(System.in);
			n = s.nextInt();
			s.close();
			System.out.println("Number  = "+n);
			System.out.println("Reverse Number = "+revFun(n));

	}

}
