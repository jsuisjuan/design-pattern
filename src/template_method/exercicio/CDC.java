package template_method.exercicio;

public class CDC extends Financiamento {
    @Override
    public void valorTotal(int valor) {
        System.out.println("O valor total do financiamento CDC será de R$" + valor + ".");
    }
    @Override
    public void valorParcela(int valor, int meses) {
        System.out.println("O valor das parcelas CDC será de x" + meses + " de R$" + (valor/meses)*1.029 + " por mês.");
    } 
}
