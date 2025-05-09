
package ejerciciocondicional3;

import java.util.Scanner;


public class EjercicioCondicional3 {

    
    public static void main(String[] args) {
        
        Scanner hola = new Scanner(System.in); 
            System.out.println("Por favor ingrese la calificacion: ");
            
        float nota = hola.nextFloat();
        
        if (nota >= 0.0f && nota<= 5.0f){
            if (nota >=3.0f) {
                System.out.println("Has aprobado el curso");
            }else {
                System.out.println("Has reprobado el curso");
            }
        }else {
                System.out.println("Lo siento, has ingresado un numero equivocado");
        
        }
    }
}
