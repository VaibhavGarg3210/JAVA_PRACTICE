
public class PatternNine29 {
	/*
	   
	       *
	      * *
	     *   *
	    *     *
	   *       *
	____________________________________ 

	   *       *
	 	*     *
	 	 *   *
	 	  * *
	 	   *
	 */

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
				System.out.print(" ");
			System.out.print("*");
			for(int j=2;j<2*i-1;j++)
				System.out.print(" ");
			if(i>1) {System.out.print("*");}
			System.out.println();
		}
		System.out.println("________________________________________________");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			System.out.print("*");
			for(int j=1;j<10-2*i;j++)
				System.out.print(" ");
			if(i<5)
				System.out.print("*");
			System.out.println();
		}

	}

}
