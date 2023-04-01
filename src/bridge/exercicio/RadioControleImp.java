package bridge.exercicio;

public class RadioControleImp extends ControleImp {
    private int etapas = 1;

    @Override
    public void ligar() {
        System.out.println("ligando rádio...[" + etapas + "/2]");
        etapas++;
    }

    @Override
    public void desligar() {
        System.out.println("desligando rádio...");
    }
}