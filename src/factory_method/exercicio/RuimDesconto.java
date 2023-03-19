package factory_method.exercicio;

public class RuimDesconto extends Desconto{
    @Override
    public void desconto() {
        System.out.println("desconto de 5%");
    }
}
