
package interfaz;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel {
    
    // Atributos
    private JLabel labNum1;
    private JTextField txtNum1;
    
    private JLabel labNum2;
    private JTextField txtNum2;
    
    // Metodo constructor
    public PanelDatos(){
        // Diseño
        TitledBorder borde = BorderFactory.createTitledBorder("Datos");
        setBorder(borde);
        borde.setTitleColor(Color.RED);
        setLayout(new GridLayout(2, 2));
    // Instanciar
    labNum1 = new JLabel("Número 1: ");
    txtNum1 = new JTextField();
    
    labNum2 = new JLabel("Número 2: ");
    txtNum2 = new JTextField();
        
    //Agregar al panel los objetos
    add(labNum1);
    add(txtNum1);
    add(labNum2);
    add(txtNum2);
    }
    
    // Otros metodos

    public JTextField getTxtNum1() {
        return txtNum1;
    }

    public void setTxtNum1(JTextField txtNum1) {
        this.txtNum1 = txtNum1;
    }

    public JTextField getTxtNum2() {
        return txtNum2;
    }

    public void setTxtNum2(JTextField txtNum2) {
        this.txtNum2 = txtNum2;
    }
    
    public void limpiar(){
        txtNum1.setText("");
        txtNum2.setText("");
    }
}
