
package actividad4;

import java.util.Random;
import java.util.Scanner;


public class Actividad4 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random random =  new Random();
        int opcion;
            System.out.println("Trabajo hecho por Kevin Smith Correal Chocontá"); 
            System.out.println("ID: 100173678");
            System.out.println("Ingresa tu nombre para jugar");
            String nombreJugador = entrada.nextLine();
        
        do{
            System.out.println(" ===  MENU DE JUEGOS ====");
            System.out.println("1. Juego de palabras ");
            System.out.println("2. Carrera de dados ");
            System.out.println("3. Salir ");
            System.out.println("Elige una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println(" === ¡Bienvenido al Juego de palabras! === ");
                    System.out.println("Debes adivinar la palabra oculta que escogio la computadora.");
                    String[] palabras = {"java", "juego", "programacion", "pantalla", "tecnologia", "trabajo"}; 
                    String palabra = palabras[random.nextInt(palabras.length)]; //lenght se usa para saber la longitud de algo

                char[] respuesta = new char[palabra.length()];
                for (int i = 0; i < respuesta.length; i++) {
                    respuesta[i] = '_';
                }

                int intentos = 10;

                while (intentos > 0) {
                    System.out.println("Palabra a adivinar: " + String.valueOf(respuesta));//se usa para convertir los datos en una cadena
                    System.out.println("Intentos restantes: " + intentos);
                    System.out.print("Ingresa una letra: ");
                    char letra = entrada.next().charAt(0);

                    boolean letraAdivinada = false;
                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) == letra) {
                            respuesta[i] = letra;
                            letraAdivinada = true;
                        }
                    }

                    if (!letraAdivinada) {
                        intentos--;
                        System.out.println("Letra incorrecta. Inténtalo de nuevo.");
                    }

                    if (String.valueOf(respuesta).equals(palabra)) {
                        System.out.println("Palabra a adivinar: "+palabra);
                        System.out.println("¡Felicidades! "+nombreJugador+ " Has adivinado la palabra que escogio la computadora");
                        break;
                    }
                }

                if (intentos == 0) {
                    System.out.println("");
                    System.out.println("Lo siento "+nombreJugador+ " se te acabaron los intentos. La palabra era: " + palabra);
                }
                System.out.println("Muchas gracias por jugar!!!!");
                    System.out.println("");
                break;
                case 2:
                    System.out.println(" === ¡Bienvenido a la Carrera de Dados! === ");
                    System.out.println("Debes presionar Enter para lanzar los dados.");
                    System.out.println("Gana quien tenga mas puntos al final de las 5 rondas");
                    Scanner enter = new Scanner(System.in);    
                    int puntajeUsuario = 0;
                    int puntajePc = 0;
                    int rounds = 5;

                    for (int i = 0; i < rounds; i++) {
                        System.out.println("");
                        System.out.println("Ronda " + (i + 1) + ":");
                        enter.nextLine();

                        int dadoUsuario = random.nextInt(6) + 1;
                        int dadoPc = random.nextInt(6) + 1;

                        System.out.println("Tu dado: " + dadoUsuario);
                        System.out.println("Dado de la computadora: " + dadoPc);

                        if (dadoUsuario > dadoPc) {
                            System.out.println("Ganaste esta ronda!!!!");
                            puntajeUsuario++;
                            System.out.println("Llevas "+puntajeUsuario+ " puntos");
                            System.out.println("La computadora lleva "+puntajePc+ " puntos");
                        } else if (dadoUsuario < dadoPc) {
                            System.out.println("La computadora gana esta ronda.");
                            puntajePc++;
                            System.out.println("La computadora lleva "+puntajePc+ " puntos");
                            System.out.println("Llevas "+puntajeUsuario+ " puntos");
                        } else {
                            System.out.println("Esta ronda es un empate.");
                        }
                    }

                    System.out.println("Resultados finales:");
                    System.out.println("Tu puntaje: " + puntajeUsuario);
                    System.out.println("Puntaje de la computadora: " + puntajePc);

                    if (puntajeUsuario > puntajePc) {
                        System.out.println("Felicidades "+nombreJugador+ " ganaste la Carrera de Dados!!!!");
                    } else if (puntajeUsuario < puntajePc) {
                        System.out.println("Lo siento "+nombreJugador+" la computadora gano la Carrera de Dados!!!");
                    } else {
                        System.out.println("La Carrera de Dados termina en empate.");
                     break;
                } 
                    System.out.println("Muchas gracias por jugar!!!!");
                    System.out.println("");
                break;
                case 3:
                    System.out.println("Muchas gracias por jugar!!!!");
                    break;
                default: 
                    System.out.println("Opcion invalida!!!!");
                }
        }while (opcion !=3);
        
    }
}
    
