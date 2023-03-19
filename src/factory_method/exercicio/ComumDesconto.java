package factory_method.exercicio;

public class ComumDesconto extends Desconto{
    @Override
    public void desconto() {
        System.out.println("desconto de 15%");
    }
}
