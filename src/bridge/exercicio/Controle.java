package bridge.exercicio;

public abstract class Controle {
    private ControleImp imp;

    public void video() {
        imp.ligar();
        System.out.println("video: ON");
    }

    public void audioEsquerdoOuMono() {
        imp.ligar();
        System.out.println("áudio esquerdo estéreo || áudio mono: ON");
    }

    public void audioDireito() {
        imp.ligar();
        System.out.println("áudio direito estéreo: ON");
    }

    public void componentes() {
        imp.ligar();
        System.out.println("dispositivo externo: ON");
    }

    public void desligar() {
        imp.desligar();
    }

    public ControleImp getImp() {
        return imp;
    }

    public void setImp(ControleImp imp) {
        this.imp = imp;
    }
}
