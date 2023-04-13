package template_method.exercicio;

public class Consorcio extends Financiamento {
    @Override
    public void valorTotal(int valor) {
        System.out.println("O valor total do financiamento Consórcio será de R$" + valor + ".");
    }
    @Override
    public void valorParcela(int valor, int meses) {
        System.out.println("O valor das parcelas Consórcio será de x" + meses + " de R$" + (valor/meses) + " por mês.");
    } 
}
