package state.exercicio;

public class SmartCameraOn extends SmartState {
    @Override
    public void on() {
        System.out.println("aparelho esta ligado ou desligado,se sim, camera ligada");
    }

    @Override
    public void off() {
        System.out.println("camera nao esta desligado");
    }
}
