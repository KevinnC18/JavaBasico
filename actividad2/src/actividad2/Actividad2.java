
package actividad2;

import java.util.Scanner;


public class Actividad2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
    //Imprimir por consola el nombre del estudiante y el número de identificacion
        System.out.println("Trabajo hecho por Kevin Smith Correal Chocontá"); 
        System.out.println("ID: 100173678");
    //La computadora solicita el nombre al jugador
            System.out.println("Ingresa tu nombre para jugar");
            String nombreJugador = entrada.nextLine();
    //La computadora escoge un número aleatorio entre 1 y 20    
        int numeroSecreto = (int) (Math.random()*20)+1;  
            System.out.println("Intenta adivinar el número secreto entre 1 y 20"); 
        int numeroUsuario = entrada.nextInt(); 
    //La computadora indicará si aacertó correctamente el número secreto o si  el número secreto es mayor o menor
        if (numeroUsuario == numeroSecreto) {
            System.out.println("¡¡Felicidades " + nombreJugador + ", adivinaste el número secreto!!.");
        }else {    
            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor");
            }else { 
                System.out.println("El número secreto es menor.");
            
            }
        System.out.println("Lo siento " + nombreJugador + ", no adivinaste el número secreto, intentalo nuevamente.");
        
        
        }
    }
}
