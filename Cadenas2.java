import java.util.Scanner;

/**
 * Manejo de cadenas
 * @author Rafael Sandoval Castillo
 * @version 1.0
 */

public class Cadenas2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String s = scan.nextLine();

		for (int i = 0; i < s.length(); i++) {
		System.out.println(s.charAt(i));
		}
	
	}
}
