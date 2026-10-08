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

		for (int k = 1; k <= 2 * n - 1; k++) {
		  int stars = (k <= n) ? k : 2 * n - k;
		  for (int s = 1; s <= n - stars; s++)
			  System.out.print(" ");
		  for (int j = 1; j <= stars; j++)
			  System.out.print("* ");
		  System.out.println("");
		}


	}
}
