import java.util.Scanner;
public class FindGreater2 {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st No :");
		n1 = s.nextInt();
		System.out.println("Enter 2nd No :");
		n2 = s.nextInt();
		System.out.println("Enter 3no No :");
		n3 = s.nextInt();
		s.close();
		if(n1>n2)
		{
			if(n1>n3)
				System.out.println(n1+" is Greater");
			else
				System.out.println(n3+" is Greater");
		}
		else
		{
			if(n2>n3)
			{
				System.out.println(n2+" is Greater");
			}
			else
			{
				System.out.println(n3+" is Greater");
			}
		}
	}

}
