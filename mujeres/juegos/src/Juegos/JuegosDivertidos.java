
package Juegos;

import java.util.Random;
import java.util.Scanner;


public class JuegosDivertidos {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        
        while (true){
            System.out.println("Bienvenido a estos juegos: ");
            System.out.println("1. Juageo de palabras aleatorias");
            System.out.println("2. Carrera de dados");
            System.out.println("3. Salir");
            System.out.println("Elige una opcion: ");
            int opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    String[] palabras = {"perro","taza","zoologico","automovil","jardin"};
                    String palabra = palabras[random.nextInt(palabras.length)];
                    int intentos =7;
                    StringBuilder palabraGuiones = new StringBuilder();
                    for(int i=1; i<palabra.length();i++);{
                        palabraGuiones.append("_");
                }
                    while (intentos>0){
                        System.out.println("Palabra a adivinar: "+palabraGuiones);
                        System.out.println("Intentos restantes: "+intentos);
                        System.out.print("Ingrese una letra: ");
                        char letra = entrada.next().charAt(0);
                        
                        boolean acierto = false;
                        for(int i=0; i<palabra.length();i++){
                            if (palabra.charAt(i) == letra &&palabraGuiones.charAt(i*2)=='_' ){
                                palabraGuiones.setCharAt(i*2, letra);
                                acierto = true;
                            }
                    }
                        if(!acierto){
                            intentos--;
                        }
                        if (palabraGuiones.indexOf("_")== -1){
                            System.out.println("Felicidades!!! has adivinado la palabra!!");}
                            break;
                        }
                    if (intentos ==0){
                        System.out.println("Lo siento, te quedaste sin intentos");
                    }
                    break;
                case 2:
                    int rondas =3;
                    int jugadorPuntos =0;
                    int pcPuntos =0;
                    for(int i =1; i<= rondas; i++){
                        System.out.println("Ronda No. "+i+" :");
                        int jugdorDado = random.nextInt(6)+1;
                        int pcDado = random.nextInt(6)+1;
                        
                        System.out.println("El dado del jugador es: "+jugdorDado);
                        System.out.println("El dado de la computadora es: "+pcDado);
                        if (jugdorDado < pcDado){
                            jugadorPuntos++;
                            System.out.println("Ganaste esta ronda");
                        }else if (pcDado < jugdorDado){
                            pcPuntos++;
                            System.out.println("La computadora gana esta ronda");
                        }else {
                            System.out.println("Esta ronda es un empate");
                        }
                            

                    }
                    System.out.println("Puntaje final: ");
                    System.out.println("Tus puntos: "+jugadorPuntos);
                    System.out.println("La computadora tiene "+pcPuntos+" puntos");
                    if (jugadorPuntos>pcPuntos){
                        System.out.println("Felicidades!!! ganaste el juego");
                    }else if (pcPuntos>jugadorPuntos){
                        System.out.println("Lo siento!!! la computadora gano el juego");
                    }else {
                        System.out.println("Esto termina en empate");
                    } 
                    
                case 3:
                    System.out.println("Gracias por jugar");
                    return;
                default:
                    System.out.println("Opcion invalida!!!, aprende a leer JAJAJAJ");
            }
        }
        
    }
    
}
