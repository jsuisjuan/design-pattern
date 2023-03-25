package decorator.exercicio;

public class Mostarda extends Condimento{
    public Mostarda(PedirCondimento condimento) {
        super((Condimento) condimento);
    }
    public void informarTipo() {
        System.out.println("Condimento de Mostarda");
    }
    @Override
    public void tipoCondimento(){
        super.tipoCondimento();
        informarTipo();
    }
}
