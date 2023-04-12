package template_method.teoria;

public class Main {
    public static void main(String[] args) {
        AbstractClass ac = new ConcreteClass();
        ac.templateMethod();
        ac = new ConcreteClass2();
        ac.templateMethod();
    }
}
