package observer.teoria;

public class ConcreteObserver extends Observer{
    private ConcreteSubject cs;
    public ConcreteObserver(ConcreteSubject cs){
        this.cs = cs;
        cs.attach(this);
    }
    @Override
    public void update(){
        System.out.println("Observer notificado - Estado = " + cs.getState());
    }
}
