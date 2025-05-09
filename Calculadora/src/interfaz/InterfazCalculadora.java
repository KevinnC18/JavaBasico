
package interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mundo.Calculadora;

public class InterfazCalculadora extends JFrame{
    
    // Atributos
    private PanelDatos panelDatos;
    private PanelBotones panelBotones;
    private PanelResultados panelResultados;
    private Calculadora calculadora;
    
    // Metodo constructor
    public InterfazCalculadora(){
        // Diseño
        setTitle("CALCULADORA"); // Poner titulo
        setSize(250, 270); // Ajustar tamaño
        setResizable(true); // Ajustar el tamaño desde la ventana
        setVisible(true); // Mostrar u oultar
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Accion al cerrar
        setLocationRelativeTo(null); // 
        setLayout(new BorderLayout()); // Bordes
        
        // Instanciar - Crear objetos
        panelDatos = new PanelDatos();
        panelBotones = new PanelBotones(this);
        panelResultados = new PanelResultados(this);
        calculadora = new Calculadora();
        
        // Agregar a la ventana principal
        add(panelDatos, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        add(panelResultados, BorderLayout.SOUTH);
    }
    
    // Metodos gemelos
     
    public void sumar(){
        double num1 = Double.parseDouble(panelDatos.getTxtNum1().getText());
        double num2 = Double.parseDouble(panelDatos.getTxtNum2().getText());
        double respuesta = calculadora.sumar(num1, num2);
        panelResultados.settxtResultado(respuesta);
    }
    
    public void restar(){
        double num1 = Double.parseDouble(panelDatos.getTxtNum1().getText());
        double num2 = Double.parseDouble(panelDatos.getTxtNum2().getText());
        double respuesta = calculadora.restar(num1, num2);
        panelResultados.settxtResultado(respuesta);
    }
    
    public void multiplicar(){
        double num1 = Double.parseDouble(panelDatos.getTxtNum1().getText());
        double num2 = Double.parseDouble(panelDatos.getTxtNum2().getText());
        double respuesta = calculadora.mult(num1, num2);
        panelResultados.settxtResultado(respuesta);
    }
    
    public void dividir(){
        try {
        double num1 = Double.parseDouble(panelDatos.getTxtNum1().getText());
        double num2 = Double.parseDouble(panelDatos.getTxtNum2().getText());
        double respuesta = calculadora.dividir(num1, num2);
        panelResultados.settxtResultado(respuesta);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void limpiar(){
        panelDatos.limpiar();
        panelResultados.limpiar();
    }
    
    
    public static void main(String[] args) {
        
        InterfazCalculadora ventanaPrincipal = new InterfazCalculadora();
        ventanaPrincipal.setVisible(true);
        
    }
    
}
