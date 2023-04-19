package adapter.teoria;

public class Adapter extends Adaptee implements Target {

    @Override
    public String request() {
        return this.specificRequest();
    }
    
}
