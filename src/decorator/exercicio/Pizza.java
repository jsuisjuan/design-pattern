package decorator.exercicio;

public class Pizza extends PedirPizza{
    private PedirPizza pizza;
    public Pizza(PedirPizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public void tipoPizza() {
        pizza.tipoPizza();
    }
}
