
package ejerciciotodoslosjuguetes;

import java.security.DrbgParameters;
import java.util.Random;
import java.util.Scanner;



public class EjercicioTodosLosJuguetes {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random random =  new Random();
        int opcion;
        
        do{
            System.out.println(" ===  MENU DE JUEGOS ====");
            System.out.println("1. Adivina el numero ");
            System.out.println("2. Piedra, papel o tijeras ");
            System.out.println("3. Salir ");
            System.out.println("Elige una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    int numeroAleatorio = random.nextInt(20)+1;
                    int intentos =0;
                    boolean adivinado = false;
                    System.out.println("Bienvenido al juego de adivinar!!");
                    System.out.println("Adivina un numero entre el 1 y 20");
                    while (!adivinado && intentos <5){
                        System.out.println("Ingresa un numero del 1 al 20: ");
                        int numeroUsuario = entrada.nextInt();
                        intentos++;
                        if(numeroUsuario == numeroAleatorio){
                            adivinado = true;
                            System.out.println("Felicidades !! adivinaste el numero!!");
                        }else if ( numeroUsuario< numeroAleatorio ){
                                System.out.println("El numero que buscas es mayor ");
                                System.out.println("Lleva "+intentos+ " intentos");
                            }else {
                            System.out.println("El numero que buscas es menor");
                            System.out.println("Lleva "+intentos+ " intentos");
                        }
                        }
                       if(!adivinado) {
                           System.out.println("Lo siento!! se te agotaron los intentos");
                       } 
                       break;
                case 2:
                    System.out.println("Bienvenido al juego de piedra papel o tijera ");
                    System.out.println("Elije tu opcion: ");
                    System.out.println("1. Piedra ");
                    System.out.println("2. Papel");
                    System.out.println("3. Tijeras");
                    int eleccionusuario = entrada.nextInt();
                    int eleccionComputadora = random.nextInt(3)+1;
                    
                    String opcionUsuario ="";
                    String opcionComputadora ="";
                    switch(eleccionusuario){
                        case 1:
                            opcionUsuario= "Piedra";
                            break;
                        case 2: 
                            opcionUsuario= "Papel";
                            break;
                        case 3: 
                            opcionUsuario= "Tijeras";
                            break;
                        default:
                            System.out.println("Opcion invalida, intentalo de nuevo");
                    }
                    switch(eleccionComputadora){
                        case 1:
                            opcionComputadora= "Piedra";
                            break;
                        case 2: 
                            opcionComputadora= "Papel";
                            break;
                        case 3: 
                            opcionComputadora= "Tijeras";
                            break;
                        default:
                            System.out.println("Opcion invalida, intentalo de nuevo");
                    }
                    System.out.println("Elegiste: "+opcionUsuario);
                    System.out.println("La computadora eligio: "+opcionComputadora );
                    
                    if(eleccionusuario ==eleccionComputadora  ){
                        System.out.println("Empate!!");
                    }else if ((eleccionusuario == 1 && eleccionComputadora ==3) ||
                                (eleccionusuario == 2 && eleccionComputadora ==1) ||
                               (eleccionusuario == 3 && eleccionComputadora ==2)
                            ){
                        System.out.println("Ganaste!!!");
                    }else {
                        System.out.println("Perdiste!!!");
                    }
                    break;
                case 3 : 
                    System.out.println("Hasta la vista baby!!!!");
                    break;
                default: 
                    System.out.println("Opcion invalida!!!!");
                }
           
                
            } while (opcion !=3);
            
    }
    
}
