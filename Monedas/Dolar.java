package Monedas;

public class Dolar extends Monedas{
    
    public Dolar(double valor){
        setNombre("Dolares");
        setValor(valor);
    }

    @Override
    public String convierte_a_moneda(double valor_a_convertir) {
        return Double.toString(Math.round((valor_a_convertir/getValor())*100.0)/100.0);
    }

    @Override
    public String regresa_a_Mxn(double valor_a_convertir) {
        return Double.toString(Math.round((valor_a_convertir*getValor())*100.0)/100.0);
    }
}