package bridge.teoria;

public class Main {
    public static void main(String[] args) {
        IconWindow ic = new IconWindow();
        ic.setImp(new PMWindowImp());
        ic.drawBorder();
    }
}
