class CCuenta {
	private String nombre;
	private String cuenta;
	private double saldo;
	private double TipoDeInteres;

	// Constructor sin parametros.
	public CCuenta() {
		System.out.println("Objeto CCuenta creado.");
	}

	public CCuenta(String nom, String cue, double sal, double tipo) {
		AsignarNombre(nom);
		AsignarCuenta(cue);
		Ingreso(sal);
		AsignarTipoDeInteres(tipo);
	}

	public void AsignarNombre(String nom) {
		if (nom.length() == 0)
		{
			System.out.println("Error: cadena vacia");
			return;
		}
		nombre = nom;
	}

	public String ObtenerNombre() {
		return nombre;
	}

	public void AsignarCuenta(String cue) {
		if (cue.length() == 0)
		{
			System.out.println("Error: cuenta no valida");
			return;
		}
		cuenta = cue;
	}

	public String ObtenerCuenta() {
		return cuenta;
	}
	
	public double Estado() {
		return saldo;
	}

	public void Ingreso(double cantidad) {
		if (cantidad < 0) {
			System.out.println("Error: cantidad negativa.");
			return;
		}
		saldo = saldo + cantidad;
	}

	public void Reintegro(double cantidad) {
		if (saldo - cantidad < 0) {
			System.out.println("Error: no dispone de saldo.");
			return;	
		}
		saldo = saldo - cantidad;
	}

	public void AsignarTipoDeInteres(double tipo) {
		if (tipo < 0) {
			System.out.println("Error: tipo no valido.");
			return;
		}
		TipoDeInteres = tipo;
	}

	public double ObtenerTipoDeInteres() {
		return TipoDeInteres;
	}
}
