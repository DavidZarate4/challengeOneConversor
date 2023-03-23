import javax.swing.JOptionPane;

import Temperaturas.Temperatura;

public class funcionesTemperaturas{
    
    public void ValorarOpciones(int object, double valor){
        Temperatura temperatura = new Temperatura();
        switch (object) {
            case 0:
            JOptionPane.showMessageDialog(null,valor + "ºF son: " + temperatura.FahrenheitACelsius(valor) + "ºC");
                break;
            case 1:
            JOptionPane.showMessageDialog(null,valor + "ºC son: " + temperatura.CelsiusAFahrenheit(valor) + "ºF");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,valor + "K son: " + temperatura.KelvinACelsius(valor) + "ºC");
            break;
            case 3:
            JOptionPane.showMessageDialog(null,valor + "ºC son: " + temperatura.CelsiusAKelvin(valor) + "K");
            break;
            case 4:
            JOptionPane.showMessageDialog(null,valor + "ºF son: " + temperatura.FahrenheitAKelvin(valor) + "K");
            break;
            case 5:
            JOptionPane.showMessageDialog(null,valor + "K son: " + temperatura.KelvinAFahrenheit(valor) + "ºF");
            break;
        
            default:
            JOptionPane.showMessageDialog(null,"No marco ninguna opcion posible");
                break;
        }
    }
}