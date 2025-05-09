
package dowhileadivinanumero;

import java.util.Scanner;

import java.util.Random;


public class DoWhileAdivinaNumero {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        
        //genera el numero aleatorio
        int numeroSecreto = aleatorio.nextInt(15)+1;
        int intentos  =0;
        int maxIntentos =3;
        boolean adivinado = false;
        
       do{
           //solicitar el numero al jugador
           System.out.println("Intenta adivinar el numero entre 1 y 15: Tienes 3 intentos");
           int numeroJugador = entrada.nextInt();
           
           //Incrementar intentos
           intentos ++;
           
           if (numeroSecreto == numeroJugador){
               System.out.println("Felcidades has adivinado el numero!!!!");
               adivinado = true;
           } else if (numeroJugador < numeroSecreto) {
               System.out.println("El numero secreto es mayor!!");
               System.out.println(" Llevas "+ intentos + " intentos");
           } else {
               System.out.println("El numero secreto es menor!!");
               System.out.println(" Llevas "+ intentos + " intentos");
           }
        }while(intentos < maxIntentos && !adivinado);
       
        if(!adivinado){
            System.out.println("Lo siento no has adivinado el numero, la respuesta era "+numeroSecreto);
        }
                       
    }
    
}
