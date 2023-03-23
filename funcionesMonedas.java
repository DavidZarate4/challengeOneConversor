import java.util.ArrayList;
import java.util.Collection;

import Monedas.Dolar;
import Monedas.Euro;
import Monedas.libraEsterlina;
import Monedas.Yen;
import Monedas.Won;
import Monedas.Monedas;

public class funcionesMonedas {

    Collection<Monedas> listaMonedas = new ArrayList<>();

    // Ponemos el cambio de pesos mexicanos a la monedad coorespondiente
    public void establecerCambio() {
        //El cambio es del 22/03/2023 a las 10:16pm
        double[] lista_cambio = { 18.55, 20.22, 22.84, 7.04, 68.91 };
        Monedas dolar = new Dolar(lista_cambio[0]);
        Monedas euro = new Euro(lista_cambio[1]);
        Monedas libra = new libraEsterlina(lista_cambio[2]);
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
    public String ValorarOpciones(int moneda1, int moneda2, double valor) {
        establecerCambio();
        Monedas moneda01, moneda02;
        double valorEnPesos = 0;
        String resultado = "";
        // Pasamos el valor a pesos mexicanos para las operaciones
        if (moneda1 != 5) {
            moneda01 = ((ArrayList<Monedas>) listaMonedas).get(moneda1);
            valorEnPesos = Double.parseDouble(moneda01.regresaAMxn(valor));
        } else {
            valorEnPesos = valor;
        }
        // Ve si va a ser una operacion con pesos mexicanos y decide que operacion va a
        // ser dependiendo de eso
        if (moneda1 != 5 && moneda2 != 5) {
            moneda02 = ((ArrayList<Monedas>) listaMonedas).get(moneda2);
            resultado = moneda02.convierteADiferentes(valorEnPesos, moneda2);
        } else if (moneda1 == 5 && moneda2 != 5) {
            moneda02 = ((ArrayList<Monedas>) listaMonedas).get(moneda2);
            resultado = moneda02.convierteAMoneda(valorEnPesos);
        } else if (moneda2 == 5 && moneda1 != 5) {
            resultado = Double.toString(valorEnPesos);
        }
        return resultado;
    }
}