package code;
/* In this program we are stuck in creating object so first i confuse it object then i create a
 * static method it still work but i am uncomfortable so then i create a object of FactRec class 
 * and then a variable fact is static variable (who hold the factorial value)  so it hold the fact
 *  value and then i use the object Factrec with the help of FactRecur thats why this is still 
 *  work  */
import java.util.Scanner;
public class FactRecur {
	static int fact =1;
	public static void main(String[] args) {
		int n;
		FactRecur f = new FactRecur();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no");
		n = s.nextInt();
		f.Factrec(n);
		System.out.println("Factorial = "+fact);
		s.close();
	}
	void Factrec(int n)
	{
		if (n>0)
		{
			fact = fact*n;
			Factrec(n-1);
		}
		
	}
}
