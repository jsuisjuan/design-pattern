package state.exercicio;

public class SmartOff extends SmartState {
    @Override
    public void on() {
        System.out.println("aparelho não esta ligado");
    }

    @Override
    public void off() {
        System.out.println("aparelho esta desligado");
    }
}
