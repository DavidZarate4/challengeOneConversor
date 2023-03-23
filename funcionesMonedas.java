import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import Monedas.Dolar;
import Monedas.Euro;
import Monedas.libra_esterlina;
import Monedas.Yen;
import Monedas.Won;
import Monedas.Monedas;

public class funcionesMonedas {

    Collection<Monedas> listaMonedas = new ArrayList<>();
    int tipoMoneda;

    // Ponemos el cambio de pesos mexicanos a la monedad coorespondiente
    public void establecer_cambio() {
        double[] lista_cambio = { 18.61, 19.69, 22.62, 7.22, 70.06 };
        Monedas dolar = new Dolar(lista_cambio[0]);
        Monedas euro = new Euro(lista_cambio[1]);
        Monedas libra = new libra_esterlina(lista_cambio[2]);
        Monedas yen = new Yen(lista_cambio[3]);
        Monedas won = new Won(lista_cambio[4]);

        listaMonedas.add(dolar);
        listaMonedas.add(euro);
        listaMonedas.add(libra);
        listaMonedas.add(yen);
        listaMonedas.add(won);
    }

    // Vemos que quiere hacer el usuario y dependiendo de eso se hace la operacion
    // que se quiera
    public void Valorar_opciones(int object, double valor) {
        establecer_cambio();
        boolean control;
        Monedas conversion;

        // Comporamos el numero que corresponde a las conversiones si se convierte de
        // pesos a otra moneda es true y si es de otra moneda a pesos es false
        if (object == 0 || object == 2 || object == 4 || object == 6 || object == 8) {
            control = true;
        } else {
            control = false;
        }

        // Vemos que tipo de moneda se va a usar para la conversion
        if (object == 0 || object == 1) {
            this.tipoMoneda = 0;
        } else if (object == 2 || object == 3) {
            this.tipoMoneda = 1;
        } else if (object == 4 || object == 5) {
            this.tipoMoneda = 2;
        } else if (object == 6 || object == 7) {
            this.tipoMoneda = 3;
        } else if (object == 8 || object == 9) {
            this.tipoMoneda = 4;
        }

        // Establecemos el tipo de moneda
        conversion = ((ArrayList<Monedas>) listaMonedas).get(this.tipoMoneda);

        // Dependiendo de que tipo de moneda y que opcion fue hara una operacion u otra
        if (!control) {
            JOptionPane.showMessageDialog(null, "Tienes: $" + (conversion.regresa_a_Mxn(valor)) + " Pesos mexicanos");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Tienes: $" + (conversion.convierte_a_moneda(valor)) + " " + conversion.getNombre());
        }
    }
}