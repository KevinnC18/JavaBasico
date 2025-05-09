
package juegodado;


public class JuegoDado {

  
    public static void main(String[] args) {
      
        int eleccionUsuario = (int) (Math.random()*6)+1;
            System.out.println("El numero aleatorio del usuario es: " +eleccionUsuario);
        int eleccionComputadora = (int) (Math.random()*6)+1;
            System.out.println("La eleccion de la computadora es: " +eleccionComputadora);
        if (eleccionUsuario == eleccionComputadora) {  
            System.out.println("Empate!!");
            
        } else if (eleccionUsuario>eleccionComputadora){
            System.out.println("Ganaste!!");
        }else {
            System.out.println("Perdiste!!");
        }
    }
    
}