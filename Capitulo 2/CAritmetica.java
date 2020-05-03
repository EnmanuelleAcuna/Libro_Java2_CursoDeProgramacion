class CAritmetica {
	// Operaciones aritmeticas
	// public static void main(String args[]) {
		// double a = 10;
		// float b = 20;
		// int c = 2;
		// int r = 0;
		// r = (int)(7.5 * Math.sqrt(a) - b / c);
		
		// System.out.println(r);
	// }
	
	// Método sumar
	// Parámetros x e y de tipo double
	// Devuelve x + y
	public static double sumar(double x, double y) {
		double resultado = 0;
		resultado = x + y;
		return resultado;
	}
	
	public static void main(String args[]) {
		double a = 10;
		double b = 20;
		double r = 0;
		
		r = sumar(a, b);
		
		System.out.println("Suma = " + r);
	}
}