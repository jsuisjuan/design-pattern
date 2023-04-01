package bridge.exercicio;

public class Radio extends Controle{
    public void ligarRadio() {
        audioEsquerdoOuMono();
        audioDireito();
    }

    public void desligarRadio() {
        desligar();
    }
}
