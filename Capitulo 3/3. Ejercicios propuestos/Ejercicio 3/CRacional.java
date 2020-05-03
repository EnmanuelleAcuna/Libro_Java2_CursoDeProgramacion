class CRacional {
	private int Numerador, Denominador, ResultadoNum, ResultadoDen;

	public CRacional(){};

	public CRacional(int Num, int Den) {
		AsignarDatos(Num, Den);
	}

	public void AsignarDatos(int num, int den) {
		Numerador = num;

		if (den == 0) den = 1;

		Denominador = den;
	}

	public void VisualizarRacional() {
		System.out.println(Numerador + "/" + Denominador);
	}

	public void Sumar(CRacional a, CRacional b) {
		ResultadoNum = ((a.Numerador * b.Denominador) + (b.Numerador * a.Denominador));
		ResultadoDen = (a.Denominador * b.Denominador);
		System.out.println(ResultadoNum + "/" + ResultadoDen);
	}

	public void Restar(CRacional a, CRacional b) {
		ResultadoNum = ((a.Numerador * b.Denominador) - (b.Numerador * a.Denominador));
		ResultadoDen = (a.Denominador * b.Denominador);
		System.out.println(ResultadoNum + "/" + ResultadoDen);
	}
}
