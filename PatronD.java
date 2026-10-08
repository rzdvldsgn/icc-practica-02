import java.util.Scanner;

/**
 * representacion de n
 *
 * @author Rafael Sandoval Castillo
 * @version 1.0
 */

public class PatronA{
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);

	//Input//
	System.out.println("Introduce el valor de n: \n");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
		  for (int j = 1; j <= 2 * (n - i); j++)
			  System.out.print(" ");
		  for (int s = 1; s <= i; s++)
			  System.out.print(s + " ");
		  for (int s = i - 1; s >= 1; s--)
			  System.out.print(s + " ");
		System.out.println("");

		}


	}
}
