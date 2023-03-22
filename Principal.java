import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.mostrarMensaje();
    }

    public void mostrarMensaje(){
        String[] opciones = { "Conversor de Divisas", "Conversor de temperaturas" };
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione cual conversor quiere:",
                "Conversores", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == "Conversor de Divisas") {
            ConversorDivisas ventanaDivisas = new ConversorDivisas();
            ventanaDivisas.setVisible(true);
        } else if (seleccion == "Conversor de temperaturas") {
            ConversorTemperaturas ventanaTemperaturas = new ConversorTemperaturas();
            ventanaTemperaturas.setVisible(true);
        } else if(seleccion == null){
            System.exit(0);
        }
    }
}