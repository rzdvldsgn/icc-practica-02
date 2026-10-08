import java.util.Scanner;

/**
 * Manejo de cadenas
 * @author Rafael Sandoval Castillo
 * @version 1.0
 */

public class Cadenas1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String x = scan.nextLine().toLowerCase();
		System.out.println("Introduce otra cadena");
		String y = scan.nextLine().toLowerCase();
		boolean agram = x.length() == y.length();

		for (int i = 0; i < x.length() && agram; i++) {
			char z = x.charAt(i);
			int inX = 0, inY = 0;
			for (int j = 0; j < x.length(); j++) {
			  if (x.charAt(j) == z) inX++;
			  if (y.charAt(j) == z) inY++;
			}
			if (inX != inY) agram = false;
		}
		System.out.println(agram ? "Si es un anagrama" : "No es un anagrama");



	
	}
}
