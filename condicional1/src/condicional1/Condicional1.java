
package condicional1;

import java.util.Scanner;


public class Condicional1 {

    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
            System.out.println("Por favor digite el primer numero");
        int num1 = entrada.nextInt();
        
            System.out.println("Por favor digite el segundo numero");
        int num2 = entrada.nextInt();
        
        if (num1 > num2){
            System.out.println("El numero 1 es mayor que el numero 2");
        }else{    
            System.out.println("El numero 1 es menor que el numero 2");   
        }
    }
    
}
