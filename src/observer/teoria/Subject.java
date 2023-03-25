package observer.teoria;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();
    public void attach(Observer o){
        this.observers.add(o);
    }
    public void detach(Observer o){
        this.observers.remove(o);
    }
    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update();
        }
    }
}
