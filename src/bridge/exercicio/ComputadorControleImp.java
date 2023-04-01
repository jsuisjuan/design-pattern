package bridge.exercicio;

public class ComputadorControleImp extends ControleImp {
    private int etapas = 1;
    
    @Override
    public void ligar() {
        System.out.println("ligando computador...[" + etapas + "/4]");
        etapas++;
    }

    @Override
    public void desligar() {
        System.out.println("desligando computador...");
    }
}
