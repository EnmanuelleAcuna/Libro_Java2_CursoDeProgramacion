class Racionales {
	public static void main(String[] args) {
		CRacional r = new CRacional();
		CRacional r1 = new CRacional(2, 5); //Crear un objeto CRacional y asignar numerado y denominador.
		CRacional r2 = new CRacional(3, 7); //Crear un segundo objeto CRacional.

		r1.VisualizarRacional();
		r2.VisualizarRacional();

		r.Sumar(r1, r2);
		r.Restar(r1, r2);
	}
}
