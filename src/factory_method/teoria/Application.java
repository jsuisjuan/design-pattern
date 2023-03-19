package factory_method.teoria;

public abstract class Application {
    public abstract Document createDocument();
    public void newDocument(){
        Document d = createDocument();
        d.open();
    }
}
