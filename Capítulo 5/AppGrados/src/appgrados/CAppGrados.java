package appgrados;

import java.lang.System; // Importar la clase System

public class CAppGrados {
    // Definici�n de constantes
    final static int limiteInferior = -30;
    final static int limiteSuperior = 100;
    final static int Incremento = 6;
            
    public static void main(String[] args) {
        // Declaraci�n de variables
        CGrados Grados = new CGrados();
        int GradosCentigrados = limiteInferior;
        float GradosFahrenheit = 0;
        
        // Mientras... hacer
        while (GradosCentigrados <= limiteSuperior) {
            // Asignar al objeto grados el valor en grados cent�grados
            Grados.AsignarCentigrados(GradosCentigrados);
                                
            // Obtener del objeto grados los graados fahrenheit
            GradosFahrenheit = Grados.ObtenerFahrenheit();
                                
            // Esccribir la siguiente l�nea de la tabla
            System.out.println(GradosCentigrados + " C" + "\t" + GradosFahrenheit + " F");
                                
            // Siguiente valor
            GradosCentigrados += Incremento;                        
        }
    }
}
