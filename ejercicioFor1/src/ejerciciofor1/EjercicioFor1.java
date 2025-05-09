
package ejerciciofor1;

import java.util.Scanner;


public class EjercicioFor1 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite el valor incial");
        int inicial = entrada.nextInt();
            System.out.println("Digite el valor final");
        int vfinal = entrada.nextInt();
        
        for(int i=inicial; i<=vfinal; i++){
            System.out.println("El valor es "+i);
        }
    }
    
}
