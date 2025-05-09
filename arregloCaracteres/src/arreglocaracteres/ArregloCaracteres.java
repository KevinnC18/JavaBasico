
package arreglocaracteres;

import java.util.Scanner;


public class ArregloCaracteres {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = entrada .nextLine();
        
        char[] caracteres = new char[frase.length()];
        for(int i=0; i<frase.length(); i++){
            caracteres [i]=frase.charAt(i);//charAt separa los caracteres     
        }    
        System.out.println("Los cracteres de la frase son: ");
        for (char c:caracteres){
            System.out.print(c+", ");
        }
    }
    
}
