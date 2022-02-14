
public class PatternEight28 {
	/*
	      *
	 		*
	 		  *
	 		    *
	 		      *
	___________________________________ 		 
	 		      
	 	         *
	 	        *
	 	       *
	 	      *
	 	     *

	 */
	

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			
			System.out.println(" *");
		}
		System.out.println("_____________________________________");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
				System.out.print(" ");
			System.out.println(" *");
		}

	}

}
