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

    public abstract String convierte_a_moneda(double valor_a_convertir);

    public abstract String regresa_a_Mxn(double valor_a_convertir);
}