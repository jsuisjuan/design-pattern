package state.exercicio;

public class Main {
    public static void main(String[] args){
        SmartHub sh = new SmartHub();
        sh.on();
        sh.setState(new SmartCameraOff());
        sh.on();
    }
}
