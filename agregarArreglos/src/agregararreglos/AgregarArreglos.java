
package agregararreglos;

import java.util.Scanner;


public class AgregarArreglos {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //defina el tamaño del arreglo
        System.out.println("Ingrese el numero de elementos que desea para el arreglo");
        int size = entrada.nextInt();
        //crear el arreglo
        int [] numeros = new int[size];
        //capturar los datos que nos de el usuario
        System.out.println("Ingrese los elementos del arreglo");
        for (int i=0; i<size; i++){
            System.out.println("Elemento No. "+(i+1));
            numeros[i]=entrada.nextInt();
        }
        //variable temporal (for each)
        System.out.println("Los elementos del arreglo son: ");
        for(int num:numeros){
            System.out.print(+num+", ");
        }
    }
    
}
