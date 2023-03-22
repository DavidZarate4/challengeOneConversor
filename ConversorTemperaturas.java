import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.NumberFormatException;

public class ConversorTemperaturas extends JFrame implements ActionListener {

    JButton JBConvertir, JBRegresar;
    JTextField JTtemperatura_a_convertir;
    String[] listaOpciones = { "de ºF a ºC", "de ºC a ºF", "de K a ºC", "de ºC a K", "de ºF a K", "de K a ºF" };
    JComboBox<String> JCtemperatura;

    public ConversorTemperaturas() {
        this.setTitle("Conversor de temperaturas");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        Iniciar();
    }

    public void Iniciar() {

        JLabel pesosMexicanos = new JLabel("Temperatura:");
        pesosMexicanos.setBounds(25, 25, 125, 20);

        JLabel opciones = new JLabel("Opciones:");
        opciones.setBounds(50, 75, 100, 20);

        JTtemperatura_a_convertir = new JTextField("");
        JTtemperatura_a_convertir.setBounds(150, 25, 100, 20);

        JCtemperatura = new JComboBox<>(listaOpciones);
        JCtemperatura.setBounds(125, 75, 150, 20);

        JBConvertir = new JButton("Convertir");
        JBConvertir.setBounds(50, 125, 100, 20);
        JBConvertir.addActionListener(this);

        JBRegresar = new JButton("Regresar");
        JBRegresar.setBounds(175, 125, 100, 20);
        JBRegresar.addActionListener(this);

        this.add(pesosMexicanos);
        this.add(opciones);
        this.add(JTtemperatura_a_convertir);
        this.add(JCtemperatura);
        this.add(JBConvertir);
        this.add(JBRegresar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Convertir") {
            try {
                double cantidadAConvertir = Double.parseDouble(JTtemperatura_a_convertir.getText());
                funciones_temperaturas valora = new funciones_temperaturas();
                valora.Valorar_opciones((JCtemperatura.getSelectedIndex()), cantidadAConvertir);
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
