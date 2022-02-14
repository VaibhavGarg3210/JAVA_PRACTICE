import java.util.Scanner;
public class SwapNo5 {

	public static void main(String[] args) {
		int n1,n2,n3;
		System.out.println("Enter 1st No : ");
		Scanner s = new Scanner(System.in);
		n1 = s.nextInt();
		System.out.println("Enter 2nd No : ");
		n2 = s.nextInt();
		System.out.println("Before Swaping\n"+"First No = "+n1+"\nSecond No = "+n2);
		System.out.println("*******************************************************");
		s.close();
		n3 = n1;
		n1 = n2;
		n2 = n3;
		System.out.println("After Swaping\n"+"First No = "+n1+"\nSecond No = "+n2);
		
		
	}

}
