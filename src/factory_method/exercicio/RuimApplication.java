package factory_method.exercicio;

public class RuimApplication extends Application{
    @Override
    public Desconto definirDesconto() {
        return new RuimDesconto();
    }
}
