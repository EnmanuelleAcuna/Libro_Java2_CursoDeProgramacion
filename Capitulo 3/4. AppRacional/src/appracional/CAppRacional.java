package appracional;

public class CAppRacional {
    public CAppRacional() {
        super();
    }

    public static void main(String[] args) {
        // Punto de entrada a la aplicación
        CAppRacional cAppRacional = new CAppRacional();
        
        CRacional r1, r2;
        
        r1 = new CRacional(); // Crear un objeto CRacionall
        r1.AsignarDatos(2, 5);
        r2 = r1;
        
        r1.AsignarDatos(3, 7);
        r1.VisualizarRacional(); // Se visualiza 3/7
        r2.VisualizarRacional(); // Se visualiza 3/7
        
        CRacional r3;
        r2 = new CRacional(); // Crear un objeto CRacional
        r2.AsignarDatos(2, 5);
        r3 = CRacional.Sumar(r1, r2); // r3 = 3/7 + 2/5
        r3.VisualizarRacional(); // Se visualiza 29/35
    }
}