package adapter.exercicio;

public class Main {
    public static void main(String[] args) {
        NovoButton a = new NovoButton(new Adaptee());
        System.out.println(a.request());
    }
}
