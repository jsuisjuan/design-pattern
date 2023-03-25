package state.exercicio;

public class SmartHub {
    private SmartState state = new SmartOn();

    public void on() {
        state.on();
    }
    public void off() {
        state.off();
    }

    public SmartState getState() {
        return state;
    }
    public void setState(SmartState state) {
        this.state = state;
    }
}
