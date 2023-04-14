package iterator.exercicio;

public class Main {
    public static void main(String[] args) {
        AbstractList lista = new ListaOrdenada();
        lista.appent(10);
        lista.appent(20);
        lista.appent(30);
        lista.appent(60);
        lista.appent(23);
        for (Object object : lista) {
            System.out.println(object);
        }
    }
}
