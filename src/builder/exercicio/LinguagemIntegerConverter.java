package builder.exercicio;

public class LinguagemIntegerConverter extends LinguagemConverter {
    @Override
    public String somar(int numero1, int numero2) {
       return numero1+" + "+numero2+" = "+(numero1+numero2);
    }

    @Override
    public String multiplicar(int numero1, int numero2) {
        return numero1+" * "+numero2+" = "+(numero1*numero2);
    }
}
