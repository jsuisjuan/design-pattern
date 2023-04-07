package memento.teoria;

public class Main {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker ct = new Caretaker(o);

        ct.saveState();
        o.moveLeft();
        o.moveLeft();
        o.moveRight();
        ct.saveState();
        o.moveLeft();
        o.moveRight();
        ct.saveState();
        o.moveRight();
        ct.undo();
        ct.undo();
        ct.undo();
    }
}
