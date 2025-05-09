
package tiendaderopa;

import java.util.Scanner;


public class TiendaDeRopa {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion, cantidad;
        double totalSinIva=0;
        boolean comprando =true;
        
        System.out.println("Bienvenid@ a la tienda de UNICORNIOS!!!!!!");
        while (comprando){
            System.out.println("Elige el articulo que deseas comprar: ");
            System.out.println("1. Camisa - $20");
            System.out.println("2. Pantalon - $40");
            System.out.println("3. Chaqueta - $60");
            System.out.println("4. Finalizar compra");
            System.out.print("Ingresa tu opcion: ");
            opcion = entrada.nextInt();
            if (opcion >=1 && opcion <=3){
                System.out.print("Ingrese la cantidad que desea comprar: ");
                cantidad = entrada.nextInt();
                if (cantidad<0){
                    System.out.println("Cantidad no valida, debe ingresar un numero positivo");
                    continue;
                }
            }else {
                cantidad =0;
            }
            switch (opcion){
                case 1: //camisa
                    totalSinIva += 20 * cantidad;
                    System.out.println("Has añadido "+cantidad+" camisas al carrito");
                    break;
                case 2: //pantalon
                    totalSinIva += 40 * cantidad;
                    System.out.println("Has añadido "+cantidad+" pantalones al carrito");
                    break;
                case 3: //chaqueta  
                    totalSinIva += 60 * cantidad;
                    System.out.println("Has añadido "+cantidad+" chaquetas al carrito");
                    break;
                case 4: //salir
                    System.out.println("Vuelva pronto");
                    comprando = false;
                    break;
                default:
                    System.out.println("Opcion no valida, animal <3");
            }
        }
        double totalConIva = totalSinIva + (totalSinIva*0.16);
        System.out.println("Gracias por tu compra");
        System.out.println("El total sin iva es: "+totalSinIva);
        System.out.println("El total del iva 16% es: "+totalConIva);
    }
    
}
