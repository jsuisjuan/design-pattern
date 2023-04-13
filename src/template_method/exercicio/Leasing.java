package template_method.exercicio;

public class Leasing extends Financiamento {
    @Override
    public void valorTotal(int valor) {
        System.out.println("O valor total do financiamento Leasing será de R$" + valor + ".");
    }
    @Override
    public void valorParcela(int valor, int meses) {
        System.out.println("O valor das parcelas Leasing será de x" + meses + " de R$" + (valor/meses)*1.18 + " por mês.");
    } 
}
