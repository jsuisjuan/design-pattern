package bridge.exercicio;

public class TelevisaoControleImp extends ControleImp {
    private int etapas = 1;

    @Override
    public void ligar() {
        System.out.println("ligando televisão..." + "[" + etapas + "/3]");
        etapas++;
    }

    @Override
    public void desligar() {
        System.out.println("televisão desligando...");
    }
}
