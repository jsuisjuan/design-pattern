package decorator.exercicio;

public class Condimento extends PedirCondimento{
    private PedirCondimento condimento;
    public Condimento(Condimento condimento) {
        this.condimento = condimento;
    }
    @Override
    public void tipoCondimento() {
        condimento.tipoCondimento();
    }
}
