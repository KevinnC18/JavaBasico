
package ejerciciocondicional2;

import java.util.Scanner;


public class EjercicioCondicional2 {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
            System.out.println("Por favor digite un numero entero: ");
        int numero = entrada.nextInt();
            
        if (numero>0){
            System.out.println("El numero ingresado es positivo");
        
        }else if (numero<0){
            System.out.println("El numero ingresado es negativo");   
        }else{
            System.out.println("El numero ingresado es 0");
        }
    }
}