package adapter.exercicio;

public class NovoButton implements ActionListener {
    private Adaptee adaptee;

    public NovoButton(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        return this.adaptee.onClick();
    }   
}
