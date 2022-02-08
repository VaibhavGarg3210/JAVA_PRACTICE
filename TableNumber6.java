import java.util.Scanner;
public class TableNumber6 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter Number : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.close();
		for(int i=1;i<=10;i++)
			System.out.println(n+" X "+i+" = "+n*i);

	}

}
