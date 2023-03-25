package decorator.exercicio;

public class Maionese extends Condimento{
    public Maionese(PedirCondimento condimento) {
        super((Condimento) condimento);
    }
    public void informarTipo() {
        System.out.println("Condimento de Maionese");
    }
    @Override
    public void tipoCondimento(){
        super.tipoCondimento();
        informarTipo();
    }
}
