
package juegopiedrapapeltijera;

import java.util.Scanner;


public class JuegoPiedraPapelTijera {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Elige (1) para piedra, (2) para papel o (3) para tijera");
            int eleccionUsuario = entrada.nextInt();
            int eleccionComputadora = (int) (Math.random()*3)+1;
            System.out.println("La eleccion del computador es: " +eleccionComputadora);
        if (eleccionUsuario == eleccionComputadora) {  
            System.out.println("Empate!!");
            
        } else if ( eleccionUsuario ==1 && eleccionComputadora == 3 || 
                    eleccionUsuario ==2 && eleccionComputadora == 1 ||
                    eleccionUsuario ==3 && eleccionComputadora == 2) {
            System.out.println("Ganaste!!");
        }else {
            System.out.println("Perdiste!!");
        }
        
    }
    
}
