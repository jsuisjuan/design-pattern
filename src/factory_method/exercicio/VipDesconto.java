package factory_method.exercicio;

public class VipDesconto extends Desconto{
    @Override
    public void desconto() {
        System.out.println("desconto de 45%");
    }
}
