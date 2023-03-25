package decorator.exercicio;

public class PedidoPizza extends PedirPizza {
    @Override
    public void tipoPizza() {
        System.out.println("Pizza padrao");
    }
}
