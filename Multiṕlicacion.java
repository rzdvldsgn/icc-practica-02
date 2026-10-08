import java.util.Scanner;

/**
 * Multiplicacion de binarios
 * usa el metodo de shitf and add
 * @author Rafael Sandoval Castillo
 * @version 1.0
 *
 */

public class Suma{
	
	static String shift(int n, int bits){
	String s = "";
	for (int i = bits - 1; i >= 0; i--) {
	s += (n >> i) & 1;
	}
	return s;
	}

	static String add(String a, String b) {
		String res = "";
		int acc = 0;
		for (int i = a.length() - 1; i >= 0; i--) {
			int suma = (a.charAt(i) - '0') + (b.charAt(i) - '0') + acc;
			res = (suma % 2) + res;
			acc = suma / 2;
		}
		return res;
	}
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
	
	System.out.println("MULTIPLICACION\n");
	//Inputs//
	System.out.println("Introduce el primer digito");
			int x = scan.nextInt();
		if (x < -128 || x > 127){
		System.out.println("Numero invalido");
		return;
		}
	
	System.out.println("Introduce el segundo digito");
				int y = scan.nextInt();
			System.out.print("");
		if (y < -128 || y > 127){
		System.out.println("Numero invalido");
		return;
		}
		System.out.println("");
	int z = x * y;

	//Conversion a binario//
	String bin1 = "";
	for (int i = 7; i >= 0; i --) {
		int bit = (x >> i) & 1;
		bin1 += bit;
	}
		System.out.println("Primer digito: \n" + bin1);
	String bin2 = "";
	for (int i = 7; i >= 0; i --) {
		int bit = (y >> i) & 1;
		bin2 += bit;
	}
		System.out.println("Segundo digito: \n" + bin2 + "\n");

	//Operacion//
	if (x * y <= -128 || x * y >= 128){
		System.out.print("Desbordamiento");
		return;
		}

	String res = "00000000";
	for (int i = 0; i < 8; i++) {
		if (((y >> i) & 1) == 1) {
		res = add(res, shift(x << i, 8));
		}
	}

		System.out.println("Resultado: " + res);
		System.out.println("(" + z + ")");

		

	}
}
