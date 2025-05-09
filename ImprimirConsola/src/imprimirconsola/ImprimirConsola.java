
package imprimirconsola;

import java.util.Scanner;


public class ImprimirConsola {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el primer número");
        double numero1 = entrada.nextDouble();
        
        System.out.println("Por favor ingrese el segundo número");
        double numero2 = entrada.nextDouble();
        
        double suma = numero1+numero2;
        System.out.println("El resultado de la suma es: "+suma);
        
         double resta = numero1-numero2;
        System.out.println("El resultado de la resta es: "+resta);
        
         double multi = numero1*numero2;
        System.out.println("El resultado de la multiplicación es: "+multi);
        
         double div = numero1/numero2;
        System.out.println("El resultado de la división es: "+div);
        
    }
    
}
