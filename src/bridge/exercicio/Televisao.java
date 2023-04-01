package bridge.exercicio;

public class Televisao extends Controle {
    public void ligarTelevisao() {
        audioEsquerdoOuMono();
        audioDireito();
        video();
    }
    
    public void desligarTelevisao() {
        desligar();
    }
}
