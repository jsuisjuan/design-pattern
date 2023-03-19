package factory_method.exercicio;

public class VipApplication extends Application{
    @Override
    public Desconto definirDesconto() {
        return new VipDesconto();
    }
}
