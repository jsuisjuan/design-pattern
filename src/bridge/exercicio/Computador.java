package bridge.exercicio;

public class Computador extends Controle {
    public void ligarComputador() {
        audioEsquerdoOuMono();
        audioDireito();
        video();
        componentes();
    }

    public void desligarComputador() {
        desligar();
    }
}
