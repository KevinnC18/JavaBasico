
package while2;

import java.util.Scanner;


public class While2 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        String password ="secreto";
        String passwordUser;
        int intentosRestantes =3;
        
        System.out.println("Bienvenido por favor ingrese su contraseña");
        
        while (intentosRestantes>0){
            passwordUser = entrada.nextLine();
            if(passwordUser.equals(password)){
                System.out.println("Contraseña correcta, bienvenido!!!!"); 
                break;
            }else{
                intentosRestantes --;
                System.out.println("Contraseña incorrecta, intentos restantes: "+intentosRestantes);
                if (intentosRestantes>0)
                    System.out.println("Intentalo nuevamente");
                }   
            }
        if (intentosRestantes == 0){
            System.out.println("Se agotaron los intentos, ACCESO DENEGADO!!!");
        }
        }
        
}
