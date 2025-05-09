
package proyectonovia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        List<Novia> novias = new ArrayList<>();//almacenar datos en una lista
        novias.add(new Novia("Fernanda", 20, "futbol"));
        novias.add(new Novia("Camila", 24, "musica"));
        novias.add(new Novia("Maria", 30, "cine"));
        
        System.out.println("Trabajo hecho por Kevin Smith Correal Chocontá"); 
        System.out.println("ID: 100173678");
        
        int opcion =0;
        while (opcion !=4){
            System.out.println("");
            System.out.println(" === Menú de alquiler de novias === ");
            System.out.println("1. Lista de novias");
            System.out.println("2. Alquiler de novias");
            System.out.println("3. Agregar novias");
            System.out.println("4. Salir");
            System.out.print("Por favor ingrese una opcion (1-4): ");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1: 
                    listarNovias(novias);
                    break;
                case 2:
                    alquilarNovia(novias, entrada);
                    break;
                case 3: 
                    agregarNovia(novias, entrada);
                    break;
                case 4: 
                    System.out.println("Gracias por utilizar nuestros servicios de alquiler, ¡vuelva pronto!");
                    break;
                default:
                    System.out.println("Opcion invalida, por favor intentelo nuevamente");
                    break;
            }
        }
        
    }
    public static void listarNovias(List<Novia> novias){
        System.out.println("Lista de novias disponibles: ");
        for (int i=0; i<novias.size(); i++){
            Novia novia = novias.get(i);
            System.out.println((i+1) +". "+novia.getNombre()+" - "+novia.getEdad()+" años, Hobby: "+novia.getHobby());
            
        }
    }
    public static void alquilarNovia(List<Novia> novias, Scanner entrada){
        System.out.println("Seleccionar una novia para alquilar (1-"+ novias.size()+"): ");
        int seleccion = entrada.nextInt();
        while(seleccion <1 || seleccion > novias.size()){
            System.out.println("Seleccion invalida, intentelo de nuevo");
            seleccion = entrada.nextInt();
            }
        System.out.println("Ingrese la duracion del alquiler en dias: ");
        int duracion =entrada.nextInt();
        Alquiler alquiler = new Alquiler(novias.get(seleccion -1),duracion);
        alquiler.mostrarRecibo();
    }
    public static void agregarNovia(List<Novia> novias, Scanner entrada){
        System.out.print("Ingrese el nombre de la novia: ");
        String nombre = entrada.next();
        System.out.print("Ingrese la edad de la novia: ");
        int edad = entrada.nextInt();
        System.out.print("Ingrese el hobby de la novia: ");
        String hobby = entrada.next();
        novias.add(new Novia(nombre,edad,hobby));
        System.out.println("Novia agregada correctamente!!");
    }
}
