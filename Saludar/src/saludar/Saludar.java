
package saludar;

import java.util.Scanner;


public class Saludar {

    private String nombre;
    
    public void solicitarNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre: ");
        this.nombre = entrada.nextLine();
    }
    
    public void saludar(){
        System.out.println("Hola "+ this.nombre+ ", bienvenido a la U!!!!");
    }
    
}
