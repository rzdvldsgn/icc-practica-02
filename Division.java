import java.util.Scanner;

/**
 * Division de Binarios
 *
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

	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
	
	System.out.println("DIVISION\n");
	//Inputs//
	System.out.println("Introduce el Dividendo");
			int x = scan.nextInt();
		if (x < -128 || x > 127){
		System.out.println("Numero invalido");
		return;
		}
	
	System.out.println("Introduce el Divisor");
				int y = scan.nextInt();
			System.out.print("");
		if (y < -128 || y > 127){
		System.out.println("Numero invalido");
		return;
		}
		if (y == 0){
		System.out.println("Indeterminado");
		return;
		}
		System.out.println("");
	int z = x % y;

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
	if (x * y <= -128 || x % y >= 128){
		System.out.print("Desbordamiento");
		return;
		}
	int div = x < 0 ? -x : x;
	int divsr = y < 0 ? -y : y;
	int coc = 0;
	int residuo = 0;

	for (int i = 7; i >= 0; i --) {
		residuo = (residuo << 1) | ((div >> i) & 1);
		if (residuo >= divsr) {
		residuo = residuo - divsr;
		coc = coc | (1 << i);
		}
	}

	if ((x < 0) != (y <0)) coc = -coc;
	if (x < 0) residuo = - residuo;

	System.out.println("Resultado: " + shift(coc, 8));
	System.out.println("Residuo: " + shift(residuo, 8));
		System.out.println("(" + coc + ")");
		System.out.println("(" + residuo + ")");


	}


		

}
