package iterator.teoria;

public class Main {
    public static void main(String[] args) {
        AbstractList lista = new ListaReversa();
        lista.appent(10);
        lista.appent(20);
        lista.appent(30);
        for (Object object : lista) {
            System.out.println(object);
        }
    }
}
