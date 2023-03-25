package state.exercicio;

public class SmartOn extends SmartState{
    @Override
    public void on() {
        System.out.println("aparelho esta ligado");
    }

    @Override
    public void off() {
        System.out.println("aparelho nao esta desligado");
    }
}
