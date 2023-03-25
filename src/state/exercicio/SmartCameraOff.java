package state.exercicio;

public class SmartCameraOff extends SmartState {
    @Override
    public void on() {
        System.out.println("camera esta desligada");
    }

    @Override
    public void off() {
        System.out.println("aparelho esta desligado");
    }
}
