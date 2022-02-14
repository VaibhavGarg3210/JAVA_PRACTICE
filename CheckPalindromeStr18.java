import java.util.Scanner;
public class CheckPalindromeStr18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ch = "",str = s.nextLine();
		s.close();
		char ls;
		for(int i=str.length()-1;i>=0;i--)
		{
		ls = str.charAt(i);
		ch = ch+ls;
		}
		if(str == ch)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		System.out.println(str+"  "+ch);

	}

}
