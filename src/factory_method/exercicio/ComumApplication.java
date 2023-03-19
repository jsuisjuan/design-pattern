package factory_method.exercicio;

public class ComumApplication extends Application{
    @Override
    public Desconto definirDesconto() {
        return new ComumDesconto();
    }
}
