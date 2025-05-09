
package adivinaelnumero;

import java.util.Scanner;


public class AdivinaElNumero {

    
    public static void main(String[] args) {
        
        System.out.println("Mi nombre es: Kevin Smith Correal Chocontá");
        System.out.println("Mi documento es: 100173678");
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("Por favor digite su nombre");
        String nombreJugador = entrada.nextLine();
                
        int numeroSecreto = (int) (Math.random()*20)+1;
        System.out.println("Hola, "+nombreJugador+" digita un numero entre 1 y 20"); 
        int numeroJugador = entrada.nextInt();
        
        if (numeroSecreto == numeroJugador) {
            System.out.println("Felicidades, "+nombreJugador+" adivinaste el numero");
        } else if (numeroSecreto > numeroJugador ) {
            System.out.println("Lo siento, "+nombreJugador+" el numero secreto era mayor");
        } else {
            System.out.println("Lo siento, "+nombreJugador+" el numero secreto era menor");
                }
        System.out.println("El numero secreto era: "+numeroSecreto);
    }
    
}
