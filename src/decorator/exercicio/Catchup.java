package decorator.exercicio;

public class Catchup extends Condimento{
    public Catchup(PedirCondimento condimento) {
        super((Condimento) condimento);
    }
    public void informarTipo() {
        System.out.println("Condimento de Catchup");
    }
    @Override
    public void tipoCondimento(){
        super.tipoCondimento();
        informarTipo();
    }
}
