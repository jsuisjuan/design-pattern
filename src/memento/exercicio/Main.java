package memento.exercicio;

public class Main {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker ct = new Caretaker(o);

        ct.saveState();
        o.aCommand();
        o.aCommand();
        o.bCommand();
        ct.saveState();
        o.aCommand();
        o.bCommand();
        o.bCommand();
        ct.saveState();
        ct.undo();
        ct.undo();
        ct.undo();
    }
}
