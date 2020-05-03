import java.lang.System; // Importar la clase System

public class CApGrados{
	
	// Definición de constantes
	final static int limiteInferior = -30;
	final static int limiteSuperior = 100;
	final static int incremento = 6;
	
	public static void main(String[] args) {
		
		// Declaración de variables
		CGrados grados = new CGrados();
		int gradosCentigrados = limiteInferior;
		float gradosFahrenheit = 0;
		
		// Mientras... hacer
		while (gradosCentigrados <= limiteSuperior) {
			// Asignar al objeto grados el valor en grados centígrados
			grados.CentigradosAsignar(gradosCentigrados);
			
			// Obtener del objeto grados los graados fahrenheit
			gradosFahrenheit = grados.FahrenheitObtener();
			
			// Esccribir la siguiente línea de la tabla
			System.out.println(gradosCentigrados + " C" + "\t" + gradosFahrenheit + " F");
			
			// Siguiente valor
			gradosCentigrados += incremento;			
		}
	}
}