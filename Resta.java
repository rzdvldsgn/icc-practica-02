import java.util.Scanner;

/**
 * Suma de binarios
 * @author Rafael Sandoval Castillo
 * @version 1.0
 *
 */

public class Suma{
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
	
	System.out.println("RESTA\n");
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
	int z = x + y;

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
	if (x + y <= -128 || x + y >= 128){
		System.out.print("Desbordamiento");
		return;
	}
	String res = "";
	int acc = 0;
	for (int i = 7; i >= 0; i--) {
	  int a = bin1.charAt(i) - '0';
	  int b = bin2.charAt(i) - '0';
	  int suma = a + b + acc;
	  res = (suma % 2) + res;
	  acc = suma / 2;

	}
		System.out.println("Resultado: " + res);
		System.out.println("(" + z + ")");

		

	}
}
