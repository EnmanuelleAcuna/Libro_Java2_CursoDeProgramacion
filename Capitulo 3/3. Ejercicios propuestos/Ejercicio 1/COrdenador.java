class COrdenador {
	String marca;
	String procesador;
	int peso;
	boolean encendido = false;
	boolean pantalla = false;
	boolean aplicacion = false;
	
	public String ObtenerMarca() {
		return marca;
	}

	public void EstablecerMarca(String ma) {
		marca = ma;
	}
	
	public String ObtenerProcesador() {
		return procesador;
	}
	
	public void EstablecerProcesador(String proc) {
		procesador = proc;
	}
	
	public int ObtenerPeso() {
		return peso;
	}
	
	public void EstablecerPeso(int pe) {
		peso = pe;
	}

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

	public void ApagarOrdenador() {
		if (encendido == false) {
			System.out.println("El ordenador ya está apagado.");
		}
		else {
			encendido = false;
			pantalla = false;
			aplicacion = false;
			System.out.println("El ordernador ha sido apagado.");
		}
	}

	public void EncenderPantalla() {
		if (pantalla == true) {
			System.out.println("La pantalla ya está encendida.");
		}
		else {
			pantalla = true;
			System.out.println("La pantalla ha sido encendida.");
		}
	}

	public void ApagarPantalla() {
		if (pantalla == false) {
			System.out.println("La pantalla ya está apagada.");
		}
		else {
			pantalla = false;
			System.out.println("La pantalla ha sido apagada.");
		}
	}

	public void CargarAplicacion() {
		if (aplicacion == true) {
			System.out.println("La aplicacion ya se está ejecutando.");
		}
		else {
			aplicacion = true;
			System.out.println("La aplicacion ha sido iniciada.");
		}
	}

	public void Estado() {
		System.out.print("\nEl estado del ordenador es el siguiente:");
		System.out.print("\nMarca: " + marca);
		System.out.print("\nProcesador: " + procesador);
		System.out.print("\nPeso: " + peso + " kg.");
		
		if (aplicacion == true)	{
			System.out.print("\nLa aplicacion ha sido cargada y se está ejecutando.");
		}
		else {
			System.out.print("\nLa aplicacion no se está ejecutando.");
		}

		if (pantalla == true) {
			System.out.print("\nLa pantalla está encendida.");
		}
		else {
			System.out.print("\nLa pantalla está apagada.");
		}

		if (encendido == true) {
			System.out.print("\nEl ordenador está encendido.");
		}
		else {
			System.out.print("\nEl ordernador está apagado.");
		}
	}
}
