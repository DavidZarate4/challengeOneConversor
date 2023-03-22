package Temperaturas;

public class Temperatura{

    public double Fahrenheit_a_Celsius(double f){
        return (f-32)*0.55;
    }

    public double Celsius_a_Fahrenheit(double c){
        return  (c)*(1.8)+32;
    }

    public double Kelvin_a_Celsius(double k){
        return k-273.15;
    }

    public double Celsius_a_Kelvin(double c){
        return c+273.15;
    }

    public double Fahrenheit_a_Kelvin(double f){
        return ((f-32)*(0.55))+273.15;
    }

    public double Kelvin_a_Fahrenheit(double k){
        return ((k-273.15)*(1.8))+32;
    }
    
}