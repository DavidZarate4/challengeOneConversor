package Monedas;
public abstract class Monedas{
    private String nombre;
    private double valor;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract String convierteAMoneda(double valorAConvertir);

    public abstract String regresaAMxn(double valorAConvertir);

    public abstract String convierteADiferentes(double valorAConvertir,int moneda2);
}