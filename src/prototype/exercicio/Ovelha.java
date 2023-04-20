package prototype.exercicio;

public class Ovelha implements Animal{
    public Ovelha() {
        System.out.println("Ovelha foi criada");
    }
    
    @Override
    public Animal copia() {
        System.out.println("Ovelha está sendo criada");
        Ovelha ovelha = null;
        try {
            ovelha = (Ovelha) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return ovelha;
    }

    public String toString() {
        return "Venha ca ovelha";
    }
}
