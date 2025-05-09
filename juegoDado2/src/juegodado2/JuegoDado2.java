
package juegodado2;


public class JuegoDado2 {

    
    public static void main(String[] args) {
        
        int dado1 = (int) (Math.random()*6)+1;
            System.out.println("El dado del usuario es: " +dado1);
        int dado2 = (int) (Math.random()*6)+1;
            System.out.println("El dado de la computadora es: " +dado2);
            
        if (dado1 > dado2) {
            System.out.println("Gano el usuario");
        } else if (dado1 < dado2) {
            System.out.println("Perdio el usuario");  
        } else{
            System.out.println("Los dados son iguales");
        }    
        
        }
            
    }

