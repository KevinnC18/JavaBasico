
package mundo;

public class Calculadora {
    
    public double sumar(double num1, double num2){
        return num1 + num2;
    }
    
    public double restar(double num1, double num2){
        return num1 - num2;
    }
    
    public double mult(double num1, double num2){
        return num1 * num2;
    }
    
    public double dividir(double num1, double num2) throws Exception{ // Metodo "peligroso", usa excepciones
        if(num2 != 0){
            return num1 / num2;
        }
        throw new Exception("La división por 0 no es posible, cambie el número 2 por otro número");
    }
    
    
}
