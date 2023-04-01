package chain_of_responsability.teoria;

public class Client {
    public static void main(String[] args) {
        Widget w = new Widget(null);
        Dialog d = new Dialog(w);

        Button b1 = new Button(d, true);
        Button b2 = new Button(d, false);

        b1.handleHelp();
        b2.handleHelp();
    }
}
