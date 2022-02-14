import java.util.Scanner;
public class SwitchCase {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		char a = s.nextLine().charAt(0);
		s.close();
		switch(a)
		{
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("Not Vowel");
			break;
	}
	}
	
}
