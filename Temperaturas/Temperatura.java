package Temperaturas;

public class Temperatura{

    public double FahrenheitACelsius(double f){
        return (f-32)*0.55;
    }

    public double CelsiusAFahrenheit(double c){
        return  (c)*(1.8)+32;
    }

    public double KelvinACelsius(double k){
        return k-273.15;
    }

    public double CelsiusAKelvin(double c){
        return c+273.15;
    }

    public double FahrenheitAKelvin(double f){
        return ((f-32)*(0.55))+273.15;
    }

    public double KelvinAFahrenheit(double k){
        return ((k-273.15)*(1.8))+32;
    }
    
}