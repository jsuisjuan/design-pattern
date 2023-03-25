package decorator.exercicio;

public class Pepperoni extends Pizza{
    public Pepperoni(PedirPizza pizza) {
        super(pizza);
    }
    public void informarTipo() {
        System.out.println("Pizza de Pepperoni");
    }
    @Override
    public void tipoPizza(){
        super.tipoPizza();
        informarTipo();
    }
}
