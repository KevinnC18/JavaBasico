
package aplicacion;

import java.util.Scanner;


public class EntradaUsuario {
    
    public int obtenerNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor digite un numero: ");
        int numero = entrada.nextInt();
        return numero;
    }
    
}
