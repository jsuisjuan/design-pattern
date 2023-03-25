package decorator.exercicio;

public class PedidoCondimento extends PedirCondimento{
    @Override
    public void tipoCondimento() {
        System.out.println("Condimento padrao");
    }
}
