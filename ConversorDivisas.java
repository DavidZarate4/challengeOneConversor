import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.NumberFormatException;

public class ConversorDivisas extends JFrame implements ActionListener {

    JButton JBConvertir, JBRegresar;
    JTextField JTcantidadAConvertir;
    String[] listaOpciones = { "Pesos a Dolares", "Dolares a Pesos", "Pesos a Euros", "Euros a Pesos",
            "Pesos a Libras", "Libras a Pesos", "Pesos a Yen", "Yen a Pesos", "Pesos a Won", "Won a Pesos" };
    JComboBox<String> JCmonedas;

    public ConversorDivisas() {
        this.setTitle("Conversor de divisas");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        Iniciar();
    }

    public void Iniciar() {

        JLabel pesosMexicanos = new JLabel("Cantidad a convertir:");
        pesosMexicanos.setBounds(25, 25, 125, 20);

        JLabel opciones = new JLabel("Opciones:");
        opciones.setBounds(50, 75, 100, 20);

        JTcantidadAConvertir = new JTextField("");
        JTcantidadAConvertir.setBounds(150, 25, 100, 20);

        JCmonedas = new JComboBox<>(listaOpciones);
        JCmonedas.setBounds(125, 75, 150, 20);

        JBConvertir = new JButton("Convertir");
        JBConvertir.setBounds(50, 125, 100, 20);
        JBConvertir.addActionListener(this);

        JBRegresar = new JButton("Regresar");
        JBRegresar.setBounds(175, 125, 100, 20);
        JBRegresar.addActionListener(this);

        this.add(pesosMexicanos);
        this.add(opciones);
        this.add(JTcantidadAConvertir);
        this.add(JCmonedas);
        this.add(JBConvertir);
        this.add(JBRegresar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand() == "Convertir"){
            try {
                double cantidadAConvertir = Double.parseDouble(JTcantidadAConvertir.getText());
                funcionesMonedas valora = new funcionesMonedas();
                valora.Valorar_opciones((JCmonedas.getSelectedIndex()), cantidadAConvertir);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Valor no valido");
            }
        }else{
            this.setVisible(false);
            Principal ventPrincipal = new Principal();
            ventPrincipal.mostrarMensaje();
        }
        

    }
}