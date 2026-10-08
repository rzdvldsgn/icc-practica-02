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
		String s = scan.nextLine();

		String inv = "";

		for (int i = s.length() - 1; i >= 0; i --) {
			inv += s.charAt(i);
		}
		System.out.println("Inversa: " + inv);

	
	}
}
