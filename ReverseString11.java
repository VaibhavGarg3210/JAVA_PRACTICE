import java.util.Scanner;

public class ReverseString11 {

	public static void main(String[] args) 
	{
		String str,rev="";  
		System.out.println("Enter String");
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		s.close();
		for(int i = 1;i<=str.length();i++)
		{
			rev = rev + str.charAt(str.length() - i);
		}
		System.out.println(rev);
	

	}

}
