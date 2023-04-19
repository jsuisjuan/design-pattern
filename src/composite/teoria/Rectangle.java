package composite.teoria;

import java.util.List;

public class Rectangle extends Graphic {
    @Override
    public void add(Graphic g) {}

    @Override
    public void remove(Graphic g) {}

    @Override
    public List<Graphic> getChilds() {
        return null;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }  
}
