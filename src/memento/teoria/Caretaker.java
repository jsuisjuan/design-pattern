package memento.teoria;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> estados = new Stack<Memento>();
    private Originator o;

    public Caretaker(Originator o) {
        this.o = o;
    }

    public void saveState() {
        estados.push(o.createMemento());
    }

    public void undo() {
        o.setMemento(estados.pop());
    }
}
