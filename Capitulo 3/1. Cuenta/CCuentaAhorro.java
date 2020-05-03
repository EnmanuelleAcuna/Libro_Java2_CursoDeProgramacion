class CCuentaAhorro extends CCuenta {
	//Atributos
	private double CuotaMantenimiento;

	//Metodos
	public CCuentaAhorro(){} //Constructor sin parametros 

	public CCuentaAhorro(String nom, String cue, double sal, double tipo, double mant) {
		super(nom, cue, sal, tipo); //Invoca al constructor CCuenta, esto es, al de la clase base
		AsignarCuotaMant(mant); //Inicia CuotaMantenimiento
	}

	public void AsignarCuotaMant(double cantidad) {
		if (cantidad < 0) {
			System.out.println("Error: cantidad negativa.");
			return;
		}
		CuotaMantenimiento = cantidad;
	}

	public double ObtenerCuotaMant() {
		return CuotaMantenimiento;
	}

	public void Reintegro(double cantidad) {
		double saldo = Estado();
		double TipoDeInteres = ObtenerTipoDeInteres();

		if (TipoDeInteres >= 3.5) {
			if (saldo - cantidad < 1500) {
				System.out.println("Error: no dispone de esa cantidad.");
				return;
			}
		}
		super.Reintegro(cantidad); //Metodo reintegro de la clase base, tambien llamada superclase.
	}
}
