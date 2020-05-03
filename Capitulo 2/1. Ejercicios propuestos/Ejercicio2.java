class Ejercicio2 {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
		int suma;
        double media;
        
        num1 = 11; num2 = 15; num3 = 1; num4 = 3;
		
		// Calcular la suma de los 4 números
        suma = num1 + num2 + num3 + num4;
		
        System.out.println("Suma de los cuatro numeros = " + suma);
        
        // Calcular la media
		media = (double)suma / 4;
		
        System.out.println("La media de la suma es = " + media);
    }
}
