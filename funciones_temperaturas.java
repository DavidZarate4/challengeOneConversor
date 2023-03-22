import javax.swing.JOptionPane;

import Temperaturas.Temperatura;

public class funciones_temperaturas{
    
    public void Valorar_opciones(int object, double valor){
        Temperatura temperatura = new Temperatura();
        switch (object) {
            case 0:
            JOptionPane.showMessageDialog(null,valor + "ºF son: " + temperatura.Fahrenheit_a_Celsius(valor) + "ºC");
                break;
            case 1:
            JOptionPane.showMessageDialog(null,valor + "ºC son: " + temperatura.Celsius_a_Fahrenheit(valor) + "ºF");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,valor + "K son: " + temperatura.Kelvin_a_Celsius(valor) + "ºC");
            break;
            case 3:
            JOptionPane.showMessageDialog(null,valor + "ºC son: " + temperatura.Celsius_a_Kelvin(valor) + "K");
            break;
            case 4:
            JOptionPane.showMessageDialog(null,valor + "ºF son: " + temperatura.Fahrenheit_a_Kelvin(valor) + "K");
            break;
            case 5:
            JOptionPane.showMessageDialog(null,valor + "K son: " + temperatura.Kelvin_a_Fahrenheit(valor) + "ºF");
            break;
        
            default:
            JOptionPane.showMessageDialog(null,"No marco ninguna opcion posible");
                break;
        }
    }
}