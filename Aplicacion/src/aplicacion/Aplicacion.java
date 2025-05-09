
package aplicacion;


public class Aplicacion {

    public static void main(String[] args) {
        
        EntradaUsuario entradita = new EntradaUsuario();
        Operador operacion = new Operador();
        
        int numero = entradita.obtenerNumero();
        operacion.duplicarYMostrar(numero);
        
    }
    
}
