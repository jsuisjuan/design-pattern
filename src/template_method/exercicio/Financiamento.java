package template_method.exercicio;

public abstract class Financiamento {
    public void templateMethod(int valor, int meses) {
        valorTotal(valor);
        valorParcela(valor, meses);
    }
    public abstract void valorTotal(int valor);
    public abstract void valorParcela(int valor, int meses);
    public void templateMethod(float valor, float parcela) {
    }
}
