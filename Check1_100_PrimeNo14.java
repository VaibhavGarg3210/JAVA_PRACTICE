public class Check1_100_PrimeNo14 {
	public static void main(String[] args)
	{
		int i,j;
		for(i = 1;i<=100;i++)
		{
			for(j =2;j<=i/2;j++)
			{
				if(i%j == 0)
					break;
			}
			if(j>i/2)
				System.out.println(i + " is Prime number");
				
				
		}
	}
}
