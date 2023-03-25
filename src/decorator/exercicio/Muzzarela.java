package decorator.exercicio;

public class Muzzarela extends Pizza{
    public Muzzarela(PedirPizza pizza) {
        super(pizza);
    }
    public void informarTipo() {
        System.out.println("Pizza de Muzzarela");
    }
    @Override
    public void tipoPizza(){
        super.tipoPizza();
        informarTipo();
    }
}
