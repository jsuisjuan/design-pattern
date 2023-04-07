package memento.teoria;

public class Originator {
    private String state = "";

    public Memento createMemento() {
        System.out.println("salvou estado = " + state);
        return new Memento(state);
    }

    public void setMemento(Memento m) {
        System.out.println("recuperou estado = " + m.getState());
        this.state = m.getState();
    }

    public void moveLeft() {
        this.state += "<-";
    }

    public void moveRight() {
        this.state += "->";
    }
}
