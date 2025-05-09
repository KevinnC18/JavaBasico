
package calculadoracase;

import java.util.Scanner;


public class CalculadoraCase {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Menu");
        System.out.println("Ingrese + para suma");
        System.out.println("Ingrese - para resta");
        System.out.println("Ingrese * para multiplicacion");
        System.out.println("Ingrese / para division");
        System.out.println("Ingrese % para modulo");
        System.out.println("Para salir digite Q");
        System.out.println("Ingrese su opcion");
            char opcion = entrada.next ().charAt(0);
        
        double num1, num2, resultado;
            System.out.println("Ingrese el primer numero");
            num1 = entrada.nextDouble();
            System.out.println("Ingrese el segundo numero");
            num2 = entrada.nextDouble();
            
        switch(opcion){
            case '+':
                resultado = num1+num2;
                System.out.println("El resultado de la suma es: "+resultado);
                break;
            case '-':
                resultado = num1-num2;
                System.out.println("El resultado de la resta es: "+resultado);
                break;
            case '*':
                resultado = num1*num2;
                System.out.println("El resultado de la multiplicacion es: "+resultado);
                break;
            case '/':
                resultado = num1/num2;
                System.out.println("El resultado de la division es: "+resultado);
                break; 
            case '%':
                resultado = num1%num2;
                System.out.println("El resultado del modulo es: "+resultado);
                break;    
            case 'Q':
                System.out.println("Bye....");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        
    }
    
}
