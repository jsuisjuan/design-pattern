package prototype.teoria;

public class Main {
    public static void main(String[] args) {
        PrototypeConcreto1 t1 = new PrototypeConcreto1();
        PrototypeConcreto2 t2 = new PrototypeConcreto2();

        fazAlgumaCoisa(t1);
        fazAlgumaCoisa(t2);
    }

    public static void fazAlgumaCoisa(Prototype o) {
        Prototype p = o.clone();
        PrototypeConcreto2 p2 = null;
        PrototypeConcreto1 p1 = null;
        if (p instanceof PrototypeConcreto2) {
            p2 = (PrototypeConcreto2) p;
        } else if (p instanceof PrototypeConcreto1) {
            p1 = (PrototypeConcreto1) p;
        }
        //....
    }
}
