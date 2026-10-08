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
		System.out.println("Introduce un character");
		String intro = scan.nextLine();

		if (intro.length() != 1) {
		System.out.println("Solo un caracter");
		return;	
		}

		char c = intro.charAt(0);
		int veces = 0;
		for (int i = 0; i < s.length(); i++) {
		  if (s.charAt(i) == c) veces ++;
		}

		System.out.println(c + " aparece " + veces + " veces");
	
	}
}
