
package ejerciciocase1;

import java.util.Scanner;


public class EjercicioCase1 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int opcion;
        
        System.out.println("Menu");
        System.out.println("Digite 1 para esta opcion");
        System.out.println("Digite 2 para esta opcion");
        System.out.println("Digite 3 para esta opcion");
        System.out.println("Digite 4 para salir");
        System.out.println("Ingrese la opcion deseada");
        
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Has seleccionado la opcion 1");
                break;
            case 2:
                System.out.println("Has seleccionado la opcion 2");
                break;
            case 3:
                System.out.println("Has seleccionado la opcion 3");
                break; 
            case 4:
                System.out.println("Chao bye bye");
                break;    
            default: 
                System.out.println("Opcion no valida");
                break;
        }
    }
    
}
