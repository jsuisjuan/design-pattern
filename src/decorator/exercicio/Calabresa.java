package decorator.exercicio;

public class Calabresa extends Pizza{
    public Calabresa(PedirPizza pizza) {
        super(pizza);
    }
    public void informarTipo() {
        System.out.println("Pizza de Calabresa");
    }
    @Override
    public void tipoPizza(){
        super.tipoPizza();
        informarTipo();
    }
}
