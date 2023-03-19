package factory_method.exercicio;

public abstract class Application {
    public abstract Desconto definirDesconto();
    public void newDesconto(){
        Desconto d = definirDesconto();
        d.desconto();
    }
}
