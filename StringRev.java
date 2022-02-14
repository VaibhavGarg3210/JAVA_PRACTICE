import java.util.Scanner;

public class StringRev {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str = s.nextLine();
		System.out.print("How many time you rotate :");
		n = s.nextInt();
		char temp;
		s.close();
		System.out.println("Previous String : "+str);
		for(int i = 1;i<=n%(str.length());i++) {
			temp = (str.charAt(str.length()-1));
			str = temp+str.substring(0,str.length()-1);
		}
		System.out.println("Upadated String : "+str);
	
}
}