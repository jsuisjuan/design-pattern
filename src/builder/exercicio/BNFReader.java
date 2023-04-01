package builder.exercicio;

public class BNFReader {
    private LinguagemConverter builder;
    public BNFReader(LinguagemConverter builder) {
        this.builder = builder;
    }
    public BNFReader() {
    }
    public void setBuilder(LinguagemConverter novoBuilder) {
        this.builder = novoBuilder;
    }
    public String parserBNF(String expressao) {
        String saida = "";
        int numero1, numero2;
        String[] tokens = expressao.split(" ");
        numero1 = Integer.parseInt(tokens[0]);
        numero2 = Integer.parseInt(tokens[2]);
        System.out.println(numero1 + " " + tokens[1] + " " + numero2);
        for (String t : tokens) {
            switch(t) {
            case "+":
                saida += builder.somar(numero1, numero2);
                break;
            case "*":
                saida += builder.multiplicar(numero1, numero2);
                break;
            }
        }
        return saida;
    }
}
