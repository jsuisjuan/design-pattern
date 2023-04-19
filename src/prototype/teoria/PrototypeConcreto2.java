package prototype.teoria;

public class PrototypeConcreto2 extends Prototype {

    @Override
    public Prototype clone() {
        System.out.println("clonou " + PrototypeConcreto2.class);
        return new PrototypeConcreto2();
    }
    
}
