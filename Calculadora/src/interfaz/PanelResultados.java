
package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel implements ActionListener {
    
    // Atributos
    private JLabel labResultado;
    private JTextField txtResultado;
    private JLabel labVacio1;
    private JButton butLimpiar;
    private InterfazCalculadora interfazCalculadora;
    
    // Metodo constructor
    public PanelResultados(InterfazCalculadora interfazCalculadora){
        this.interfazCalculadora = interfazCalculadora;
        // Diseño
        TitledBorder borde = BorderFactory.createTitledBorder("Datos");
        setBorder(borde);
        borde.setTitleColor(Color.RED);
        setLayout(new GridLayout(2, 2));
        
        // Instanciar
        labResultado = new JLabel("Resultado");
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        labVacio1 = new JLabel("");
        butLimpiar = new JButton("Limpiar");
        butLimpiar.addActionListener(this);
        
        //Agregar al panel los objetos
        add(labResultado);
        add(txtResultado);
        add(labVacio1);
        add(butLimpiar);
    }
    
    // Otros metodos
    
    public void settxtResultado(double resultado){
        txtResultado.setText("="+ resultado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == butLimpiar){
            interfazCalculadora.limpiar();
        }
    }
    public void limpiar(){
        txtResultado.setText("");
    }
    
}
