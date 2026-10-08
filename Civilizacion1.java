/**
 * Clase civilizacion
 * @author Rafael Sandoval Castillo
 * @version 2.0
 *
 */

public class Civilizacion {
	//Atributos//
	private String nombre;
	private String era;
	private int poblacion;
	private int alimento;
	private int madera;
	private int oro;

	//Constructor//
	public Civilizacion(String nombre, String era, int poblacion, int alimento, int madera, int oro) {
		this.nombre = nombre;
		this.era = era;
		this.poblacion = poblacion;
		this.alimento = alimento;
		this.madera = madera;
		this.oro = oro;
	}

	//Getters//
	public String getNombre() {return nombre;}
	public String getEra() {return era;}
	public int getPoblacion() {return poblacion;}
	public int getAlimento() {return alimento;}
	public int getMadera() {return madera;}
	public int getOro() {return oro;}

	//Setters//
	public void setAlimento(int alimento) {
	  if (alimento >= 0) this.alimento = alimento;
	}
	public void setMadera(int madera) {
	  if (madera >= 0) this.madera = madera;
	}
	public void setOro(int oro) {
	  if (oro >= 0) this.oro = oro;
	}

	//Metodos//
	
	//Recursos//
	public void masAlimento(int cantidad) {
		if (cantidad > 0) setAlimento(getAlimento() + cantidad);
	}
	public void masMadera(int cantidad) {
		if (cantidad > 0) setMadera(getMadera() + cantidad);
	}
	public void masOro(int cantidad) {
		if (cantidad > 0) setOro(getOro() + cantidad);
	}
	
	//Aldeano//
	int costo = 50;
	public boolean civAldeano() {
		if (getAlimento() >= costo) {
		setAlimento(getAlimento() - costo);
		poblacion++;
		return true;
		}
		return false;
	}

	//Init//
	
	public void civInit() {
		System.out.println(nombre);
		System.out.println(era);
		System.out.println("Poblacion: " + poblacion);
		System.out.println("Alimento: " + alimento);
		System.out.println("Madera: " + madera);
		System.out.println("Oro: " + oro);
		System.out.println("");


	}

	public static void main (String[] args) {
		Civilizacion vikingos = new Civilizacion("Vikingos", "Era Vikinga", 8, 140, 100, 60);
		Civilizacion vikingos1 = new Civilizacion("Vikingos", "Era Vikinga", 14, 200, 240, 120);

		System.out.println("ANTES");
		vikingos.civInit();
		vikingos1.civInit();
		vikingos.masOro(40);
		vikingos.masMadera(20);
		vikingos.masAlimento(70);
		System.out.println("Crear aldeano" + vikingos.civAldeano());

		vikingos1.masOro(10);
		vikingos1.masMadera(90);
		System.out.println("Crear Aldeano" + vikingos1.civAldeano());

		System.out.println("DESPUES");
		vikingos.civInit();
		vikingos1.civInit();



	
	}

}
