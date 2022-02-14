import java.util.Scanner;

public class ArmstrongUsingFun20 {
	static int count;
	public static int leng(int n)
	{
		
		while(n>0)
		{
			count += 1;
			n = n/10;
		}
		return(0);
	}
	public static int pow(int n,int con)
	{	
		if(con == 1)
			return 1;
		else
		{
			return(n*pow(n*n,con-1));
		}
					
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int arm=0,ch,n = s.nextInt();
		ch = n;
		s.close();
		 leng(n);
		while(n>0)
		{
			arm = arm + pow(n%10,count);
			n = n/10;
		}
		if(arm == ch)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
