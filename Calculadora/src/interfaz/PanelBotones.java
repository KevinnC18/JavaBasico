
package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel implements ActionListener {
    
    // Atributos
    private JButton butSumar;
    private JButton butRestar;
    private JButton butMult;
    private JButton butDivision;
    private InterfazCalculadora interfazCalculadora;
    
    // Metodo constructor
    public PanelBotones(InterfazCalculadora interfazCalculadora){
        this.interfazCalculadora = interfazCalculadora;
                
        // Diseño
        TitledBorder borde = BorderFactory.createTitledBorder("Datos");
        setBorder(borde);
        borde.setTitleColor(Color.RED);
        setLayout(new GridLayout(2, 2));
        
        // Instanciar
        butSumar = new JButton("Sumar");
        butSumar.addActionListener(this);
        
        butRestar = new JButton("Restar");
        butRestar.addActionListener(this);
        
        butMult = new JButton("Multiplicar");
        butMult.addActionListener(this);
        
        butDivision = new JButton("Division");
        butDivision.addActionListener(this);
        
        //Agregar al panel los objetos
        add(butSumar);
        add(butRestar);
        add(butMult);
        add(butDivision);
    }
    
    // Otros metodos
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // con actionPerformed se sabe el origen del 
        if(e.getSource() == butSumar){
            interfazCalculadora.sumar();
        } 
        else if(e.getSource() == butRestar){
            interfazCalculadora.restar();
        }
        else if(e.getSource() == butMult){
            interfazCalculadora.multiplicar();
        }
        else if(e.getSource() == butDivision){
            interfazCalculadora.dividir();
        }
    }
}
