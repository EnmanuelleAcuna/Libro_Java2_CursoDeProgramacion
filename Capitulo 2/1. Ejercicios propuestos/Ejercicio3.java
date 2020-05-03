class Ejercicio3 {
	
	// Método calcular
    public static double calcular(double a, double b, double c) {
        double resultado;
        resultado = ((b * b) - (4 * (a * c))) / (2 * a);
        return resultado;
    }

    public static void main(String[] args) {
        double resultado;
        resultado = calcular(1, 5, 2);
        System.out.println(resultado);
    }
}
