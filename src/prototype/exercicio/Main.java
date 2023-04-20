package prototype.exercicio;

public class Main {
    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();
        Ovelha ovelha = new Ovelha();
        Ovelha ovelhaClonada = (Ovelha) animalMaker.getClone(ovelha);

        System.out.println(ovelha);
        System.out.println(ovelhaClonada);
        System.out.println("Ovelha Hashcode: " + System.identityHashCode(System.identityHashCode(ovelha)));
        System.out.println("Ovelha Hashcode: " + System.identityHashCode(System.identityHashCode(ovelhaClonada)));
    }
}
