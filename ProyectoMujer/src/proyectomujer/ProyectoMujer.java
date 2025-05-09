
package proyectomujer;

import java.util.Scanner;


public class ProyectoMujer {

    
    public static void main(String[] args) {
        //crear un objeto
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el nombre de la mujer: ");
        String nombreMujer = entrada.nextLine();
        System.out.println("Digite la edad de la mujer: ");
        int edadMujer = entrada.nextInt();
        System.out.println("Digite la estatura de la mujer: ");
        float estaturaMujer = entrada.nextFloat();
        
        mujer eresunobjeto = new mujer(nombreMujer,edadMujer,estaturaMujer);
        //llamar un dato
        eresunobjeto.mostrarInfromacion();
        
    }
    
}
