import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Temperaturas.funcionesTemperaturas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.NumberFormatException;

public class ConversorTemperaturas extends JFrame implements ActionListener {

    JButton JBConvertir, JBRegresar;
    JTextField JtTemperaturaAConvertir, JtCantidadConvertida;
    String[] listaOpciones = { "Fahrenheit", "Celsius", "Kelvin"};
    JComboBox<String> JCOpciones1, JCOpciones2;

    public ConversorTemperaturas() {
        this.setTitle("Conversor de temperaturas");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        Iniciar();
    }

    public void Iniciar() {

        JCOpciones1 = new JComboBox<>(listaOpciones);
        JCOpciones1.setBounds(25, 25, 130, 20);

        JCOpciones2 = new JComboBox<>(listaOpciones);
        JCOpciones2.setBounds(25, 75, 130, 20);

        JLabel JL1 = new JLabel("v");
        JL1.setBounds(50, 50, 100, 20);

        JtTemperaturaAConvertir = new JTextField("");
        JtTemperaturaAConvertir.setBounds(175, 25, 150, 20);

        JtCantidadConvertida = new JTextField("");
        JtCantidadConvertida.setBounds(175, 75, 150, 20);
        JtCantidadConvertida.setEditable(false);

        JBConvertir = new JButton("Convertir");
        JBConvertir.setBounds(25, 125, 100, 20);
        JBConvertir.addActionListener(this);

        JBRegresar = new JButton("Regresar");
        JBRegresar.setBounds(150, 125, 100, 20);
        JBRegresar.addActionListener(this);

        this.add(JCOpciones1);
        this.add(JCOpciones2);
        this.add(JL1);
        this.add(JtTemperaturaAConvertir);
        this.add(JtCantidadConvertida);
        this.add(JBConvertir);
        this.add(JBRegresar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand() == "Convertir") {
            if (JCOpciones1.getSelectedIndex() != JCOpciones2.getSelectedIndex()) {            
                    try {
                        double cantidadAConvertir = Double.parseDouble(JtTemperaturaAConvertir.getText());
                        funcionesTemperaturas valora = new funcionesTemperaturas();
                        JtCantidadConvertida.setText(Double.toString(valora.ValorarOpciones(JCOpciones1.getSelectedIndex(),JCOpciones2.getSelectedIndex(), cantidadAConvertir)));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Valor no valido");
                    }
            } else {
                JOptionPane.showMessageDialog(null, "El tipo de temperatura no puede ser el mismo");
            }
        }else{
            this.setVisible(false);
            Principal ventPrincipal = new Principal();
            ventPrincipal.mostrarMensaje();
        }

    }
}
