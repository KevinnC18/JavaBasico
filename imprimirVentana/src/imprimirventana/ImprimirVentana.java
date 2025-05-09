
package imprimirventana;

import javax.swing.JOptionPane;

public class ImprimirVentana {
    
    public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog("Ingresa el primer numero");
        
        int numero1 = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog("Ingresa el segundo numero");
        
        int numero2 = Integer.parseInt(input2);
        
        int suma = numero1+numero2;
        
        JOptionPane.showMessageDialog(null,"La suma es: "+suma);
        
        int resta = numero1-numero2;
        
        JOptionPane.showMessageDialog(null,"La resta es: "+resta);
        
        int multi = numero1*numero2;
        
        JOptionPane.showMessageDialog(null,"La multiplicacion es: "+multi);
        
        int div = numero1/numero2;
        
        JOptionPane.showMessageDialog(null,"La division es: "+div);
        
    }
    
}
