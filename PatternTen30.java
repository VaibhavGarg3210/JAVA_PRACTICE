
public class PatternTen30 {
	/*
	 *  *       *
	 *   *     *
	 *    *   *
	 *     * *
	 *      *
	 *     * *
	 *    *   *
	 *   *     *
	 *  *       *
	 *      
	 *      
	 *      
	 */

	public static void main(String[] args) {
		int n = 5;//Only odd values
		for(int i=1;i<10;i++)
		{
			/*if(i<= 5) {
			for(int j=1;j<i;j++)
				System.out.print(" ");
			System.out.print("*");
			for(int j=i;j<10-i-1;j++)
				System.out.print(" ");
		    if(i<5)System.out.println("*");
			} 
			else
			{if(i==6)System.out.println();
			for(int j=1;j<10-i;j++)
				System.out.print(" ");
			System.out.print("*");
			for(int j=1;j<=(i-5)*2-1;j++)
				System.out.print(" ");
			System.out.println("*");}*/
		//Updated Code 
		for(int j=1;j<=n;j++)
		{ if(j == i || j == n-i+1)
			System.out.print("*");
		 else
			 System.out.print(" ");
		}
			System.out.println();

	}
	}
	}

