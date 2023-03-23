package Temperaturas;
public class funcionesTemperaturas {

    public double ValorarOpciones(int temperatura1, int temperatura2, double valor) {
        Temperatura temperatura = new Temperatura();
        double resultado = 0.0;
        if (temperatura1 == 0 && temperatura2 == 1) {
            resultado = temperatura.FahrenheitACelsius(valor);
        } else if (temperatura1 == 0 && temperatura2 == 2) {
            resultado = temperatura.FahrenheitAKelvin(valor);
        } else if (temperatura1 == 1 && temperatura2 == 0) {
            resultado = temperatura.CelsiusAFahrenheit(valor);
        } else if (temperatura1 == 1 && temperatura2 == 2) {
            resultado = temperatura.CelsiusAKelvin(valor);
        } else if (temperatura1 == 2 && temperatura2 == 0) {
            resultado = temperatura.KelvinAFahrenheit(valor);
        } else if (temperatura1 == 2 && temperatura2 == 1) {
            resultado = temperatura.KelvinACelsius(valor);
        }

        return resultado;
    }
}