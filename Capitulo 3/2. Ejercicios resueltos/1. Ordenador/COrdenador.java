import java.lang.System;

class COrdenador {
	String marca;
	String procesador;
	int peso;
	boolean encendido = false;
	boolean pantalla = false;
	static byte Garantia;

	public void EncenderOrdenador()	{
		if (encendido == true) {
			System.out.println("El ordenador ya está encendido.");
		}
		else {
			encendido = true;
			pantalla = true;
			System.out.println("El ordernador ha sido encendido.");
		}
	}

	public void Estado() {
		System.out.print("\nEl estado del ordenador es el siguiente:");
		System.out.print("\nMarca: " + marca);
		System.out.print("\nProcesador: " + procesador);
		System.out.print("\nPeso: " + peso);

		if (encendido == true) {
			System.out.print("\nEl ordenador está encendido.");
		}
		else {
			System.out.print("\nEl ordernador está apagado.");
		}

		if (pantalla == true) {
			System.out.print("\nLa pantalla está encendida.");
		}
		else {
			System.out.print("\nLa pantalla está apagada.");
		}

		if (Garantia == 1){
			System.out.print("\nLa garantía esta vigente.");
		}
		else {
			System.out.print("\nLa garantía NO esta vigente.");
		}
	}

	public String ObtenerMarca() {
		return marca;
	}

	public void EstablecerMarca(String ma) {
		marca = ma;
	}

	public static void EstablecerGarantia(byte G){
		Garantia = G; // Garantía es una miembro de la clase
	}
}
