package memento.exercicio;

import memento.exercicio.command.Invoker;

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

    public void aCommand() {
        this.state = Invoker.invoke("A");
    }

    public void bCommand() {
        this.state += Invoker.invoke("B");
    }
}
