package template_method.teoria;

public abstract class AbstractClass {
    public void templateMethod() {
        primitiveOperator1();
        primitiveOperator2();
    }
    public abstract void primitiveOperator1();
    public abstract void primitiveOperator2();
}
