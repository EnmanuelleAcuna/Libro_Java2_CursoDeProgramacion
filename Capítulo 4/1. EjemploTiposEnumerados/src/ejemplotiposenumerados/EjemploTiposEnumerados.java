/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotiposenumerados;

/*
 * @author Enmanuelle Acuña
 */
public class EjemploTiposEnumerados {
    enum día_semana {lunes, martes, miercoles, jueves, viernes, sábado, domingo}
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        día_semana día = día_semana.lunes;
        
        if (día != día_semana.sábado && día!= día_semana.domingo){
            System.out.println(día); //Escibe lunes.
        }
    }
}
