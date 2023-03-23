package Monedas;

public class libraEsterlina extends Monedas{
    
    public libraEsterlina(double valor){
        setNombre("Libras esterlina");
        setValor(valor);
    }

    @Override
    public String convierteAMoneda(double valorAConvertir) {
        return Double.toString(Math.round((valorAConvertir/getValor())*100.0)/100.0);
    }

    @Override
    public String regresaAMxn(double valorAConvertir) {
        return Double.toString(Math.round((valorAConvertir*getValor())*100.0)/100.0);
    }

    @Override
    public String convierteADiferentes(double valorAConvertir, int moneda2) {
        String resultado = convierteAMoneda(valorAConvertir);
        return resultado;
    }
}