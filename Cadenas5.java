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
		System.out.println("Introduce una subcadena");
		String sub = scan.nextLine();

		if (s.indexOf(sub) != -1) {
		System.out.println("Si esta contenida");
		System.out.println("(posicion " + s.indexOf(sub) + ").");
			
		} else {
		System.out.println("No esta contenida");
		}

	
	}
}
