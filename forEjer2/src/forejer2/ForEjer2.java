
package forejer2;


public class ForEjer2 {

    
    public static void main(String[] args) {
        
        int sumaPares = 0;
        for (int i=2; i<=100; i+=2){
            sumaPares += i;
        }
        System.out.println("La suma de los primeros cincuenta numero pares es: " +sumaPares);
    }
    
}
