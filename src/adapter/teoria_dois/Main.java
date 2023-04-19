package adapter.teoria_dois;

public class Main {
    public static void main(String[] args) {
        Adapter a = new Adapter(new Adaptee());
        System.out.println(a.request());
    }
}
