package prototype.teoria;

public class PrototypeConcreto1 extends Prototype {
    private String atributo1;
    private String atributo2;
    private String atributo3;

    @Override
    public Prototype clone() {
        System.out.println("clonou " + PrototypeConcreto1.class);
        PrototypeConcreto1 novo =  new PrototypeConcreto1();
        novo.setAtributo1(this.atributo1);
        novo.setAtributo2(this.atributo2);
        novo.setAtributo3(this.atributo3);
        return novo;
    }
    
    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    public String getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(String atributo3) {
        this.atributo3 = atributo3;
    }
}
