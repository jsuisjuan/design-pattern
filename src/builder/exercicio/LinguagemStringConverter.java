package builder.exercicio;

public class LinguagemStringConverter extends LinguagemConverter {
    @Override
    public String somar(int numero1, int numero2) {
        return numero1+" + "+numero2+" = "+numero1+""+numero2;
    }

    @Override
    public String multiplicar(int numero1, int numero2) {
        String texto = "";
        for (int i = 1; i <= numero2; i++) {
            texto += numero1;
        }
        return numero1+" * "+numero2+" = " + texto;
    }
}
